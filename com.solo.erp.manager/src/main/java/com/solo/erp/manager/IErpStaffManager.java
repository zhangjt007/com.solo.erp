package com.solo.erp.manager;

import com.solo.erp.dao.model.ErpStaffInfo;
import com.solo.erp.manager.bo.LoginUserBO;

public interface IErpStaffManager {

    /**
     * 插入员工信息
     *
     * @param info
     * @return
     */
    int insertStaff(ErpStaffInfo info);

    /**
     * 根据登录名查询相关用户信息
     *
     * @param loginName
     * @return
     */
    LoginUserBO selectLoginUserInfo(String loginName);

    /**
     * 获取当前数量
     *
     * @return
     */
    String genStaffNo();

}
