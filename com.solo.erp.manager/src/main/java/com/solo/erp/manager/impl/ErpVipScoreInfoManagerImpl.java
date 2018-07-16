package com.solo.erp.manager.impl;

import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.mapper.ErpVipInfoMapper;
import com.solo.erp.dao.mapper.ErpVipScoreMapper;
import com.solo.erp.dao.model.ErpVipInfo;
import com.solo.erp.dao.model.ErpVipScore;
import com.solo.erp.manager.IErpVipScoreInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service("erpVipScoreInfoManager")
public class ErpVipScoreInfoManagerImpl implements IErpVipScoreInfoManager {

    @Autowired
    ErpVipInfoMapper erpVipInfoMapper;
    @Autowired
    ErpVipScoreMapper erpVipScoreMapper;

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

    @Override
    public void scorePay(ErpVipInfo vip, BigDecimal score, String dataId, String scoreType) throws ErpException {
        ErpVipScore vipScore = new ErpVipScore();
        vipScore.setDataId(dataId);
        vipScore.setDataSrc(scoreType);
        vipScore.setGmtCreate(new Date());
        vipScore.setGmtModified(new Date());
        vipScore.setScore(score.negate());
        vipScore.setVipId(vip.getId());
        erpVipScoreMapper.insert(vipScore);
        vip.setScore(vip.getScore().subtract(score));
        erpVipInfoMapper.updateByPrimaryKeySelective(vip);
    }

    @Override
    public void rewardScore(ErpVipInfo vip, BigDecimal score, String dataId, String scoreType) throws ErpException {
        ErpVipScore vipScore = new ErpVipScore();
        vipScore.setDataId(String.valueOf(dataId));
        vipScore.setDataSrc(scoreType);
        vipScore.setGmtCreate(new Date());
        vipScore.setGmtModified(new Date());
        vipScore.setScore(score);
        vipScore.setVipId(vip.getId());
        erpVipScoreMapper.insert(vipScore);
        vip.setScore(vip.getScore().add(score));
        vip.setScore(vip.getHistoryScore().add(score));
        erpVipInfoMapper.updateByPrimaryKeySelective(vip);
    }

    @Override
    public void reversalScore(ErpVipInfo vip, BigDecimal score, String dataId, String scoreType) throws ErpException {
        ErpVipScore vipScore = new ErpVipScore();
        vipScore.setDataId(String.valueOf(dataId));
        vipScore.setDataSrc(scoreType);
        vipScore.setGmtCreate(new Date());
        vipScore.setGmtModified(new Date());
        vipScore.setScore(score.negate());
        vipScore.setVipId(vip.getId());
        erpVipScoreMapper.insert(vipScore);
        vip.setScore(vip.getScore().subtract(score));
        vip.setScore(vip.getHistoryScore().subtract(score));
        erpVipInfoMapper.updateByPrimaryKeySelective(vip);
    }
}
