package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Data
@ToString(callSuper = true)
public class VipInfoUpdateRequest extends BaseRequest {
    private int id;
    private String userName;
    private String sex;
    private String brithday;
    private String mobile;
    private String email;
    private String address;
    private String remark;
    private String vipRefereeMobile;
}
