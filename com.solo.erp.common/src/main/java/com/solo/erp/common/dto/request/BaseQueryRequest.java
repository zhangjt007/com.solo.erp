package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class BaseQueryRequest extends BaseRequest {
    private int limit;
    private int page;
    private String sort;
    private int shopId;
    private String gmtCreate;
}