package com.solo.erp.common.dto.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class OrderGenResponse extends BaseResponse {
    private String orderNo;
}
