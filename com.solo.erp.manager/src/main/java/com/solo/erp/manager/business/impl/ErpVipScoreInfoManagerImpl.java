package com.solo.erp.manager.business.impl;

import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.mapper.DynamicSqlMapper;
import com.solo.erp.dao.mapper.ErpVipInfoMapper;
import com.solo.erp.dao.mapper.ErpVipScoreMapper;
import com.solo.erp.dao.model.ErpVipScore;
import com.solo.erp.manager.business.IErpVipScoreInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service("erpVipScoreInfoManager")
public class ErpVipScoreInfoManagerImpl implements IErpVipScoreInfoManager {

    @Autowired
    ErpVipInfoMapper erpVipInfoMapper;
    @Autowired
    ErpVipScoreMapper erpVipScoreMapper;
    @Autowired
    DynamicSqlMapper dynamicSqlMapper;

    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    @Override
    public ErpVipScore selectById(int id) {
        ErpVipScore info = erpVipScoreMapper.selectByPrimaryKey(id);
        return info;
    }

    /**
     * 更新可用积分和历史积分
     * @param vipId
     * @param score
     * @param dataId
     * @param scoreType
     * @throws ErpException
     */
    @Override
    public void updateScore(Integer vipId, BigDecimal score, String dataId, String scoreType) throws ErpException {
        ErpVipScore vipScore = new ErpVipScore();
        vipScore.setDataId(String.valueOf(dataId));
        vipScore.setDataSrc(scoreType);
        vipScore.setGmtCreate(LocalDateTime.now());
        vipScore.setGmtModified(LocalDateTime.now());
        vipScore.setScore(score);
        vipScore.setVipId(vipId);
        erpVipScoreMapper.insert(vipScore);
        dynamicSqlMapper.addScoreAndHisScoreByVipId(score, vipId);
    }

    /**
     * 更新可用积分
     *
     * @param vipId
     * @param score
     * @param dataId
     * @param scoreType
     * @throws ErpException
     */
    @Override
    public void updateValiableScore(Integer vipId, BigDecimal score, String dataId, String scoreType) throws ErpException {
        ErpVipScore vipScore = new ErpVipScore();
        vipScore.setDataId(String.valueOf(dataId));
        vipScore.setDataSrc(scoreType);
        vipScore.setGmtCreate(LocalDateTime.now());
        vipScore.setGmtModified(LocalDateTime.now());
        vipScore.setScore(score);
        vipScore.setVipId(vipId);
        erpVipScoreMapper.insert(vipScore);
        dynamicSqlMapper.addScoreByVipId(score, vipId);
    }
}
