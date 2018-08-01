package com.solo.erp.manager;

import com.solo.erp.common.bean.CashierViewBean;
import com.solo.erp.common.exception.ErpException;

public interface IErpCashierManager {
    /**
     * 根据商品SN查询
     * @param productSn
     * @return
     */
    CashierViewBean getByProductSn(String productSn) throws ErpException;
}
