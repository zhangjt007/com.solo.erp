package com.solo.erp.dao.mapper;

import com.solo.erp.dao.model.ErpProductInfo;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface DynamicSqlMapper {
    /**
     * 查询所有菜单所需要的权限信息，权限信息使用"|"分隔（权限校验时使用）
     *
     * @return
     */
    List<HashMap> selectAllMenuAndRole();

    /**
     * 查询登录用户相关信息
     *
     * @return
     */
    HashMap selectLoginStaffInfoByLoginName(@Param("loginName") String loginName);

    /**
     * 根据SN查询收银台显示数据
     *
     * @param productSn
     * @return
     */
    List<HashMap> selectProductInfoBySN(@Param("productSn") String productSn);

    /**
     * 批量插入商品信息
     * @param list
     */
    void batchInsertProduct(@Param("list") List<ErpProductInfo> list);

    /**
     * 查询订单信息
     *
     * @param date
     * @return
     */
    HashMap selectTodaySaleOrderInfo(@Param("date") String date);

    /**
     * 查询商品销售量
     *
     * @param date
     * @return
     */
    HashMap selectTodaySaleProductCount(@Param("date") String date);

    /**
     * 查询开VIP量
     *
     * @param date
     * @return
     */
    HashMap selectTodayOpenVipCount(@Param("date") String date);

}
