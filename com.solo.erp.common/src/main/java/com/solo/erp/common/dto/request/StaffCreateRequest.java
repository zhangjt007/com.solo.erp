package com.solo.erp.common.dto.request;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@ToString(callSuper = true)
public class StaffCreateRequest extends BaseQueryRequest{
    private String staffName;
    private String sex;
    private Date brithday;
    private String mobile;
    private String address;
    private int shopId;
    private List<Integer> roles;
}
