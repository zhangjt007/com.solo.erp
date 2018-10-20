package com.solo.erp.dao.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpVipRanksDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source Table: erp_vip_ranks")
    public static final ErpVipRanks erpVipRanks = new ErpVipRanks();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source field: erp_vip_ranks.id")
    public static final SqlColumn<Integer> id = erpVipRanks.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source field: erp_vip_ranks.rank_name")
    public static final SqlColumn<String> rankName = erpVipRanks.rankName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source field: erp_vip_ranks.start_score")
    public static final SqlColumn<BigDecimal> startScore = erpVipRanks.startScore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source field: erp_vip_ranks.end_score")
    public static final SqlColumn<BigDecimal> endScore = erpVipRanks.endScore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source field: erp_vip_ranks.rebate")
    public static final SqlColumn<Integer> rebate = erpVipRanks.rebate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source field: erp_vip_ranks.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpVipRanks.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source field: erp_vip_ranks.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpVipRanks.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source field: erp_vip_ranks.is_enable")
    public static final SqlColumn<Boolean> isEnable = erpVipRanks.isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source Table: erp_vip_ranks")
    public static final class ErpVipRanks extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> rankName = column("rank_name", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> startScore = column("start_score", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> endScore = column("end_score", JDBCType.DECIMAL);

        public final SqlColumn<Integer> rebate = column("rebate", JDBCType.INTEGER);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<Boolean> isEnable = column("is_enable", JDBCType.BIT);

        public ErpVipRanks() {
            super("erp_vip_ranks");
        }
    }
}