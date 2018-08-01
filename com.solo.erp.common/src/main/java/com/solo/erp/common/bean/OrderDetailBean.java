package com.solo.erp.common.bean;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class OrderDetailBean implements Serializable {

    private String productSn;
    private int count;

    @NotNull(message = "商品实际单价不能为空")
    private BigDecimal realPrice;
}
