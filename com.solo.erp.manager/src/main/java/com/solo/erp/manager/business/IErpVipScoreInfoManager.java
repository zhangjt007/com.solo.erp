package com.solo.erp.manager.business;

import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.model.ErpVipScore;

import java.math.BigDecimal;

public interface IErpVipScoreInfoManager {
    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    ErpVipScore selectById(int id);

    /**
     * 更新积分
     *
     * @param vipId
     * @param score
     * @param dataId
     * @param scoreType
     * @throws ErpException
     */
    void updateScore(Integer vipId, BigDecimal score, String dataId, String scoreType) throws ErpException;

    /**
     * 更新可用积分
     *
     * @param vipId
     * @param score
     * @param dataId
     * @param scoreType
     * @throws ErpException
     */
    void updateValiableScore(Integer vipId, BigDecimal score, String dataId, String scoreType) throws ErpException;

}
