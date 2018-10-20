package com.solo.erp.dao.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpRoleInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source Table: erp_role_info")
    public static final ErpRoleInfo erpRoleInfo = new ErpRoleInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source field: erp_role_info.id")
    public static final SqlColumn<Integer> id = erpRoleInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source field: erp_role_info.name")
    public static final SqlColumn<String> name = erpRoleInfo.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.056+08:00", comments="Source field: erp_role_info.name_zn")
    public static final SqlColumn<String> nameZn = erpRoleInfo.nameZn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.056+08:00", comments="Source field: erp_role_info.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpRoleInfo.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.056+08:00", comments="Source field: erp_role_info.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpRoleInfo.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.056+08:00", comments="Source field: erp_role_info.is_enable")
    public static final SqlColumn<Boolean> isEnable = erpRoleInfo.isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source Table: erp_role_info")
    public static final class ErpRoleInfo extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> nameZn = column("name_zn", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<Boolean> isEnable = column("is_enable", JDBCType.BIT);

        public ErpRoleInfo() {
            super("erp_role_info");
        }
    }
}