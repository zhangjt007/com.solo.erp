package com.solo.erp.manager.business;

import com.solo.erp.common.bean.NameValueBean;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.manager.bo.LoginUserBO;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public interface IStatisticsManager {


    /**
     * 统计时间段内款式销售金额汇总
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @param limit
     * @return
     */
    List<NameValueBean> statisticTopSaleProduct(String startDate, String endDate, LoginUserBO bo, int limit);

    /**
     * 销售汇总统计
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @return
     */
    List<HashMap> statisticsSaleInfo(String startDate, String endDate, LoginUserBO bo);

    /**
     * VIP销售统计
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @return
     */
    List<HashMap> statisticsVIPSaleInfo(String startDate, String endDate, LoginUserBO bo);

    /**
     * 根据商品类别统计
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @return
     */
    List<NameValueBean> statisticsByProductType(String startDate, String endDate, LoginUserBO bo);

    /**
     * 订单成交时间统计
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @return
     */
    List<HashMap> statisticsOrderTime(String startDate, String endDate, LoginUserBO bo);

    /**
     * 统计startDate-endDate时间段销售
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @return
     */
    List<HashMap> statisticsPeriodSale(String startDate, String endDate, LoginUserBO bo);

    /**
     * 查询时间段开VIP数量
     *
     * @param startDate
     * @param endDate
     * @param bo
     * @return
     * @throws ErpException
     */
    List<HashMap> selectOpenVIPCountByPeriod(String startDate, String endDate, LoginUserBO bo) throws ErpException;

}