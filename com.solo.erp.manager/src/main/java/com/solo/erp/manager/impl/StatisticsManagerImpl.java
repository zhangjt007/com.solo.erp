package com.solo.erp.manager.impl;

import com.solo.erp.dao.mapper.DynamicSqlMapper;
import com.solo.erp.manager.IStatisticsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service("statisticsManager")
public class StatisticsManagerImpl implements IStatisticsManager {
    @Autowired
    private DynamicSqlMapper dynamicSqlMapper;

    /**
     * 查询订单信息
     *
     * @param date
     * @return
     */
    @Override
    @Cacheable(value = "saleOrderInfo", key = "#date", condition = "#isCashe")
    public HashMap selectTodaySaleOrderInfo(String date, boolean isCashe) {
        return dynamicSqlMapper.selectTodaySaleOrderInfo(date);
    }

    /**
     * 查询商品销售量
     *
     * @param date
     * @return
     */
    @Override
    @Cacheable(value = "saleProductCount", key = "#date", condition = "#isCashe")
    public HashMap selectTodaySaleProductCount(String date, boolean isCashe) {
        return dynamicSqlMapper.selectTodaySaleProductCount(date);
    }

    /**
     * 查询开VIP量
     *
     * @param date
     * @return
     */
    @Override
    @Cacheable(value = "openVipCount", key = "#date", condition = "#isCashe")
    public HashMap selectTodayOpenVipCount(String date, boolean isCashe) {
        return dynamicSqlMapper.selectTodayOpenVipCount(date);
    }
}
