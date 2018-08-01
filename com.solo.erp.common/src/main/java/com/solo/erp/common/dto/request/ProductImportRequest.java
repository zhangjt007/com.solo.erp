package com.solo.erp.common.dto.request;


import com.solo.erp.common.bean.ImportProductBean;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Data
@ToString(callSuper = true)
public class ProductImportRequest extends BaseRequest {
    private List<String> list;
}
