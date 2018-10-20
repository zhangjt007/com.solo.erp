package com.solo.erp.manager.business.impl;

import com.solo.erp.common.bean.NameValueBean;
import com.solo.erp.common.enums.EnumProductType;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.mapper.DynamicSqlMapper;
import com.solo.erp.manager.bo.LoginUserBO;
import com.solo.erp.manager.business.IStatisticsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("statisticsManager")
public class StatisticsManagerImpl implements IStatisticsManager {

    @Autowired
    private DynamicSqlMapper dynamicSqlMapper;

    /**
     * 统计时间段内款式销售金额汇总
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @param limit
     * @return
     */
    @Override
    @Cacheable(value = "statisticTopSaleProduct", key = "#startDate+'_'+#endDate+'_'+#bo.shopId+'_'+#limit")
    public List<NameValueBean> statisticTopSaleProduct(String startDate, String endDate, LoginUserBO bo, int limit) {
        List<HashMap> result = dynamicSqlMapper.statisticTopSaleProduct(startDate, endDate, bo.getShops(), limit);
        List<NameValueBean> list = new ArrayList<>();
        for (HashMap map : result) {
            NameValueBean bean = new NameValueBean();
            bean.setName(map.get("product_no").toString());
            bean.setValue(map.get("amount").toString());
            list.add(bean);
        }
        return list;
    }

    /**
     * 销售汇总报表统计
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @return
     */
    @Override
    public List<HashMap> statisticsSaleInfo(String startDate, String endDate, LoginUserBO bo) {
        return dynamicSqlMapper.statisticsSaleInfo(startDate, endDate, bo.getShops());
    }

    /**
     * VIP销售报表统计
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @return
     */
    @Override
    public List<HashMap> statisticsVIPSaleInfo(String startDate, String endDate, LoginUserBO bo) {
        return dynamicSqlMapper.statisticsVIPSaleInfo(startDate, endDate, bo.getShops());
    }

    /**
     * 根据商品类别统计
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @return
     */
    @Override
    @Cacheable(value = "statisticsByProductType", key = "#startDate+'_'+#endDate+'_'+#bo.shopId")
    public List<NameValueBean> statisticsByProductType(String startDate, String endDate, LoginUserBO bo) {
        List<HashMap> result = dynamicSqlMapper.statisticByProductType(startDate, endDate, bo.getShops());
        List<NameValueBean> list = new ArrayList<>();
        if (result != null) {
            for (HashMap map : result) {
                NameValueBean bean = new NameValueBean();
                String productType = map.get("product_type").toString();
                bean.setName(EnumProductType.getEnumByCode(productType).getMsg());
                bean.setValue(map.get("amount").toString());
                list.add(bean);
            }
        }
        return list;
    }

    /**
     * 订单成交时间统计
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @return
     */
    @Override
    @Cacheable(value = "statisticsOrderTime", key = "#startDate+'_'+#endDate+'_'+#bo.shopId")
    public List<HashMap> statisticsOrderTime(String startDate, String endDate, LoginUserBO bo) {
        return dynamicSqlMapper.statisticsOrderTime(startDate, endDate, bo.getShops());
    }

    /**
     * 统计startDate-endDate时间段销售
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @return
     */
    @Override
    @Cacheable(value = "statisticsPeriodSale", key = "#startDate+'_'+#endDate+'_'+#bo.shopId")
    public List<HashMap> statisticsPeriodSale(String startDate, String endDate, LoginUserBO bo) {
        return dynamicSqlMapper.statisticsSaleInfoByPeriod(startDate, endDate, bo.getShops());
    }

    /**
     * 查询时间段开VIP数量
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @return
     * @throws ErpException
     */
    @Override
    @Cacheable(value = "selectOpenVIPCountByPeriod", key = "#startDate+'_'+#endDate+'_'+#bo.shopId")
    public List<HashMap> selectOpenVIPCountByPeriod(String startDate, String endDate, LoginUserBO bo) throws ErpException {
        return this.dynamicSqlMapper.statisticsOpenVIPByPeriod(startDate, endDate, bo.getShops());
    }
}
