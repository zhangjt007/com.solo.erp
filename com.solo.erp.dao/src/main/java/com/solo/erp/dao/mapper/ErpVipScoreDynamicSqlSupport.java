package com.solo.erp.dao.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpVipScoreDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source Table: erp_vip_score")
    public static final ErpVipScore erpVipScore = new ErpVipScore();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.id")
    public static final SqlColumn<Integer> id = erpVipScore.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.vip_id")
    public static final SqlColumn<Integer> vipId = erpVipScore.vipId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.score")
    public static final SqlColumn<BigDecimal> score = erpVipScore.score;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.data_src")
    public static final SqlColumn<String> dataSrc = erpVipScore.dataSrc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source field: erp_vip_score.data_id")
    public static final SqlColumn<String> dataId = erpVipScore.dataId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source field: erp_vip_score.remark")
    public static final SqlColumn<String> remark = erpVipScore.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source field: erp_vip_score.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpVipScore.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source field: erp_vip_score.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpVipScore.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source Table: erp_vip_score")
    public static final class ErpVipScore extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> vipId = column("vip_id", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> score = column("score", JDBCType.DECIMAL);

        public final SqlColumn<String> dataSrc = column("data_src", JDBCType.CHAR);

        public final SqlColumn<String> dataId = column("data_id", JDBCType.VARCHAR);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public ErpVipScore() {
            super("erp_vip_score");
        }
    }
}