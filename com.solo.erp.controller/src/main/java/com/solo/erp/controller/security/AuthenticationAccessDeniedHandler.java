package com.solo.erp.controller.security;

import com.alibaba.fastjson.JSON;
import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.enums.EnumRespCode;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class AuthenticationAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        BaseResponse resp = new BaseResponse();
        resp.setCode(EnumRespCode.NOT_ACCESS.getCode());
        resp.setMessage(EnumRespCode.NOT_ACCESS.getMsg());
        PrintWriter out = httpServletResponse.getWriter();
        out.write(JSON.toJSONString(resp));
        out.flush();
        out.close();
    }
}
