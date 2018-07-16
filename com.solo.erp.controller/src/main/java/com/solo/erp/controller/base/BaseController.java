package com.solo.erp.controller.base;

import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.manager.bo.LoginUserBO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

public class BaseController {

    private static final Logger log = LoggerFactory.getLogger(BaseController.class);


    public void checkError(BindingResult result) throws ErpException {

        if (result.hasErrors()) {
            log.error("数据校验失败,共[{}]处", result.getAllErrors().size());
            if (log.isDebugEnabled()) {
                for (ObjectError error : result.getAllErrors()) {
                    log.debug("{}-->{}", error.getObjectName(), error.getDefaultMessage());
                }
            }
            // 取第一个错误返回
            if (result.hasGlobalErrors()) {
                ObjectError error = result.getGlobalError();
                log.info("取Global错误抛出异常:{}-->{}", error.getObjectName(), error.getDefaultMessage());
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), error.getDefaultMessage());
            } else {
                FieldError fError = result.getFieldErrors().get(0);
                log.info("取第一个Field错误抛出异常:{}-->{}", fError.getField(), fError.getDefaultMessage());
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), fError.getDefaultMessage());
            }
        }
    }

    public LoginUserBO getSessionLoginUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginUserBO bo = (LoginUserBO) authentication.getPrincipal();
        return bo;
    }
}
