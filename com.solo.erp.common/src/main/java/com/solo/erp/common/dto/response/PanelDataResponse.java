package com.solo.erp.common.dto.response;


import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
public class PanelDataResponse extends BaseResponse {
    private List<String> xAxisList;
    private List<String> amountSumList;
    private List<String> productCountList;
    private List<String> orderCountList;
    private List<String> openVipCountList;

}