package com.solo.erp.manager.facade;

import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.model.ErpStaffInfo;
import com.solo.erp.manager.bo.LoginUserBO;

import java.util.List;

public interface IStaffLoginService {
    /**
     * 员工注册信息
     *
     * @param info
     * @return
     */
    void register(ErpStaffInfo info, List<Integer> roles) throws ErpException;

    /**
     * 根据登录名查询相关用户信息
     *
     * @param loginName
     * @return
     */
    LoginUserBO fetchLoginInfo(String loginName) throws ErpException;
}
