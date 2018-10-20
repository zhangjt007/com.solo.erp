package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class InventoryCreateRequest extends BaseRequest {
    private String productSn;
    private Integer num;
}
