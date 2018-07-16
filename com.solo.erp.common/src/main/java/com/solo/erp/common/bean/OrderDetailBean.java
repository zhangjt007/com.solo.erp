package com.solo.erp.common.bean;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class OrderDetailBean implements Serializable {

    private int id;
    private String productSn;
    private int num;

    @NotEmpty(message = "商品实际单价不能为空")
    private BigDecimal realPrice;
}
