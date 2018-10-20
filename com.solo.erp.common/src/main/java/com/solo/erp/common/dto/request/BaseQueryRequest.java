package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString(callSuper = true)
public class BaseQueryRequest extends BaseRequest {
    private Integer limit;
    private Integer page;
    private String sort;
    private Integer shopId;
    private LocalDate gmtCreate;
    private LocalDate startDate;
    private LocalDate endDate;
}