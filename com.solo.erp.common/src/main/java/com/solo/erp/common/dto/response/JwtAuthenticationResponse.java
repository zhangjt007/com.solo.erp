package com.solo.erp.common.dto.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class JwtAuthenticationResponse extends BaseResponse {
    private String token;
}
