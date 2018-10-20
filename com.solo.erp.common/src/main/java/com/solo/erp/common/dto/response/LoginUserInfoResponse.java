package com.solo.erp.common.dto.response;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class LoginUserInfoResponse extends BaseResponse {
    private String token;
    private String introduction;
    private List<String> roles;
    private String avatar;
    private String name;
    private String shopName;
}
