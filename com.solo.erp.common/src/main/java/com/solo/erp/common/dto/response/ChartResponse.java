package com.solo.erp.common.dto.response;

import com.solo.erp.common.bean.NameValueBean;
import lombok.Data;

import java.util.List;

@Data
public class ChartResponse extends BaseResponse {
    private List<NameValueBean> data;
}
