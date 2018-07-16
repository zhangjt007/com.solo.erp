package com.solo.erp.common.dto.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse implements Serializable{
    private int code;
    private String message;
}
