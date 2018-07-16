package com.solo.erp.common.dto.request;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class InventoryUpdateRequest extends BaseRequest {
    private String id;
    private int num;
}
