package com.solo.erp.manager.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.solo.erp.common.bean.CashierViewBean;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.mapper.DynamicSqlMapper;
import com.solo.erp.manager.IErpCashierManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("erpCashierManager")
public class ErpCashierManagerImpl implements IErpCashierManager {

    @Autowired
    private DynamicSqlMapper dynamicSqlMapper;

    /**
     * 根据商品SN查询
     *
     * @param productSn
     * @return
     */
    @Override
    public CashierViewBean getByProductSn(String productSn) throws ErpException{
        List<HashMap> results = dynamicSqlMapper.selectProductInfoBySN(productSn);
        if (results != null && !results.isEmpty()) {
            try {
                CashierViewBean bean = JSON.parseObject(JSONObject.toJSONString(results.get(0)),CashierViewBean.class);
                return bean;
            } catch (Exception e) {
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "数据转换异常");
            }
        } else {
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), EnumRespCode.DATA_ERROR.getMsg());
        }
    }
}
