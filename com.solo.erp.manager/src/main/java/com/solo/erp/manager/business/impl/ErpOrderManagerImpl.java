package com.solo.erp.manager.business.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.OrderInfoQueryRequest;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.SnowflakeIdWorker;
import com.solo.erp.dao.mapper.ErpOrderDetailMapper;
import com.solo.erp.dao.mapper.ErpOrderInfoMapper;
import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.dao.model.ErpOrderInfo;
import com.solo.erp.manager.business.IErpOrderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

import static com.solo.erp.dao.mapper.ErpOrderInfoDynamicSqlSupport.erpOrderInfo;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service("orderManager")
public class ErpOrderManagerImpl implements IErpOrderManager {

    @Autowired
    ErpOrderInfoMapper orderInfoMapper;
    @Autowired
    ErpOrderDetailMapper orderDetailMapper;
    @Autowired
    private SnowflakeIdWorker snowflakeIdWorker;

    /**
     * 生成ID
     *
     * @return
     */
    @Override
    public String generateId() {
        return String.valueOf(snowflakeIdWorker.nextId());
    }

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
        if (orderDetails != null && !orderDetails.isEmpty()) {
            for (ErpOrderDetail detail : orderDetails) {
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
        List<ErpOrderInfo> result = this.orderInfoMapper.selectByExample()
                .where(erpOrderInfo.orderNo, isEqualTo(orderNo))
                .build()
                .execute();
        return result.get(0);
    }

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    @Override
    public PageInfo<ErpOrderInfo> selectPage(OrderInfoQueryRequest req) throws ErpException {
        PageInfo<ErpOrderInfo> pageInfo = PageHelper.startPage(req.getPage(), req.getLimit())
                .doSelectPageInfo(() -> orderInfoMapper.selectByExample()
                        .where(erpOrderInfo.orderNo, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getOrderNo()) ? null : req.getOrderNo()))
                        .and(erpOrderInfo.orderStatus, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getOrderStatus()) ? null : req.getOrderStatus()))
                        .and(erpOrderInfo.orderType, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getOrderType()) ? null : req.getOrderType()))
                        .and(erpOrderInfo.orderDate, isEqualToWhenPresent(req.getOrderDate()))
                        .and(erpOrderInfo.payType, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getPayType()) ? null : req.getPayType()))
                        .and(erpOrderInfo.staffName, isLikeWhenPresent(() -> StringUtils.isEmpty(req.getStaffName()) ? null : ("%" + req.getStaffName() + "%")))
                        .orderBy(erpOrderInfo.gmtModified.descending(), erpOrderInfo.gmtCreate.descending())
                        .build().execute()
                );
        return pageInfo;
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
