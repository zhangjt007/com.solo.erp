package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Data
@ToString(callSuper = true)
public class VipInfoCreateRequest extends BaseRequest {
    @NotBlank(message = "VIP用户名不能为空")
    private String userName;
    @NotBlank(message = "性别不能为空")
    private String sex;
    @NotNull(message = "生日不能为空")
    private LocalDate brithday;
    @NotBlank(message = "手机号不能为空")
    private String mobile;
    private String email;
    private String address;
    private String remark;
    private String vipRefereeMobile;
}
