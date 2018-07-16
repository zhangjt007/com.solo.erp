package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Data
@ToString(callSuper = true)
public class StaffInfoCreateRequest extends BaseRequest {

    @NotBlank(message = "注册用户名不能为空")
    private String loginName;
    @NotBlank(message = "注册密码不能为空")
    private String loginPwd;
    @NotBlank(message = "员工姓名不能为空")
    private String staffName;
    private String staffPhoto;
    @NotBlank(message = "注册用户手机号不能为空")
    private String mobile;
    private String address;
    @NotBlank(message = "用户角色不能为空")
    private String roleId;
    @NotBlank(message = "归属门店不能为空")
    private String shopId;
}
