package com.solo.erp.manager.business.impl;

import com.solo.erp.manager.business.ISecurityAuthManager;
import com.solo.erp.manager.bo.LoginUserBO;
import com.solo.erp.manager.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import static com.solo.erp.common.constant.SecurityConstants.TOKEN_PREFIX;

@Service("securityAuthManager")
public class SecurityAuthManagerImpl implements ISecurityAuthManager {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Qualifier("userDetailsService")
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    /**
     * 密码登录
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public String login(String username, String password) {
        UsernamePasswordAuthenticationToken upToken = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authentication = authenticationManager.authenticate(upToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        return jwtTokenUtil.generateToken(userDetails);
    }

    /**
     * 更新缓存
     *
     * @param oldToken
     * @return
     */
    @Override
    public String refreshToken(String oldToken) {
        final String token = oldToken.substring(TOKEN_PREFIX.length());
        String username = jwtTokenUtil.getUsernameFromToken(token);
        LoginUserBO user = (LoginUserBO) userDetailsService.loadUserByUsername(username);
        if (jwtTokenUtil.canTokenBeRefreshed(token, user.getLastPasswordResetDate())){
            return jwtTokenUtil.refreshToken(token);
        }
        return null;
    }
}
