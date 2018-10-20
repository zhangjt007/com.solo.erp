package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
@ToString(callSuper = true)
public class OrderConfirmRequest extends BaseRequest {

    @NotBlank(message = "订单编号不能为空")
    private String orderNo;
    @NotBlank(message = "支付类型不能为空")
    private String payType;
    private BigDecimal payAmount;
    private boolean scorePayFlag;
    private BigDecimal payScore;
    private String remark;
}
