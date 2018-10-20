package com.solo.erp.dao.mapper;

import com.solo.erp.dao.model.ErpProductInfo;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public interface DynamicSqlMapper {
    /**
     * 查询所有菜单所需要的权限信息，权限信息使用"|"分隔（权限校验时使用）
     *
     * @return
     */
    List<HashMap> selectAllMenuAndRole();

    /**
     * 批量插入商品信息（商品模块导入使用）
     *
     * @param list
     */
    void batchInsertProduct(@Param("list") List<ErpProductInfo> list);

    /**
     * 查询某日订单信息(首页卡牌显示使用)
     *
     * @param date
     * @return
     */
    HashMap statisticsSaleInfoByDay(@Param("date") String date, @Param("shopIds") Set<Integer> shopIds);

    /**
     * 查询某日开VIP量(首页卡牌显示使用)
     *
     * @param date
     * @return
     */
    HashMap statisticsOpenVIPByDay(@Param("date") String date, @Param("shopIds") Set<Integer> shopIds);

    /**
     * 查询某时间段订单信息(首页折线图使用)
     *
     * @param startDate
     * @param endDate
     * @param shopIds
     * @return
     */
    List<HashMap> statisticsSaleInfoByPeriod(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("shopIds") Set<Integer> shopIds);

    /**
     * 查询某时间段开VIP量(首页折线图使用)
     *
     * @param startDate
     * @param endDate
     * @param shopIds
     * @return
     */
    List<HashMap> statisticsOpenVIPByPeriod(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("shopIds") Set<Integer> shopIds);


    /**
     * 统计时间段内款式销售金额汇总（首页TOP排行使用）
     *
     * @param startDate
     * @param endDate
     * @return
     */
    List<HashMap> statisticTopSaleProduct(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("shopIds") Set<Integer> shopIds, @Param("limit") int limit);

    /**
     * 根据商品类别统计（首页饼图使用）
     *
     * @param startDate
     * @param endDate
     * @param shopIds
     * @return
     */
    List<HashMap> statisticByProductType(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("shopIds") Set<Integer> shopIds);


    /**
     * 统计销售信息（报表模块使用）
     *
     * @param startDate
     * @param endDate
     * @param shopIds
     * @return
     */
    List<HashMap> statisticsSaleInfo(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("shopIds") Set<Integer> shopIds);

    /**
     * 统计VIP销售（报表模块使用）
     *
     * @param startDate
     * @param endDate
     * @param shopIds
     * @return
     */
    List<HashMap> statisticsVIPSaleInfo(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("shopIds") Set<Integer> shopIds);

    /**
     * 根据生日查询（首页最近过生日使用）
     *
     * @param startDate1
     * @param endDate1
     * @param startDate2
     * @param endDate2
     * @return
     */
    List<HashMap> selectVIPByLastBrithday(@Param("startDate1") String startDate1, @Param("endDate1") String endDate1, @Param("startDate2") String startDate2, @Param("endDate2") String endDate2);

    /**
     * 统计订单成交时间（首页显示使用）
     *
     * @param startDate
     * @param endDate
     * @param shopIds
     * @return
     */
    List<HashMap> statisticsOrderTime(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("shopIds") Set<Integer> shopIds);

    /**
     * 更新库存量
     *
     * @param inc
     * @param shopId
     * @param productSn
     * @return
     */
    int addInventoryNumByProductSn(@Param("inc") Integer inc, @Param("shopId") Integer shopId, @Param("productSn") String productSn);

    /**
     * 更新积分和历史积分
     *
     * @param score
     * @param vipId
     * @return
     */
    int addScoreAndHisScoreByVipId(@Param("score") BigDecimal score, @Param("vipId") Integer vipId);

    /**
     * 更新积分
     *
     * @param score
     * @param vipId
     * @return
     */
    int addScoreByVipId(@Param("score") BigDecimal score, @Param("vipId") Integer vipId);
}
