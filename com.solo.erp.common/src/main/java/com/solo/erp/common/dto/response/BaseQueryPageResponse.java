package com.solo.erp.common.dto.response;


import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
public class BaseQueryPageResponse<T> extends BaseResponse {
    private int pageNum;
    private int pageSize;
    private int size;
    private int pages;
    private int prePage;
    private int nextPage;
    private long total;
    private List<T> list;
}