package com.solo.erp.controller.base;

import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.exception.ErpException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(CustomizedResponseEntityExceptionHandler.class);

    @ExceptionHandler(ErpException.class)
    public final ResponseEntity<BaseResponse> handleException(ErpException ex, WebRequest request) {
        ex.printStackTrace();
        BaseResponse respDTO = new BaseResponse();
        respDTO.setCode(ex.getErrorCode());
        respDTO.setMessage(ex.getErrorMsg());
        return new ResponseEntity<>(respDTO, HttpStatus.ACCEPTED);
    }

}
