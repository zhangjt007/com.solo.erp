package com.solo.erp.common.dto.request;


import com.solo.erp.common.bean.OrderRefundDetailBean;
import lombok.Data;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@ToString(callSuper = true)
public class OrderRefundRequest extends BaseRequest {
    @Valid
    @NotEmpty
    private List<OrderRefundDetailBean> list;
}
