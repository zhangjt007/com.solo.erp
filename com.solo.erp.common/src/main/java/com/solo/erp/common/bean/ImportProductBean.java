package com.solo.erp.common.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ImportProductBean implements Serializable{
    private String productNo;
    private String productName;
    private String productImg;
    private String productThums;
    private BigDecimal tagPrice;
    private BigDecimal realPrice;
    private String remark;
    private String size;
    private String color;
}