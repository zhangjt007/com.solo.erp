package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class InventoryQueryRequest extends BaseQueryRequest {
    private String productSn;
    private int num;
}
