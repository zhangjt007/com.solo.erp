package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Data
@ToString(callSuper = true)
public class VipInfoCreateRequest extends BaseRequest {
    @NotBlank(message = "VIP用户名不能为空")
    private String userName;
    @NotBlank(message = "性别不能为空")
    private String sex;
    @NotBlank(message = "生日不能为空")
    private String brithday;
    @NotBlank(message = "手机号不能为空")
    private String mobile;
    private String email;
    private String address;
    private String remark;
    private String vipRefereeMobile;
}
