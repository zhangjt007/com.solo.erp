package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class InventoryQueryRequest extends BaseQueryRequest {
    private int num;
    private String productSn;
    private String productName;
    private String brandName;
    private int size = -1;
    private String color;
}
