package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class ProductQueryRequest extends BaseQueryRequest {
    private String productNo;
    private String productName;
    private String productType;
    private Integer season;
    private Integer year;
    private Integer waveBand;
    private Integer discount;
}
