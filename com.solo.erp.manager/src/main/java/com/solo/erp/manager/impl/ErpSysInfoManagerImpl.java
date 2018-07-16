package com.solo.erp.manager.impl;

import com.solo.erp.dao.mapper.DynamicSqlMapper;
import com.solo.erp.manager.IErpSysInfoManager;
import com.solo.erp.manager.bo.UrlRoleRelBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("erpSysInfoManager")
public class ErpSysInfoManagerImpl implements IErpSysInfoManager {

    @Autowired
    DynamicSqlMapper dynamicSqlMapper;

    /**
     * 查询所有url所需要的角色权限
     * 当菜单表、角色表、菜单角色关联表三张表
     * 有任何一个地方做变更都应该删除该处缓存重新获取
     *
     * @return
     */
    @Override
    @Cacheable(value = "sysInfoCache", key = "#root.methodName")
    public List<UrlRoleRelBO> selectAllMenuAndRole() {
        List<UrlRoleRelBO> list = new ArrayList<>();
        List<HashMap> result = dynamicSqlMapper.selectAllMenuAndRole();
        if (result != null && !result.isEmpty()) {
            ListIterator<HashMap> iterator = result.listIterator();
            while (iterator.hasNext()) {
                Map entry = iterator.next();
                UrlRoleRelBO bo = new UrlRoleRelBO();
                bo.setUrl(entry.get("url").toString());
                Set<String> roles = new HashSet<>();
                String roleStr = entry.get("role_names").toString();
                String[] roleArray = roleStr.split("\\|");
                for (int i = 0; i < roleArray.length; i++) {
                    roles.add(roleArray[i]);
                }
                bo.setRoles(roles);
                list.add(bo);
            }
        }
        return list;
    }
}
