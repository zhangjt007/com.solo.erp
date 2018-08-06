package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class StaffQueryRequest extends BaseQueryRequest{
    private String staffName;
    private String staffNo;
    private String mobile;
}
