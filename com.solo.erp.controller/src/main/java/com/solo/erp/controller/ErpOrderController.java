package com.solo.erp.controller;

import com.solo.erp.common.bean.OrderDetailBean;
import com.solo.erp.common.dto.request.OrderApplyRequest;
import com.solo.erp.common.dto.request.OrderConfirmRequest;
import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.dto.response.OrderGenResponse;
import com.solo.erp.common.enums.EnumOrderStatus;
import com.solo.erp.common.enums.EnumPayType;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.enums.EnumScoreType;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.DateUtils;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.dao.model.ErpOrderInfo;
import com.solo.erp.dao.model.ErpVipInfo;
import com.solo.erp.manager.IErpInventoryManager;
import com.solo.erp.manager.IErpOrderManager;
import com.solo.erp.manager.IErpVipInfoManager;
import com.solo.erp.manager.IErpVipScoreInfoManager;
import com.solo.erp.manager.bo.LoginUserBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
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
    @Autowired
    IErpOrderManager orderManager;
    @Autowired
    IErpVipInfoManager vipInfoManager;
    @Autowired
    IErpVipScoreInfoManager erpVipScoreInfoManager;
    @Autowired
    IErpInventoryManager erpInventoryManager;

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
        response.setOrderNo(orderNo.toString());
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage(EnumRespCode.SUCCESS.getMsg());
        return response;
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
        orderInfo.setOrderNo(request.getOrderNo());
        orderInfo.setOrderStatus(EnumOrderStatus.WAITING_PAY.getCode());
        orderInfo.setPayType(EnumPayType.CASH.getCode());
        orderInfo.setPayAmount(request.getTotalAmount());
        orderInfo.setPayScore(BigDecimal.ZERO);
        orderInfo.setOrderScore(BigDecimal.ZERO);
        orderInfo.setTotalAmount(request.getTotalAmount());
        orderInfo.setIsRefund(false);
        orderInfo.setRemark(request.getRemark());
        orderInfo.setIsInvoice(false);
        orderInfo.setGmtCreate(new Date());
        orderInfo.setGmtModified(new Date());
        List<ErpOrderDetail> details = new ArrayList<>();
        for (OrderDetailBean bean : request.getDetails()) {
            ErpOrderDetail orderDetail = new ErpOrderDetail();
            orderDetail.setGmtCreate(new Date());
            orderDetail.setGmtModified(new Date());
            orderDetail.setNum(bean.getNum());
            orderDetail.setProductId(bean.getId());
            orderDetail.setProductSn(bean.getProductSn());
            details.add(orderDetail);
        }
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
        if (!StringUtils.isEmpty(request.getVipId())) {
            vipInfo = this.vipInfoManager.selectById(request.getVipId());
            if (vipInfo == null) {
                throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "当前VIP用户信息不存在");
            }
            if (request.getPayScore().compareTo(BigDecimal.ZERO) > 0) {
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
        List<ErpOrderDetail> details = this.orderManager.selectByOrderId(orderInfo.getId());
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
            BigDecimal scoreToCash = request.getPayScore().divide(new BigDecimal(SCORE_EXCHANGE_RATE)).setScale(2);
            if (scoreToCash.add(request.getPayAmount()).compareTo(orderInfo.getTotalAmount()) < 0) {
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
