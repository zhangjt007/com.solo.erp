package com.solo.erp.common.dto.request;


import com.solo.erp.common.bean.OrderDetailBean;
import lombok.Data;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.List;

@Data
@ToString(callSuper = true)
public class OrderRefundRequest extends BaseRequest {

    @NotBlank(message = "订单编号不能为空")
    private String oriOrderNo;
    @Valid
    @NotEmpty
    private List<OrderDetailBean> details;
    private String remark;
}
