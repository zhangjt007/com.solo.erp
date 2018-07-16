package com.solo.erp.controller.security.common;

import com.alibaba.fastjson.JSON;
import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.enums.EnumRespCode;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class ErpAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.setContentType("application/json;charset=utf-8");
        PrintWriter out = httpServletResponse.getWriter();
        BaseResponse resp = new BaseResponse();
        resp.setCode(EnumRespCode.LOGIN_FAILED.getCode());
        if (e instanceof UsernameNotFoundException || e instanceof BadCredentialsException) {
            resp.setMessage("用户名或密码输入错误，登录失败!");
        } else if (e instanceof DisabledException) {
            resp.setMessage("账户被禁用，登录失败，请联系管理员!");
        } else {
            resp.setMessage("登录失败!");
        }
        out.write(JSON.toJSONString(resp));
        out.flush();
        out.close();
    }
}
