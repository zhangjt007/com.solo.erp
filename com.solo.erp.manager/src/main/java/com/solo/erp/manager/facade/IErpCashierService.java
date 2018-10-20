package com.solo.erp.manager.facade;

import com.solo.erp.common.bean.CashierViewBean;
import com.solo.erp.common.exception.ErpException;

public interface IErpCashierService {
    /**
     * 根据商品SN查询
     * @param productSn
     * @return
     */
    CashierViewBean getByProductSn(String productSn) throws ErpException;
}
