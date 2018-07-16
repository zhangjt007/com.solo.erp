package com.solo.erp.common.dto.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class StaffRegisterResponse extends BaseResponse {
    private String staffNo;
}
