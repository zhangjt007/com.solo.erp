package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class OrderInfoQueryRequest extends BaseQueryRequest {
    private String staffName;
    private String orderNo;
    private String orderStatus;
    private String payType;
    private boolean refundFlag;
}
