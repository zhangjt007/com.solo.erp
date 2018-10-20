package com.solo.erp.controller;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.bean.CashierViewBean;
import com.solo.erp.common.bean.OrderDetailBean;
import com.solo.erp.common.bean.OrderRefundDetailBean;
import com.solo.erp.common.dto.request.OrderApplyRequest;
import com.solo.erp.common.dto.request.OrderConfirmRequest;
import com.solo.erp.common.dto.request.OrderInfoQueryRequest;
import com.solo.erp.common.dto.request.OrderRefundRequest;
import com.solo.erp.common.dto.response.BaseDetailViewResponse;
import com.solo.erp.common.dto.response.BaseQueryPageResponse;
import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.dto.response.OrderGenResponse;
import com.solo.erp.common.enums.*;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.ProductParseUtil;
import com.solo.erp.common.utils.ScoreUtil;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.dao.model.ErpOrderInfo;
import com.solo.erp.dao.model.ErpProductInfo;
import com.solo.erp.dao.model.ErpVipInfo;
import com.solo.erp.manager.bo.LoginUserBO;
import com.solo.erp.manager.business.*;
import com.solo.erp.manager.facade.IErpCashierService;
import com.solo.erp.manager.facade.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单相关接口
 */
@RestController
@RequestMapping("/api/order")
public class ErpOrderController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(ErpOrderController.class);

    @Autowired
    private IErpOrderManager orderManager;
    @Autowired
    private IErpVipInfoManager vipInfoManager;
    @Autowired
    private IErpVipScoreInfoManager erpVipScoreInfoManager;
    @Autowired
    private IErpInventoryManager erpInventoryManager;
    @Autowired
    private IErpOrderDetailManager erpOrderDetailManager;
    @Autowired
    private IErpCashierService erpCashierManager;
    @Autowired
    private IErpProductInfoManager erpProductInfoManager;
    @Autowired
    private IOrderService orderService;
    @Autowired
    private IStatisticsManager statisticsManager;


    /**
     * 统计日期范围
     */
    private final int PERIOD_DAYS = 7;
    /**
     * 订单支付风险比例
     */
    private final double RISK_PAY_RATIO = 0.8;

    /**
     * 生成订单号
     *
     * @return
     */
    @GetMapping(value = "/generate_id")
    public OrderGenResponse generateId() {
        long start = System.currentTimeMillis();
        OrderGenResponse response = new OrderGenResponse();
        response.setOrderNo(orderManager.generateId());
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage(EnumRespCode.SUCCESS.getMsg());
        log.info("/api/order/generate_id，耗时{}ms", System.currentTimeMillis() - start);
        return response;
    }

    /**
     * 根据SN查询商品信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/cashier/sn/{id}", method = RequestMethod.GET)
    @ResponseBody
    public BaseDetailViewResponse cashierByid(@PathVariable("id") String id) {
        long start = System.currentTimeMillis();
        BaseDetailViewResponse response = new BaseDetailViewResponse();
        CashierViewBean bean = erpCashierManager.getByProductSn(id);
        response.setData(bean);
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage(EnumRespCode.SUCCESS.getMsg());
        log.info("/api/order/cashier/sn/{}，耗时{}ms", id, System.currentTimeMillis() - start);
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
        long start = System.currentTimeMillis();
        BaseDetailViewResponse resp = new BaseDetailViewResponse();
        List<ErpOrderDetail> info = erpOrderDetailManager.selectByOrderNo(orderNo);
        resp.setData(info);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("获取明细成功");
        log.info("/api/order/details/{}，耗时{}ms", orderNo, System.currentTimeMillis() - start);
        return resp;
    }

    @RequestMapping(value = "/real_time/sale", method = RequestMethod.GET)
    @ResponseBody
    public BaseDetailViewResponse realTimeSale() {
        long start = System.currentTimeMillis();
        BaseDetailViewResponse resp = new BaseDetailViewResponse();
        LoginUserBO bo = this.getSessionLoginUser();
        Map info = erpOrderDetailManager.statisticsTodaySale(bo.getShops());
        resp.setData(info);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("获取明细成功");
        log.info("/api/order/today/sale，耗时{}ms", System.currentTimeMillis() - start);
        return resp;
    }

    @RequestMapping(value = "/period/sale", method = RequestMethod.GET)
    @ResponseBody
    public BaseDetailViewResponse periodSale() {
        long start = System.currentTimeMillis();
        BaseDetailViewResponse resp = new BaseDetailViewResponse();
        String startDate = LocalDate.now().minusDays(1).minusDays(PERIOD_DAYS).toString();
        String endDate = LocalDate.now().minusDays(1).toString();
        LoginUserBO bo = this.getSessionLoginUser();
        List<HashMap> info = statisticsManager.statisticsPeriodSale(startDate, endDate, bo);
        resp.setData(info);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("获取明细成功");
        log.info("/api/order/today/sale，耗时{}ms", System.currentTimeMillis() - start);
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
        long start = System.currentTimeMillis();
        checkError(result);
        BaseQueryPageResponse resp = new BaseQueryPageResponse();
        PageInfo<ErpOrderInfo> page = orderManager.selectPage(req);
        BeanUtils.copyProperties(page, resp);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("查询成功");
        log.info("/api/order/query，耗时{}ms", System.currentTimeMillis() - start);
        return resp;
    }

    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse apply(@RequestBody @Valid OrderApplyRequest request, final BindingResult result) {
        long start = System.currentTimeMillis();
        checkError(result);
        OrderGenResponse orderRespDTO = new OrderGenResponse();
        LoginUserBO staff = this.getSessionLoginUser();
        //订单信息
        ErpOrderInfo orderInfo = new ErpOrderInfo();
        orderInfo.setShopId(staff.getShopId());
        orderInfo.setStaffId(staff.getId());
        orderInfo.setStaffName(staff.getName());
        orderInfo.setVipMobile(request.getMobile());
        orderInfo.setOrderType(EnumOrderType.PAY.getCode());
        orderInfo.setOrderNo(request.getOrderNo());
        orderInfo.setOrderStatus(EnumOrderStatus.WAITING_PAY.getCode());
        orderInfo.setPayType(EnumPayType.CASH.getCode());
        orderInfo.setPayAmount(BigDecimal.ZERO);
        orderInfo.setPayScore(BigDecimal.ZERO);
        orderInfo.setOrderScore(BigDecimal.ZERO);
        orderInfo.setIsInvoice(false);
        orderInfo.setOrderDate(LocalDate.now());
        orderInfo.setGmtCreate(LocalDateTime.now());
        orderInfo.setGmtModified(LocalDateTime.now());
        List<ErpOrderDetail> details = new ArrayList<>();
        BigDecimal totalAmount = BigDecimal.ZERO;
        int totalNum = 0;
        for (OrderDetailBean bean : request.getList()) {
            ErpOrderDetail orderDetail = new ErpOrderDetail();
            String productSn = bean.getProductSn();
            orderDetail.setShopId(staff.getShopId());
            orderDetail.setStaffId(staff.getId());
            orderDetail.setStaffName(staff.getName());
            orderDetail.setVipMobile(request.getMobile());
            orderDetail.setOrderNo(orderInfo.getOrderNo());
            orderDetail.setOrderDate(LocalDate.now());
            orderDetail.setGmtCreate(LocalDateTime.now());
            orderDetail.setGmtModified(LocalDateTime.now());
            orderDetail.setNum(bean.getCount());
            orderDetail.setProductSn(productSn);
            orderDetail.setOrderStatus(EnumOrderStatus.WAITING_PAY.getCode());
            orderDetail.setProductNo(ProductParseUtil.parseProductNo(productSn));
            orderDetail.setColor(ProductParseUtil.parseColor(productSn));
            orderDetail.setSize(ProductParseUtil.parseSize(productSn));
            orderDetail.setIsRefund(false);
            ErpProductInfo productInfo = erpProductInfoManager.selectByProductNo(orderDetail.getProductNo());
            if (productInfo == null) {
                throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "编号为：" + bean.getProductSn() + "商品信息不存在");
            }
            orderDetail.setProductName(productInfo.getProductName());
            orderDetail.setTagPrice(productInfo.getTagPrice());
            orderDetail.setRealPrice(bean.getRealPrice());
            orderDetail.setOrderScore(bean.getRealPrice());
            totalAmount = totalAmount.add(orderDetail.getRealPrice().multiply(new BigDecimal(orderDetail.getNum())));
            totalNum += bean.getCount();
            details.add(orderDetail);
        }
        orderInfo.setTotalAmount(totalAmount);
        orderInfo.setTotalNum(totalNum);
        orderManager.insertOrderInfo(orderInfo, details);
        orderRespDTO.setCode(EnumRespCode.SUCCESS.getCode());
        orderRespDTO.setMessage(EnumRespCode.SUCCESS.getMsg());
        log.info("/api/order/apply，耗时{}ms", System.currentTimeMillis() - start);
        return orderRespDTO;
    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse confirm(@RequestBody @Valid OrderConfirmRequest request, final BindingResult result) {
        long start = System.currentTimeMillis();
        checkError(result);
        boolean isScorePay = false;

        ErpOrderInfo orderInfo = this.orderManager.selectByOrderNo(request.getOrderNo());
        ErpVipInfo vipInfo = null;
        if (!StringUtils.isEmpty(orderInfo.getVipMobile())) {
            vipInfo = this.vipInfoManager.selectByMobile(orderInfo.getVipMobile());
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
        if (orderInfo == null) {
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "订单确认失败，订单信息不存在");
        }
        List<ErpOrderDetail> details = this.erpOrderDetailManager.selectByOrderNo(orderInfo.getOrderNo());
        if (details == null || details.isEmpty()) {
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "订单确认失败，订单明细不存在");
        }
        orderInfo.setGmtModified(LocalDateTime.now());
        orderInfo.setPayScore(request.getPayScore());
        orderInfo.setPayAmount(request.getPayAmount());
        orderInfo.setOrderScore(request.getPayAmount());
        orderInfo.setPayType(request.getPayType());
        orderInfo.setOrderStatus(EnumOrderStatus.PAYED.getCode());
        orderInfo.setRemark(request.getRemark());
        double payRatio = 1;
        //积分扣除
        if (isScorePay) {
            BigDecimal scoreToCash = ScoreUtil.transferScoreToAmount(request.getPayScore());
            BigDecimal waitPayAmount = scoreToCash.add(request.getPayAmount());
            payRatio = waitPayAmount.divide(orderInfo.getTotalAmount(), 2, RoundingMode.HALF_UP).doubleValue();
            if (payRatio < RISK_PAY_RATIO) {
                log.info("支付金额与订单金额差额过大,支付失败,积分金额：{}，支付金额：{}，订单金额{}", scoreToCash.toPlainString(), request.getPayAmount().toPlainString(), orderInfo.getTotalAmount().toPlainString());
                throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "订单确认失败，实际支付金额与订单金额差额过大");
            }
            this.erpVipScoreInfoManager.updateValiableScore(vipInfo.getId(), orderInfo.getPayScore().negate(), String.valueOf(orderInfo.getId()), EnumScoreType.PAY.getCode());
        } else {
            payRatio = orderInfo.getPayAmount().divide(orderInfo.getTotalAmount(), 2, RoundingMode.HALF_UP).doubleValue();
            if (payRatio < RISK_PAY_RATIO) {
                log.info("支付金额与订单金额差额过大,支付失败,支付金额：{}，订单金额{}", request.getPayAmount().toPlainString(), orderInfo.getTotalAmount().toPlainString());
                throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "订单确认失败，实际支付金额与订单金额差额过大");
            }
        }
        //出库
        for (ErpOrderDetail erpOrderDetail : details) {
            erpInventoryManager.stockOut(erpOrderDetail.getProductSn(), erpOrderDetail.getNum(), orderInfo.getShopId());
        }
        //更新订单记录
        this.orderManager.updateOrderInfo(orderInfo);
        this.erpOrderDetailManager.updateStatusByOrderNo(orderInfo.getOrderNo(), EnumOrderStatus.PAYED.getCode());
        //积分奖励
        if (vipInfo != null) {
            erpVipScoreInfoManager.updateScore(vipInfo.getId(), orderInfo.getOrderScore(), String.valueOf(orderInfo.getId()), EnumScoreType.ORDER.getCode());
        }
        BaseResponse response = new BaseResponse();
        response.setCode(EnumRespCode.SUCCESS.getCode());
        if (payRatio < 1) {
            response.setMessage("订单完成，收款比例" + payRatio + "，订单号：" + orderInfo.getOrderNo());
        } else {
            response.setMessage("订单完成，订单号：" + orderInfo.getOrderNo());
        }
        log.info("/api/order/confirm，耗时{}ms", System.currentTimeMillis() - start);
        return response;
    }

    @RequestMapping(value = "/refund", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse refund(@RequestBody @Valid OrderRefundRequest request, final BindingResult result) {
        long start = System.currentTimeMillis();
        checkError(result);
        if (request.getList() == null || request.getList().isEmpty()) {
            throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "退款明细不能为空");
        }
        List<ErpOrderDetail> refundList = new ArrayList<>();
        String oriOrderNo = "";
        for (OrderRefundDetailBean bean : request.getList()) {
            ErpOrderDetail detail = this.erpOrderDetailManager.selectById(bean.getId());
            if (detail == null) {
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "订单明细查无此信息，退款失败");
            } else if (detail.getIsRefund()) {
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "订单明细已退货不能重复操作，退款失败");
            } else if (StringUtils.isEmpty(oriOrderNo)) {
                oriOrderNo = detail.getOrderNo();
            } else if (!oriOrderNo.equals(detail.getOrderNo())) {
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "不支持非同一订单批量退款，退款失败");
            }
            refundList.add(detail);
        }
        ErpOrderInfo refund = orderService.refund(oriOrderNo, refundList, this.getSessionLoginUser());
        BaseResponse response = new BaseResponse();
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage("退单成功。支付方式：" + EnumPayType.getEnumByCode(refund.getPayType()).getMsg() + "退回资金：" + refund.getPayAmount().negate() + "退回积分:" + refund.getPayScore().negate());
        log.info("/api/order/refund，耗时{}ms", System.currentTimeMillis() - start);
        return response;
    }

}
