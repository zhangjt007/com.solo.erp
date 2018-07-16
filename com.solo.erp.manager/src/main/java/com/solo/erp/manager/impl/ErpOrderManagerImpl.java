package com.solo.erp.manager.impl;

import com.solo.erp.dao.mapper.ErpOrderDetailMapper;
import com.solo.erp.dao.mapper.ErpOrderInfoMapper;
import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.dao.model.ErpOrderDetailExample;
import com.solo.erp.dao.model.ErpOrderInfo;
import com.solo.erp.dao.model.ErpOrderInfoExample;
import com.solo.erp.manager.IErpOrderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderManager")
public class ErpOrderManagerImpl implements IErpOrderManager {

    @Autowired
    ErpOrderInfoMapper orderInfoMapper;
    @Autowired
    ErpOrderDetailMapper orderDetailMapper;

    /**
     * 插入订单信息和明细
     *
     * @param orderInfo
     * @param orderDetails
     * @return
     */
    @Override
    public int insertOrderInfo(ErpOrderInfo orderInfo, List<ErpOrderDetail> orderDetails) {
        int record = orderInfoMapper.insert(orderInfo);
        int order_id = orderInfo.getId();
        if (orderDetails != null && !orderDetails.isEmpty()) {
            for (ErpOrderDetail detail : orderDetails) {
                detail.setOrderId(order_id);
                orderDetailMapper.insert(detail);
            }
        }
        return record;
    }

    /**
     * 根据订单编号查询订单信息
     *
     * @param orderNo
     * @return
     */
    @Override
    public ErpOrderInfo selectByOrderNo(String orderNo) {
        ErpOrderInfoExample erpOrderInfoExample = new ErpOrderInfoExample();
        erpOrderInfoExample.createCriteria().andOrderNoEqualTo(orderNo);
        List<ErpOrderInfo> result = this.orderInfoMapper.selectByExample(erpOrderInfoExample);
        return result.get(0);
    }

    /**
     * 根据订单ID查询订单明细
     *
     * @param orderId
     * @return
     */
    @Override
    public List<ErpOrderDetail> selectByOrderId(int orderId) {
        ErpOrderDetailExample erpOrderDetailExample = new ErpOrderDetailExample();
        erpOrderDetailExample.createCriteria().andOrderIdEqualTo(orderId);
        List<ErpOrderDetail> result = this.orderDetailMapper.selectByExample(erpOrderDetailExample);
        return result;
    }

    /**
     * 更新订单信息
     *
     * @param orderInfo
     * @return
     */
    @Override
    public int updateOrderInfo(ErpOrderInfo orderInfo) {
        int result = this.orderInfoMapper.updateByPrimaryKeySelective(orderInfo);
        return result;
    }
}
