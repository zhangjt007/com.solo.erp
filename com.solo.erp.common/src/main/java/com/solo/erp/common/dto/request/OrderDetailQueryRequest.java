package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString(callSuper = true)
public class OrderDetailQueryRequest extends BaseQueryRequest {
    private String orderNo;
    private String productNo;
    private String productSn;
    private LocalDate orderDate;
    private String orderStatus;
}
