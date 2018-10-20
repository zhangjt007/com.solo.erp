package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;

@Data
@ToString(callSuper = true)
public class VipInfoUpdateRequest extends BaseRequest {
    private Integer id;
    private String userName;
    private String sex;
    private LocalDate brithday;
    private String mobile;
    private String email;
    private String address;
    private String remark;
    private String vipRefereeMobile;
}
