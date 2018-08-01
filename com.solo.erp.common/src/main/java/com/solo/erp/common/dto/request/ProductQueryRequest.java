package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class ProductQueryRequest extends BaseQueryRequest {
    private String productNo;
    private String productName;
    private String productType;
    private int season = -1;
    private int year = -1;
    private int wave_band = -1;
    private int discount = -1;
}
