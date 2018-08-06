package com.solo.erp.common.dto.response;

import com.solo.erp.common.bean.DictOptionBean;
import lombok.Data;

import java.util.List;

@Data
public class SystemDictResponse<T> extends BaseResponse {

    private List<DictOptionBean<T>> options;

}
