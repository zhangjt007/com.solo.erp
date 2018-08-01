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
    private String year;
    private String waveBand;
    private String season;
    private String productImg;
    private BigDecimal tagPrice;
    private BigDecimal realPrice;
    private BigDecimal costPrice;
    private String size;
    private String color;
    private Integer discount;
    private Integer num;
    private String remark;

}
