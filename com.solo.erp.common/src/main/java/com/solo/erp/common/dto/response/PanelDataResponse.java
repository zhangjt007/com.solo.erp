package com.solo.erp.common.dto.response;


import com.solo.erp.common.bean.NameValueBean;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
public class PanelDataResponse extends BaseResponse {
    private List<NameValueBean> amountSumList;
    private List<NameValueBean> productCountList;
    private List<NameValueBean> orderCountList;
    private List<NameValueBean> openVipCountList;
}