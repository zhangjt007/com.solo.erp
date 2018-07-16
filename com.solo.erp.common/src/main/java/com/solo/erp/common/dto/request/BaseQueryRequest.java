package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class BaseQueryRequest extends BaseRequest {
    private int pageNum;
    private int pageSize;
    private String sort;
    private int shopId;
    private String gmtCreate;
}