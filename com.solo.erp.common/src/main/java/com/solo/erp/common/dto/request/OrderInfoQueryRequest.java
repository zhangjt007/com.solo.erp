package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString(callSuper = true)
public class OrderInfoQueryRequest extends BaseQueryRequest {
    private String staffName;
    private String orderNo;
    private String orderStatus;
    private String payType;
    private String orderType;
    private LocalDate orderDate;
}
