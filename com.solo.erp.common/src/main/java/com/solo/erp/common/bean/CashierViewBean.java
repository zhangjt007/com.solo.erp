package com.solo.erp.common.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CashierViewBean implements Serializable {
    private String productSn;
    private String productNo;
    private String productName;
    private String productType;
    private String brandName;
    private Integer year;
    private Integer waveBand;
    private Integer season;
    private String productImg;
    private BigDecimal tagPrice;
    private BigDecimal realPrice;
    private BigDecimal costPrice;
    private Integer size;
    private String color;
    private Integer discount;
    private Integer num;
    private String remark;

}
