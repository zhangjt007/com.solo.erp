package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class VipInfoQueryRequest extends BaseQueryRequest{
    private String userName;
    private String brithday;
    private String mobile;
    private String vipRefereeMobile;
}
