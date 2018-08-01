package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString(callSuper = true)
public class ProductUpdateRequest extends BaseRequest {
    private int id;
    private String productName;
    private String productImg;
    private String productThums;
    private String size;
    private String color;
    private BigDecimal tagPrice;
    private BigDecimal realPrice;
    private BigDecimal costPrice;
    private String remark;
}
