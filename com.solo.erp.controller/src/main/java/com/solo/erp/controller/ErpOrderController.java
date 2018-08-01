package com.solo.erp.controller;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.bean.CashierViewBean;
import com.solo.erp.common.bean.OrderDetailBean;
import com.solo.erp.common.dto.request.OrderApplyRequest;
import com.solo.erp.common.dto.request.OrderConfirmRequest;
import com.solo.erp.common.dto.request.OrderInfoQueryRequest;
import com.solo.erp.common.dto.response.BaseDetailViewResponse;
import com.solo.erp.common.dto.response.BaseQueryPageResponse;
import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.dto.response.OrderGenResponse;
import com.solo.erp.common.enums.EnumOrderStatus;
import com.solo.erp.common.enums.EnumPayType;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.enums.EnumScoreType;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.DateUtils;
import com.solo.erp.common.utils.ProductParseUtil;
import com.solo.erp.common.utils.SnowflakeIdWorker;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.dao.model.ErpOrderInfo;
import com.solo.erp.dao.model.ErpProductInfo;
import com.solo.erp.dao.model.ErpVipInfo;
import com.solo.erp.manager.*;
import com.solo.erp.manager.bo.LoginUserBO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 订单相关接口
 */
@RestController
@RequestMapping("/order")
public class ErpOrderController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(ErpOrderController.class);

    @Autowired
    IErpOrderManager orderManager;
    @Autowired
    IErpVipInfoManager vipInfoManager;
    @Autowired
    IErpVipScoreInfoManager erpVipScoreInfoManager;
    @Autowired
    IErpInventoryManager erpInventoryManager;
    @Autowired
    IErpOrderDetailManager erpOrderDetailManager;
    @Autowired
    IErpCashierManager erpCashierManager;
    @Autowired
    SnowflakeIdWorker snowflakeIdWorker;
    @Autowired
    IErpProductInfoManager erpProductInfoManager;

    private final int SCORE_EXCHANGE_RATE = 100;

    @GetMapping(value = "/generate_id")
    public OrderGenResponse generateId() {
        OrderGenResponse response = new OrderGenResponse();
        StringBuffer orderNo = new StringBuffer();
        try {
            orderNo.append(this.getSessionLoginUser().getStaffNo())
                    .append(DateUtils.getCurrentDateTime());
        } catch (ParseException e) {
            throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "订单号生成错误");
        }
        response.setOrderNo(String.valueOf(snowflakeIdWorker.nextId()));
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage(EnumRespCode.SUCCESS.getMsg());
        return response;
    }

    @RequestMapping(value = "/cashier/sn/{id}", method = RequestMethod.GET)
    @ResponseBody
    public BaseDetailViewResponse cashierByid(@PathVariable("id") String id) {
        BaseDetailViewResponse response = new BaseDetailViewResponse();
        CashierViewBean bean = erpCashierManager.getByProductSn(id);
        response.setData(bean);
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage(EnumRespCode.SUCCESS.getMsg());
        return response;
    }

    /**
     * 根据订单号获取订单明细
     *
     * @param orderNo
     * @return
     */
    @RequestMapping(value = "/details/{orderNo}", method = RequestMethod.GET)
    @ResponseBody
    public BaseDetailViewResponse getByID(@PathVariable("orderNo") String orderNo) {
        BaseDetailViewResponse resp = new BaseDetailViewResponse();
        List<ErpOrderDetail> info = erpOrderDetailManager.selectByOrderNo(orderNo);
        resp.setData(info);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("获取明细成功");
        return resp;
    }

    /**
     * 根据查询条件分页查询订单信息
     *
     * @param req
     * @param result
     * @return
     */
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public BaseQueryPageResponse<ErpOrderInfo> query(@RequestBody @Valid OrderInfoQueryRequest req, final BindingResult result) {
        checkError(result);
        BaseQueryPageResponse resp = new BaseQueryPageResponse();
        PageInfo<ErpOrderInfo> page = orderManager.selectPage(req);
        BeanUtils.copyProperties(page, resp);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("查询成功");
        return resp;
    }

    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse apply(@RequestBody @Valid OrderApplyRequest request, final BindingResult result) {
        checkError(result);
        OrderGenResponse orderRespDTO = new OrderGenResponse();
        LoginUserBO staff = this.getSessionLoginUser();
        //订单信息
        ErpOrderInfo orderInfo = new ErpOrderInfo();
        orderInfo.setShopId(staff.getShopId());
        orderInfo.setStaffId(staff.getId());
        orderInfo.setStaffName(staff.getName());
        orderInfo.setOrderNo(request.getOrderNo());
        orderInfo.setOrderStatus(EnumOrderStatus.WAITING_PAY.getCode());
        orderInfo.setPayType(EnumPayType.CASH.getCode());
        orderInfo.setPayAmount(BigDecimal.ZERO);
        orderInfo.setPayScore(BigDecimal.ZERO);
        orderInfo.setOrderScore(BigDecimal.ZERO);
        orderInfo.setIsRefund(false);
        orderInfo.setIsInvoice(false);
        orderInfo.setOrderDate(new Date());
        orderInfo.setGmtCreate(new Date());
        orderInfo.setGmtModified(new Date());
        List<ErpOrderDetail> details = new ArrayList<>();
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (OrderDetailBean bean : request.getList()) {
            ErpOrderDetail orderDetail = new ErpOrderDetail();
            String productSn = bean.getProductSn();
            orderDetail.setOrderNo(orderInfo.getOrderNo());
            orderDetail.setOrderDate(new Date());
            orderDetail.setGmtCreate(new Date());
            orderDetail.setGmtModified(new Date());
            orderDetail.setNum(bean.getCount());
            orderDetail.setProductSn(productSn);
            orderDetail.setProductNo(ProductParseUtil.parseProductNo(productSn));
            orderDetail.setColor(ProductParseUtil.parseColor(productSn));
            orderDetail.setSize(ProductParseUtil.parseSize(productSn));
            ErpProductInfo productInfo = erpProductInfoManager.selectByProductNo(orderDetail.getProductNo());
            if (productInfo == null) {
                throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "编号为：" + bean.getProductSn() + "商品信息不存在");
            }
            orderDetail.setProductName(productInfo.getProductName());
            orderDetail.setRealPrice(productInfo.getRealPrice());
            orderDetail.setOrderScore(productInfo.getRealPrice());
            totalAmount = totalAmount.add(orderDetail.getRealPrice().multiply(new BigDecimal(orderDetail.getNum())));
            details.add(orderDetail);
        }
        orderInfo.setTotalAmount(totalAmount);
        orderManager.insertOrderInfo(orderInfo, details);
        orderRespDTO.setCode(EnumRespCode.SUCCESS.getCode());
        orderRespDTO.setMessage(EnumRespCode.SUCCESS.getMsg());
        return orderRespDTO;
    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse confirm(@RequestBody @Valid OrderConfirmRequest request, final BindingResult result) {
        checkError(result);
        boolean isScorePay = false;
        ErpVipInfo vipInfo = null;
        if (request.getVipId() >= 0) {
            vipInfo = this.vipInfoManager.selectById(request.getVipId());
            if (vipInfo == null) {
                throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "当前VIP用户信息不存在");
            }
            if (request.isScorePayFlag()) {
                if (vipInfo.getScore().compareTo(request.getPayScore()) < 0) {
                    throw new ErpException(EnumRespCode.SCORE_NOT_ENOUGH.getCode(), "当前VIP积分不足");
                } else {
                    isScorePay = true;
                }
            }
        }
        ErpOrderInfo orderInfo = this.orderManager.selectByOrderNo(request.getOrderNo());
        if (orderInfo == null) {
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "订单确认失败，订单信息不存在");
        }
        List<ErpOrderDetail> details = this.erpOrderDetailManager.selectByOrderNo(orderInfo.getOrderNo());
        if (details == null || details.isEmpty()) {
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "订单确认失败，订单明细不存在");
        }
        orderInfo.setGmtModified(new Date());
        orderInfo.setPayScore(request.getPayScore());
        orderInfo.setPayAmount(request.getPayAmount());
        orderInfo.setOrderScore(request.getPayAmount());
        orderInfo.setPayType(request.getPayType());
        orderInfo.setOrderStatus(EnumOrderStatus.PAYED.getCode());
        //积分扣除
        if (isScorePay) {
            BigDecimal scoreToCash = request.getPayScore().divide(new BigDecimal(SCORE_EXCHANGE_RATE), 2, BigDecimal.ROUND_DOWN).setScale(2);
            if (scoreToCash.add(request.getPayAmount()).compareTo(orderInfo.getTotalAmount()) < 0) {
                log.info("支付金额与订单金额不匹配,积分金额：{}，支付金额：{}，订单金额{}", scoreToCash.toPlainString(), request.getPayAmount().toPlainString(), orderInfo.getTotalAmount().toPlainString());
                throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "订单确认失败，支付金额与订单金额不匹配");
            }
            this.erpVipScoreInfoManager.scorePay(vipInfo, orderInfo.getPayScore(), String.valueOf(orderInfo.getId()), EnumScoreType.PAY.getCode());
        }
        //出库
        for (ErpOrderDetail erpOrderDetail : details) {
            erpInventoryManager.stockOut(erpOrderDetail.getProductSn(), erpOrderDetail.getNum(), orderInfo.getShopId());
        }
        //更新订单记录
        this.orderManager.updateOrderInfo(orderInfo);
        //积分奖励
        if (vipInfo != null) {
            erpVipScoreInfoManager.rewardScore(vipInfo, orderInfo.getOrderScore(), String.valueOf(orderInfo.getId()), EnumScoreType.ORDER.getCode());
        }
        BaseResponse response = new BaseResponse();
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage(EnumRespCode.SUCCESS.getMsg());
        return response;
    }
}
