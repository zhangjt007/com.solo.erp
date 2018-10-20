package com.solo.erp.manager.facade.impl;

import com.solo.erp.common.bean.DictOptionBean;
import com.solo.erp.common.enums.EnumBool;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.model.ErpRoleInfo;
import com.solo.erp.dao.model.ErpShopInfo;
import com.solo.erp.dao.model.ErpStaffInfo;
import com.solo.erp.dao.model.ErpStaffRoleRel;
import com.solo.erp.manager.bo.LoginUserBO;
import com.solo.erp.manager.business.IErpRoleInfoManager;
import com.solo.erp.manager.business.IErpShopInfoManager;
import com.solo.erp.manager.business.IErpStaffManager;
import com.solo.erp.manager.business.IErpStaffRoleRelManager;
import com.solo.erp.manager.facade.IStaffLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("staffLoginService")
public class StaffLoginServiceImpl implements IStaffLoginService {
    @Autowired
    IErpStaffManager staffManager;
    @Autowired
    IErpStaffRoleRelManager staffRoleRelManager;
    @Autowired
    IErpShopInfoManager shopInfoManager;
    @Autowired
    IErpRoleInfoManager roleInfoManager;

    /**
     * 员工注册信息
     *
     * @param info
     * @param roles
     * @return
     */
    @Override
    @Transactional
    public void register(ErpStaffInfo info, List<Integer> roles) throws ErpException {
        staffManager.create(info);
        for (int role : roles) {
            ErpStaffRoleRel rel = new ErpStaffRoleRel();
            rel.setStaffId(info.getId());
            rel.setRoleId(role);
            rel.setGmtCreate(LocalDateTime.now());
            rel.setGmtModified(LocalDateTime.now());
            rel.setIsEnable(true);
            staffRoleRelManager.create(rel);
        }
    }

    /**
     * 根据登录名查询相关用户信息
     *
     * @param loginName
     * @return
     */
    @Override
    public LoginUserBO fetchLoginInfo(String loginName) throws ErpException {
        LoginUserBO bo = null;
        ErpStaffInfo staffInfo = staffManager.selectByLoginName(loginName);
        if (staffInfo != null) {
            bo = new LoginUserBO();
            bo.setId(staffInfo.getId());
            bo.setShopId(staffInfo.getShopId());
            bo.setUsername(staffInfo.getLoginName());
            bo.setPassword(staffInfo.getLoginPwd());
            bo.setName(staffInfo.getStaffName());
            bo.setStaffNo(staffInfo.getStaffNo());
            bo.setStaffPhoto(staffInfo.getStaffPhoto());
            bo.setEnabled(staffInfo.getIsEnable());
            ErpShopInfo shopInfo = shopInfoManager.selectById(staffInfo.getShopId());
            bo.setShopName(shopInfo.getShopName());
            List<ErpRoleInfo> roleInfos = roleInfoManager.selectByStaffId(staffInfo.getId());
            List<String> roles = new ArrayList<>();
            for (ErpRoleInfo info : roleInfos) {
                roles.add(info.getName());
            }
            bo.setShops(this.recursion(bo.getShopId(),1));
            bo.setRoles(roles);
            bo.setSalt("");
        }
        return bo;
    }

    private Set<Integer> recursion(int shopId, int level) {
        Set<Integer> list = new HashSet<>();
        list.add(shopId);
        List<ErpShopInfo> infoList = shopInfoManager.selectByParentId(shopId);
        level++;
        for (ErpShopInfo info : infoList) {
            if (level <= 3) {
                Set<Integer> leafs = this.recursion(info.getId(), level);
                list.addAll(leafs);
            }
        }
        return list;
    }
}
