package com.solo.erp.manager.facade.impl;

import com.solo.erp.common.enums.EnumOrderStatus;
import com.solo.erp.common.enums.EnumOrderType;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.enums.EnumScoreType;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.ScoreUtil;
import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.dao.model.ErpOrderInfo;
import com.solo.erp.dao.model.ErpVipInfo;
import com.solo.erp.manager.bo.LoginUserBO;
import com.solo.erp.manager.business.*;
import com.solo.erp.manager.facade.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements IOrderService {

    private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);
    @Autowired
    private IErpOrderManager orderManager;
    @Autowired
    private IErpOrderDetailManager orderDetailManager;
    @Autowired
    private IErpInventoryManager inventoryManager;
    @Autowired
    private IErpVipScoreInfoManager vipScoreInfoManager;
    @Autowired
    private IErpVipInfoManager vipInfoManager;

    /**
     * 退款
     *
     * @param list
     */
    @Override
    @Transactional
    public ErpOrderInfo refund(String oriOrderNo, List<ErpOrderDetail> list, LoginUserBO staff) {
        log.info("退款交易开始，订单号:{}", oriOrderNo);
        List<ErpOrderDetail> oriDetailList = orderDetailManager.selectByOrderNo(oriOrderNo);
        ErpOrderInfo oriOrderInfo = orderManager.selectByOrderNo(oriOrderNo);
        String vipMobile = oriOrderInfo.getVipMobile();
        ErpVipInfo vipInfo = null;
        if (!StringUtils.isEmpty(vipMobile)) {
            vipInfo = this.vipInfoManager.selectByMobile(vipMobile);
            if (vipInfo == null) {
                throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "当前VIP用户信息不存在");
            }
        }
        boolean isAllRefund = true;
        if (oriDetailList.size() == list.size()) {
            log.info("全部退款");
        } else {
            log.info("部分退款");
            isAllRefund = false;
        }
        List<Integer> waitRefundDetails = new ArrayList<>();
        BigDecimal waitHandlePayScore = BigDecimal.ZERO;
        BigDecimal waitHandlePayAmount = BigDecimal.ZERO;
        //新增退款订单
        ErpOrderInfo orderInfo = new ErpOrderInfo();
        orderInfo.setShopId(staff.getShopId());
        orderInfo.setStaffId(staff.getId());
        orderInfo.setStaffName(staff.getName());
        orderInfo.setOrderType(EnumOrderType.REFUND.getCode());
        orderInfo.setOrderNo(orderManager.generateId());
        orderInfo.setOrderStatus(EnumOrderStatus.REFUND.getCode());
        orderInfo.setPayType(oriOrderInfo.getPayType());
        orderInfo.setIsInvoice(false);
        orderInfo.setOrderDate(LocalDate.now());
        orderInfo.setGmtCreate(LocalDateTime.now());
        orderInfo.setGmtModified(LocalDateTime.now());
        List<ErpOrderDetail> details = new ArrayList<>();
        BigDecimal totalAmount = BigDecimal.ZERO;
        BigDecimal totalScore = BigDecimal.ZERO;
        int totalNum = 0;
        for (ErpOrderDetail orderDetail : list) {
            orderDetail.setOriginId(orderDetail.getId().intValue());
            waitRefundDetails.add(orderDetail.getOriginId());
            orderDetail.setId(null);
            Integer num = orderDetail.getNum();
            orderDetail.setShopId(staff.getShopId());
            orderDetail.setStaffId(staff.getId());
            orderDetail.setStaffName(staff.getName());
            orderDetail.setOrderNo(orderInfo.getOrderNo());
            orderDetail.setOrderDate(LocalDate.now());
            orderDetail.setGmtCreate(LocalDateTime.now());
            orderDetail.setGmtModified(LocalDateTime.now());
            orderDetail.setNum(num * (-1)); //负值
            orderDetail.setOrderStatus(EnumOrderStatus.REFUND.getCode());
            orderDetail.setIsRefund(true);
            orderDetail.setOrderScore(orderDetail.getOrderScore().negate());
            totalAmount = totalAmount.add(orderDetail.getRealPrice().multiply(new BigDecimal(num)));
            totalScore = totalScore.add(orderDetail.getOrderScore().multiply(new BigDecimal(num)));
            totalNum += orderDetail.getNum();
            details.add(orderDetail);
        }
        orderInfo.setVipMobile(vipMobile);
        if (isAllRefund) {
            waitHandlePayScore = oriOrderInfo.getPayScore();
            waitHandlePayAmount = oriOrderInfo.getPayAmount();
        } else {
            /**
             * 如果原支付总金额<当前退款金额，则积分需要退换
             */
            if (oriOrderInfo.getPayAmount().compareTo(totalAmount) < 0) {
                waitHandlePayAmount = oriOrderInfo.getPayAmount();
                if (oriOrderInfo.getPayScore().compareTo(BigDecimal.ZERO) > 0) {
                    waitHandlePayScore = ScoreUtil.transferAmountToScore(totalAmount.subtract(oriOrderInfo.getPayAmount()));
                }
            } else {
                waitHandlePayAmount = totalAmount;
            }
        }
        orderInfo.setTotalAmount(totalAmount);
        orderInfo.setPayScore(waitHandlePayScore.negate());
        orderInfo.setPayAmount(waitHandlePayAmount.negate());
        orderInfo.setOrderScore(waitHandlePayAmount.negate());
        orderInfo.setTotalNum(totalNum);
        orderManager.insertOrderInfo(orderInfo, details);
        //修改原订单明细状态
        orderDetailManager.updateIsRefundById(waitRefundDetails);
        //////////使用积分支付时退款问题
        //增加库存
        for (ErpOrderDetail orderDetail : list) {
            inventoryManager.updateInventoryNumByProductSn(Math.abs(orderDetail.getNum()), orderDetail.getShopId(), orderDetail.getProductSn());
        }
        //处理积分
        if (vipInfo != null) {
            if (waitHandlePayScore.compareTo(BigDecimal.ZERO) > 0) {
                //增加支付积分
                vipScoreInfoManager.updateValiableScore(vipInfo.getId(), waitHandlePayScore, orderInfo.getOrderNo(), EnumScoreType.REVERSE.getCode());
            }
            //扣除奖励积分
            vipScoreInfoManager.updateScore(vipInfo.getId(), waitHandlePayAmount.negate(), orderInfo.getOrderNo(), EnumScoreType.REVERSE.getCode());
        }
        return orderInfo;
    }
}
