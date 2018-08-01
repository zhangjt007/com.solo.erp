package com.solo.erp.common.utils;


import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

public class BeansUtils {

    public static void transMap2Bean2(Map<String, Object> map, Object obj) throws ErpException{
        if (map == null || obj == null) {
            return;
        }
        try {
            BeanUtils.populate(obj, map);
        } catch (Exception e) {
            throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(),"转换错误");
        }
    }

}
