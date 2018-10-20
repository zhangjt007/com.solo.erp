package com.solo.erp.manager.facade;

import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.dao.model.ErpOrderInfo;
import com.solo.erp.manager.bo.LoginUserBO;

import java.util.List;

public interface IOrderService {
    /**
     * 退款
     *
     * @param oriOrderNo
     * @param list
     * @param staff
     */
    ErpOrderInfo refund(String oriOrderNo, List<ErpOrderDetail> list, LoginUserBO staff);
}
