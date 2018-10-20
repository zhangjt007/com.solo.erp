package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@ToString(callSuper = true)
public class StaffCreateRequest extends BaseRequest{
    private String staffName;
    private String sex;
    private LocalDate brithday;
    private String mobile;
    private String address;
    private Integer shopId;
    private String certNo;
    private List<Integer> roles;
}
