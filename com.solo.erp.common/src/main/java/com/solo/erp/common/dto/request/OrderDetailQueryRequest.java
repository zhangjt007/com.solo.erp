package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class OrderDetailQueryRequest extends BaseQueryRequest {
    private String orderNo;
    private String productNo;
}
