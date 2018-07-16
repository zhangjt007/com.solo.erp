package com.solo.erp.common.dto.request;


import com.solo.erp.common.bean.OrderDetailBean;
import lombok.Data;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
@ToString(callSuper = true)
public class OrderApplyRequest extends BaseRequest {

    @NotBlank(message = "订单编号不能为空")
    private String orderNo;
    private String payType;
    @DecimalMin(value = "0.1")
    private BigDecimal totalAmount;
    @Valid
    @NotEmpty
    private List<OrderDetailBean> details;
    private String remark;
}
