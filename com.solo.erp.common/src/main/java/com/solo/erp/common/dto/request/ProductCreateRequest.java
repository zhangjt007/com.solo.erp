package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString(callSuper = true)
public class ProductCreateRequest extends BaseRequest {
    private String productNo;
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
