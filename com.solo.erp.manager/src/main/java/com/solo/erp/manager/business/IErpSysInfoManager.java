package com.solo.erp.manager.business;

import com.solo.erp.manager.bo.UrlRoleRelBO;

import java.util.List;

public interface IErpSysInfoManager {
    /**
     * 查询所有url所需要的角色权限
     *
     * @return
     */
    List<UrlRoleRelBO> selectAllMenuAndRole();

}
