package com.solo.erp.manager.business.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.OrderDetailQueryRequest;
import com.solo.erp.dao.mapper.DynamicSqlMapper;
import com.solo.erp.dao.mapper.ErpOrderDetailMapper;
import com.solo.erp.dao.mapper.ErpOrderInfoMapper;
import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.manager.business.IErpOrderDetailManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.solo.erp.dao.mapper.ErpOrderDetailDynamicSqlSupport.erpOrderDetail;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service("erpOrderDetailManager")
public class ErpOrderDetailManagerImpl implements IErpOrderDetailManager {
    @Autowired
    ErpOrderDetailMapper orderDetailMapper;
    @Autowired
    ErpOrderInfoMapper orderInfoMapper;
    @Autowired
    DynamicSqlMapper dynamicSqlMapper;

    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    @Override
    public ErpOrderDetail selectById(int id) {
        return orderDetailMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据订单ID查询明细
     *
     * @param orderNo
     * @return
     */
    @Override
    public List<ErpOrderDetail> selectByOrderNo(String orderNo) {
        List<ErpOrderDetail> results = orderDetailMapper.selectByExample()
                .where(erpOrderDetail.orderNo, isEqualTo(orderNo))
                .build()
                .execute();
        return results;
    }

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    @Override
    public PageInfo<ErpOrderDetail> selectPage(OrderDetailQueryRequest req) {
        PageInfo<ErpOrderDetail> pageInfo;
        pageInfo = PageHelper.startPage(req.getPage(), req.getLimit()).
                doSelectPageInfo(() -> orderDetailMapper.selectByExample()
                        .where(erpOrderDetail.orderNo, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getOrderNo()) ? null : req.getOrderNo()))
                        .and(erpOrderDetail.productNo, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getProductNo()) ? null : req.getProductNo()))
                        .and(erpOrderDetail.productSn, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getProductSn()) ? null : req.getProductSn()))
                        .and(erpOrderDetail.orderDate, isEqualToWhenPresent(req.getOrderDate()))
                        .and(erpOrderDetail.orderStatus, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getOrderStatus()) ? null : req.getOrderStatus()))
                        .orderBy(erpOrderDetail.gmtModified.descending(), erpOrderDetail.gmtCreate.descending())
                        .build()
                        .execute()
                );
        return pageInfo;
    }

    /**
     * 根据订单ID更新状态
     *
     * @param orderNo
     * @param orderStatus
     * @return
     */
    @Override
    public int updateStatusByOrderNo(String orderNo, String orderStatus) {
        ErpOrderDetail detail = new ErpOrderDetail();
        detail.setOrderStatus(orderStatus);
        detail.setGmtModified(LocalDateTime.now());
        int result = orderDetailMapper.updateByExampleSelective(detail)
                .where(erpOrderDetail.orderNo, isEqualTo(orderNo))
                .build()
                .execute();
        return result;
    }

    /**
     * 更新是否退款标识
     *
     * @param id
     * @return
     */
    @Override
    public int updateIsRefundById(List<Integer> id) {
        ErpOrderDetail detail = new ErpOrderDetail();
        detail.setIsRefund(true);
        detail.setGmtModified(LocalDateTime.now());
        int result = orderDetailMapper.updateByExampleSelective(detail)
                .where(erpOrderDetail.id, isInWhenPresent(id))
                .build()
                .execute();
        return result;
    }

    /**
     * 统计今日销售
     *
     * @param shops
     * @return
     */
    @Override
    public Map<String, String> statisticsTodaySale(Set shops) {
        return dynamicSqlMapper.statisticsSaleInfoByDay(LocalDate.now().toString(), shops);
    }


}
