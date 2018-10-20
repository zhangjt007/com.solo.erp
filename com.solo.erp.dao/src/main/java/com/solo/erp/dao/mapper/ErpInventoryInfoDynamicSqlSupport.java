package com.solo.erp.dao.mapper;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.time.LocalDateTime;

public final class ErpInventoryInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source Table: erp_inventory_info")
    public static final ErpInventoryInfo erpInventoryInfo = new ErpInventoryInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source field: erp_inventory_info.id")
    public static final SqlColumn<Integer> id = erpInventoryInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source field: erp_inventory_info.product_no")
    public static final SqlColumn<String> productNo = erpInventoryInfo.productNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source field: erp_inventory_info.product_sn")
    public static final SqlColumn<String> productSn = erpInventoryInfo.productSn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source field: erp_inventory_info.product_name")
    public static final SqlColumn<String> productName = erpInventoryInfo.productName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source field: erp_inventory_info.color")
    public static final SqlColumn<String> color = erpInventoryInfo.color;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source field: erp_inventory_info.size")
    public static final SqlColumn<Integer> size = erpInventoryInfo.size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source field: erp_inventory_info.num")
    public static final SqlColumn<Integer> num = erpInventoryInfo.num;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source field: erp_inventory_info.shop_name")
    public static final SqlColumn<String> shopName = erpInventoryInfo.shopName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source field: erp_inventory_info.shop_id")
    public static final SqlColumn<Integer> shopId = erpInventoryInfo.shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source field: erp_inventory_info.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpInventoryInfo.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source field: erp_inventory_info.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpInventoryInfo.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source Table: erp_inventory_info")
    public static final class ErpInventoryInfo extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> productNo = column("product_no", JDBCType.VARCHAR);

        public final SqlColumn<String> productSn = column("product_sn", JDBCType.VARCHAR);

        public final SqlColumn<String> productName = column("product_name", JDBCType.VARCHAR);

        public final SqlColumn<String> color = column("color", JDBCType.VARCHAR);

        public final SqlColumn<Integer> size = column("size", JDBCType.INTEGER);

        public final SqlColumn<Integer> num = column("num", JDBCType.INTEGER);

        public final SqlColumn<String> shopName = column("shop_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> shopId = column("shop_id", JDBCType.INTEGER);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public ErpInventoryInfo() {
            super("erp_inventory_info");
        }
    }
}