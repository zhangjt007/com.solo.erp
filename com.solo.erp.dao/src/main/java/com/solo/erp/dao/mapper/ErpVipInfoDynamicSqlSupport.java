package com.solo.erp.dao.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpVipInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.038+08:00", comments="Source Table: erp_vip_info")
    public static final ErpVipInfo erpVipInfo = new ErpVipInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.039+08:00", comments="Source field: erp_vip_info.id")
    public static final SqlColumn<Integer> id = erpVipInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.039+08:00", comments="Source field: erp_vip_info.user_name")
    public static final SqlColumn<String> userName = erpVipInfo.userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.039+08:00", comments="Source field: erp_vip_info.sex")
    public static final SqlColumn<String> sex = erpVipInfo.sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.04+08:00", comments="Source field: erp_vip_info.brithday")
    public static final SqlColumn<LocalDate> brithday = erpVipInfo.brithday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.04+08:00", comments="Source field: erp_vip_info.mobile")
    public static final SqlColumn<String> mobile = erpVipInfo.mobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.04+08:00", comments="Source field: erp_vip_info.email")
    public static final SqlColumn<String> email = erpVipInfo.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.04+08:00", comments="Source field: erp_vip_info.address")
    public static final SqlColumn<String> address = erpVipInfo.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.04+08:00", comments="Source field: erp_vip_info.score")
    public static final SqlColumn<BigDecimal> score = erpVipInfo.score;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.04+08:00", comments="Source field: erp_vip_info.history_score")
    public static final SqlColumn<BigDecimal> historyScore = erpVipInfo.historyScore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.04+08:00", comments="Source field: erp_vip_info.is_enable")
    public static final SqlColumn<Boolean> isEnable = erpVipInfo.isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.041+08:00", comments="Source field: erp_vip_info.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpVipInfo.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.041+08:00", comments="Source field: erp_vip_info.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpVipInfo.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.041+08:00", comments="Source field: erp_vip_info.remark")
    public static final SqlColumn<String> remark = erpVipInfo.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.041+08:00", comments="Source field: erp_vip_info.vip_referee_mobile")
    public static final SqlColumn<String> vipRefereeMobile = erpVipInfo.vipRefereeMobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.041+08:00", comments="Source field: erp_vip_info.staff_id")
    public static final SqlColumn<Integer> staffId = erpVipInfo.staffId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.041+08:00", comments="Source field: erp_vip_info.staff_name")
    public static final SqlColumn<String> staffName = erpVipInfo.staffName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.041+08:00", comments="Source field: erp_vip_info.weixin")
    public static final SqlColumn<String> weixin = erpVipInfo.weixin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.041+08:00", comments="Source field: erp_vip_info.qq")
    public static final SqlColumn<String> qq = erpVipInfo.qq;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.042+08:00", comments="Source field: erp_vip_info.create_date")
    public static final SqlColumn<LocalDate> createDate = erpVipInfo.createDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.039+08:00", comments="Source Table: erp_vip_info")
    public static final class ErpVipInfo extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> userName = column("user_name", JDBCType.VARCHAR);

        public final SqlColumn<String> sex = column("sex", JDBCType.CHAR);

        public final SqlColumn<LocalDate> brithday = column("brithday", JDBCType.DATE);

        public final SqlColumn<String> mobile = column("mobile", JDBCType.CHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> score = column("score", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> historyScore = column("history_score", JDBCType.DECIMAL);

        public final SqlColumn<Boolean> isEnable = column("is_enable", JDBCType.BIT);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<String> vipRefereeMobile = column("vip_referee_mobile", JDBCType.CHAR);

        public final SqlColumn<Integer> staffId = column("staff_id", JDBCType.INTEGER);

        public final SqlColumn<String> staffName = column("staff_name", JDBCType.VARCHAR);

        public final SqlColumn<String> weixin = column("weixin", JDBCType.VARCHAR);

        public final SqlColumn<String> qq = column("qq", JDBCType.VARCHAR);

        public final SqlColumn<LocalDate> createDate = column("create_date", JDBCType.DATE);

        public ErpVipInfo() {
            super("erp_vip_info");
        }
    }
}