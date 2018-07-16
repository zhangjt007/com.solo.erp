package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString(callSuper = true)
public class ProductCreateRequest extends BaseRequest {
    private String productSn;
    private String productName;
    private String productImg;
    private String productThums;
    private String brandName;
    private String size;
    private String color;
    private int discount;
    private BigDecimal tagPrice;
    private BigDecimal realPrice;
    private String remark;
}
