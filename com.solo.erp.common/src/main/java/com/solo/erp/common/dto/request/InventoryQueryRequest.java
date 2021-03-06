package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class InventoryQueryRequest extends BaseQueryRequest {
    private Integer num;
    private String productSn;
    private String productNo;
    private String productName;
    private String brandName;
    private Integer size;
    private String color;
}
