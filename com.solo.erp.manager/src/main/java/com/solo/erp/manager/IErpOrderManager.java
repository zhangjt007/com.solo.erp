package com.solo.erp.manager;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.OrderInfoQueryRequest;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.dao.model.ErpOrderInfo;

import java.util.List;

/**
 * 订单管理
 */
public interface IErpOrderManager {
    /**
     * 插入订单信息和明细
     *
     * @param orderInfo
     * @param orderDetails
     * @return
     */
    int insertOrderInfo(ErpOrderInfo orderInfo, List<ErpOrderDetail> orderDetails);

    /**
     * 根据订单编号查询订单信息
     *
     * @param orderNo
     * @return
     */
    ErpOrderInfo selectByOrderNo(String orderNo);

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    PageInfo<ErpOrderInfo> selectPage(OrderInfoQueryRequest req) throws ErpException;

    /**
     * 更新订单信息
     * @param orderInfo
     * @return
     */
    int updateOrderInfo(ErpOrderInfo orderInfo);
}
