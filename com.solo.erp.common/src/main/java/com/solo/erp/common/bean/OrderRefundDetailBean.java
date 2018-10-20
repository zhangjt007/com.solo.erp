package com.solo.erp.common.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class OrderRefundDetailBean implements Serializable {
    private Integer id;
    private Integer num;
}
