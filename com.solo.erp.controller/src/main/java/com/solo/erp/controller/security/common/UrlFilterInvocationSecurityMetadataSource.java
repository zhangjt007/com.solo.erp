package com.solo.erp.controller.security.common;

import com.solo.erp.manager.business.IErpSysInfoManager;
import com.solo.erp.manager.bo.UrlRoleRelBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Component
public class UrlFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    @Autowired
    private IErpSysInfoManager erpSysInfoManager;

    AntPathMatcher antPathMatcher = new AntPathMatcher();


    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        //获取请求地址
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        if ("/login".equals(requestUrl)) {
            return null;
        }
        List<UrlRoleRelBO> allUrlRole = erpSysInfoManager.selectAllMenuAndRole();
        for (UrlRoleRelBO bo : allUrlRole) {
            if (antPathMatcher.match(bo.getUrl(), requestUrl) && bo.getRoles().size() > 0) {
                Set<String> roles = bo.getRoles();
                int size = roles.size();
                String[] values = new String[size];
                roles.toArray(values);
                return SecurityConfig.createList(values);
            }
        }
        //没有匹配上的资源，都是登录访问
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }
}
