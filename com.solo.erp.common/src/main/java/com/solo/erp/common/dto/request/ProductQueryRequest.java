package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class ProductQueryRequest extends BaseQueryRequest {
    private String productSn;
    private String productName;
    private String brandName;
    private String size;
    private String color;
    private int discount;
}
