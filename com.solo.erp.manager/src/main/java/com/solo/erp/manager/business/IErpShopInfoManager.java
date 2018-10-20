package com.solo.erp.manager.business;

import com.solo.erp.dao.model.ErpShopInfo;

import java.util.List;

public interface IErpShopInfoManager {
    /**
     * 根据父节点查找子节点
     * @param id
     * @return
     */
    List<ErpShopInfo> selectByParentId(int id);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    ErpShopInfo selectById(int id);
}
