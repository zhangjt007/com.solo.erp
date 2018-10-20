package com.solo.erp.common.dto.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class StatisticsCommonResp<T> extends BaseResponse {
    private T data;
}
