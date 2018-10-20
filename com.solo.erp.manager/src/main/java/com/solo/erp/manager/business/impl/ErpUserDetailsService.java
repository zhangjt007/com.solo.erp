package com.solo.erp.manager.business.impl;

import com.solo.erp.manager.bo.LoginUserBO;
import com.solo.erp.manager.facade.IStaffLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class ErpUserDetailsService implements UserDetailsService {

    @Autowired
    IStaffLoginService staffLoginService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        LoginUserBO bo = staffLoginService.fetchLoginInfo(s);
        if (bo == null) {
            throw new UsernameNotFoundException("用户名或密码不正确");
        }
        return bo;
    }
}
