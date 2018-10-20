package com.solo.erp.dao.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpMenuInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.146+08:00", comments="Source Table: erp_menu_info")
    public static final ErpMenuInfo erpMenuInfo = new ErpMenuInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.146+08:00", comments="Source field: erp_menu_info.id")
    public static final SqlColumn<Integer> id = erpMenuInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.146+08:00", comments="Source field: erp_menu_info.url")
    public static final SqlColumn<String> url = erpMenuInfo.url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.147+08:00", comments="Source field: erp_menu_info.path")
    public static final SqlColumn<String> path = erpMenuInfo.path;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.147+08:00", comments="Source field: erp_menu_info.name")
    public static final SqlColumn<String> name = erpMenuInfo.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.147+08:00", comments="Source field: erp_menu_info.component")
    public static final SqlColumn<String> component = erpMenuInfo.component;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.147+08:00", comments="Source field: erp_menu_info.icon")
    public static final SqlColumn<String> icon = erpMenuInfo.icon;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.147+08:00", comments="Source field: erp_menu_info.parent_id")
    public static final SqlColumn<Integer> parentId = erpMenuInfo.parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.147+08:00", comments="Source field: erp_menu_info.is_enable")
    public static final SqlColumn<Boolean> isEnable = erpMenuInfo.isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.147+08:00", comments="Source field: erp_menu_info.require_auth")
    public static final SqlColumn<String> requireAuth = erpMenuInfo.requireAuth;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.147+08:00", comments="Source field: erp_menu_info.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpMenuInfo.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.147+08:00", comments="Source field: erp_menu_info.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpMenuInfo.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.146+08:00", comments="Source Table: erp_menu_info")
    public static final class ErpMenuInfo extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> path = column("path", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> component = column("component", JDBCType.VARCHAR);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<Integer> parentId = column("parent_id", JDBCType.INTEGER);

        public final SqlColumn<Boolean> isEnable = column("is_enable", JDBCType.BIT);

        public final SqlColumn<String> requireAuth = column("require_auth", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public ErpMenuInfo() {
            super("erp_menu_info");
        }
    }
}