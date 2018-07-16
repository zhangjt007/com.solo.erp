package com.solo.erp.manager.impl;

import com.solo.erp.manager.IErpStaffManager;
import com.solo.erp.manager.bo.LoginUserBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service("userDetailsService")
public class ErpUserDetailsService implements UserDetailsService {

    @Autowired
    IErpStaffManager erpStaffManager;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        LoginUserBO bo = erpStaffManager.selectLoginUserInfo(s);
        if (bo == null) {
            throw new UsernameNotFoundException("用户名或密码不正确");
        }
        return bo;
    }
}
