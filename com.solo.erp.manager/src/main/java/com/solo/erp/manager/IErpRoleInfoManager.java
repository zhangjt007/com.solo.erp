package com.solo.erp.manager;

import com.solo.erp.dao.model.ErpRoleInfo;

import java.util.List;

public interface IErpRoleInfoManager {
    /**
     * 获取所有可用角色
     * @return
     */
    List<ErpRoleInfo> selectAll();
}
