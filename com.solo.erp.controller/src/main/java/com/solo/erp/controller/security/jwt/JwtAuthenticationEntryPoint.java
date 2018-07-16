package com.solo.erp.controller.security.jwt;

import com.alibaba.fastjson.JSONObject;
import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.enums.EnumRespCode;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json; charset=utf-8");
        BaseResponse resp = new BaseResponse();
        if (e instanceof BadCredentialsException) { /**身份认证未通过*/
            resp.setCode(EnumRespCode.LOGIN_FAILED.getCode());
            resp.setMessage(EnumRespCode.LOGIN_FAILED.getMsg());
        } else {
            resp.setCode(EnumRespCode.NOT_ACCESS.getCode());
            resp.setMessage(EnumRespCode.NOT_ACCESS.getMsg());
        }
        httpServletResponse.getWriter().write(JSONObject.toJSONString(resp));
    }
}
