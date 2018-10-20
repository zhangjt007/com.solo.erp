package com.solo.erp.dao.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDate;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpShopTargetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.141+08:00", comments="Source Table: erp_shop_target")
    public static final ErpShopTarget erpShopTarget = new ErpShopTarget();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.141+08:00", comments="Source field: erp_shop_target.date")
    public static final SqlColumn<LocalDate> date = erpShopTarget.date;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.141+08:00", comments="Source field: erp_shop_target.shop_id")
    public static final SqlColumn<Integer> shopId = erpShopTarget.shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.141+08:00", comments="Source field: erp_shop_target.target_amout")
    public static final SqlColumn<BigDecimal> targetAmout = erpShopTarget.targetAmout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.141+08:00", comments="Source Table: erp_shop_target")
    public static final class ErpShopTarget extends SqlTable {
        public final SqlColumn<LocalDate> date = column("date", JDBCType.DATE);

        public final SqlColumn<Integer> shopId = column("shop_id", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> targetAmout = column("target_amout", JDBCType.DECIMAL);

        public ErpShopTarget() {
            super("erp_shop_target");
        }
    }
}