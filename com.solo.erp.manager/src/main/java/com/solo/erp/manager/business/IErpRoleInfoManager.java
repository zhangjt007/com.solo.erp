package com.solo.erp.manager.business;

import com.solo.erp.dao.model.ErpRoleInfo;

import java.util.List;

public interface IErpRoleInfoManager {
    /**
     * 获取所有可用角色
     *
     * @return
     */
    List<ErpRoleInfo> selectAll();

    /**
     * 根据职员ID查询角色
     *
     * @param id
     * @return
     */
    List<ErpRoleInfo> selectByStaffId(int id);
}
