package com.solo.erp.manager;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.OrderDetailQueryRequest;
import com.solo.erp.dao.model.ErpOrderDetail;

import java.util.List;

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
}
