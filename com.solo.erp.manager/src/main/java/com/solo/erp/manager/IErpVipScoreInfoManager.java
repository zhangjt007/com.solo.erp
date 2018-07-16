package com.solo.erp.manager;

import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.model.ErpVipInfo;
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
     * 积分支付
     *
     * @param vip
     * @param score
     * @param dataId
     * @param scoreType
     * @throws ErpException
     */
    void scorePay(ErpVipInfo vip, BigDecimal score, String dataId, String scoreType) throws ErpException;

    /**
     * 积分奖励
     *
     * @param vip
     * @param score
     * @param dataId
     * @param scoreType
     * @throws ErpException
     */
    void rewardScore(ErpVipInfo vip, BigDecimal score, String dataId, String scoreType) throws ErpException;

    /**
     * 积分冲正
     *
     * @param vip
     * @param score
     * @param dataId
     * @param scoreType
     * @throws ErpException
     */
    void reversalScore(ErpVipInfo vip, BigDecimal score, String dataId, String scoreType) throws ErpException;
}
