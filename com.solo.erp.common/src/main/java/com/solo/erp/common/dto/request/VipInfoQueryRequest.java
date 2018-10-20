package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString(callSuper = true)
public class VipInfoQueryRequest extends BaseQueryRequest{
    private String userName;
    private LocalDate brithday;
    private String mobile;
    private String vipRefereeMobile;
}
