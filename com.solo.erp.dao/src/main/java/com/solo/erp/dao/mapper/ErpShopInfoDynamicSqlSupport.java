package com.solo.erp.dao.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpShopInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.152+08:00", comments="Source Table: erp_shop_info")
    public static final ErpShopInfo erpShopInfo = new ErpShopInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.152+08:00", comments="Source field: erp_shop_info.id")
    public static final SqlColumn<Integer> id = erpShopInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.152+08:00", comments="Source field: erp_shop_info.shop_name")
    public static final SqlColumn<String> shopName = erpShopInfo.shopName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.152+08:00", comments="Source field: erp_shop_info.shop_address")
    public static final SqlColumn<String> shopAddress = erpShopInfo.shopAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.152+08:00", comments="Source field: erp_shop_info.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpShopInfo.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.152+08:00", comments="Source field: erp_shop_info.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpShopInfo.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.152+08:00", comments="Source field: erp_shop_info.is_enable")
    public static final SqlColumn<Boolean> isEnable = erpShopInfo.isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.152+08:00", comments="Source field: erp_shop_info.parent_id")
    public static final SqlColumn<Integer> parentId = erpShopInfo.parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.152+08:00", comments="Source Table: erp_shop_info")
    public static final class ErpShopInfo extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> shopName = column("shop_name", JDBCType.VARCHAR);

        public final SqlColumn<String> shopAddress = column("shop_address", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<Boolean> isEnable = column("is_enable", JDBCType.BIT);

        public final SqlColumn<Integer> parentId = column("parent_id", JDBCType.INTEGER);

        public ErpShopInfo() {
            super("erp_shop_info");
        }
    }
}