package com.solo.erp.manager.impl;

import com.solo.erp.common.enums.EnumBool;
import com.solo.erp.dao.mapper.DynamicSqlMapper;
import com.solo.erp.dao.mapper.ErpStaffInfoMapper;
import com.solo.erp.dao.model.ErpStaffInfo;
import com.solo.erp.dao.model.ErpStaffInfoExample;
import com.solo.erp.manager.IErpStaffManager;
import com.solo.erp.manager.bo.LoginUserBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service("staffManager")
public class ErpStaffManagerImpl implements IErpStaffManager {

    @Autowired
    private ErpStaffInfoMapper staffInfoMapper;
    @Autowired
    private DynamicSqlMapper dynamicSqlMapper;

    /**
     * 插入员工信息
     *
     * @param info
     * @return
     */
    @Override
    public int insertStaff(ErpStaffInfo info) {
        int result = staffInfoMapper.insert(info);
        return result;
    }

    /**
     * 根据登录名查询相关用户信息
     *
     * @param loginName
     * @return
     */
    @Override
    public LoginUserBO selectLoginUserInfo(String loginName) {
        HashMap<String, Object> result = dynamicSqlMapper.selectLoginStaffInfoByLoginName(loginName);
        if (result != null && !result.isEmpty()) {
            LoginUserBO bo = new LoginUserBO();
            bo.setId((int) result.get("id"));
            bo.setShopId((int) result.get("shop_id"));
            bo.setShopName(result.get("shop_name").toString());
            bo.setUsername(result.get("login_name").toString());
            bo.setPassword(result.get("login_pwd").toString());
            bo.setRole(result.get("role_name").toString());
            bo.setName(result.get("staff_name").toString());
            bo.setStaffNo(result.get("staff_no").toString());
            bo.setStaffPhoto(result.get("staff_photo").toString());
            int isEnable = (int) result.get("is_enable");
            if (EnumBool.TRUE.getCode() == isEnable) {
                bo.setEnabled(true);
            } else {
                bo.setEnabled(false);
            }
            bo.setSalt("");
            return bo;
        } else {
            return null;
        }
    }

    /**
     * 生成员工号
     *
     * @return
     */
    @Override
    public String genStaffNo() {
        ErpStaffInfoExample example = new ErpStaffInfoExample();
        long result = staffInfoMapper.countByExample(example);
        String staffNo = String.format("%04d", ++result);
        return staffNo;
    }

}
