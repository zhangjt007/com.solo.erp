package com.solo.erp.manager.business;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.OrderDetailQueryRequest;
import com.solo.erp.dao.model.ErpOrderDetail;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IErpOrderDetailManager {
    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    ErpOrderDetail selectById(int id);

    /**
     * 根据订单号查询明细
     *
     * @param orderNo
     * @return
     */
    List<ErpOrderDetail> selectByOrderNo(String orderNo);

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    PageInfo<ErpOrderDetail> selectPage(OrderDetailQueryRequest req);

    /**
     * 根据订单ID更新状态
     *
     * @param orderNo
     * @return
     */
    int updateStatusByOrderNo(String orderNo, String orderStatus);

    /**
     * 更新是否退款标识
     *
     * @param id
     * @return
     */
    int updateIsRefundById(List<Integer> id);

    /**
     * 统计今日销售
     *
     * @param shops
     * @return
     */
    Map<String, String> statisticsTodaySale(Set shops);
}
