package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@ToString(callSuper = true)
public class StaffResetPwdRequest extends BaseQueryRequest{
    private String oldPwd;
    private String newPwd;
}
