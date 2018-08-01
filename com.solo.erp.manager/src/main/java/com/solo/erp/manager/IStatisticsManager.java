package com.solo.erp.manager;

import java.util.HashMap;

public interface IStatisticsManager {
    /**
     * 查询订单信息
     *
     * @return
     */
    HashMap selectTodaySaleOrderInfo(String date, boolean isCashe);

    /**
     * 查询商品销售量
     *
     * @return
     */
    HashMap selectTodaySaleProductCount(String date, boolean isCashe);

    /**
     * 查询开VIP量
     *
     * @return
     */
    HashMap selectTodayOpenVipCount(String date, boolean isCashe);
}