package com.solo.erp.dao.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpRoleMenuRelDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.205+08:00", comments="Source Table: erp_role_menu_rel")
    public static final ErpRoleMenuRel erpRoleMenuRel = new ErpRoleMenuRel();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.205+08:00", comments="Source field: erp_role_menu_rel.id")
    public static final SqlColumn<Integer> id = erpRoleMenuRel.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.205+08:00", comments="Source field: erp_role_menu_rel.role_id")
    public static final SqlColumn<Integer> roleId = erpRoleMenuRel.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.205+08:00", comments="Source field: erp_role_menu_rel.menu_id")
    public static final SqlColumn<Integer> menuId = erpRoleMenuRel.menuId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.205+08:00", comments="Source field: erp_role_menu_rel.is_enable")
    public static final SqlColumn<Boolean> isEnable = erpRoleMenuRel.isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source field: erp_role_menu_rel.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpRoleMenuRel.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source field: erp_role_menu_rel.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpRoleMenuRel.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.205+08:00", comments="Source Table: erp_role_menu_rel")
    public static final class ErpRoleMenuRel extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> roleId = column("role_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> menuId = column("menu_id", JDBCType.INTEGER);

        public final SqlColumn<Boolean> isEnable = column("is_enable", JDBCType.BIT);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public ErpRoleMenuRel() {
            super("erp_role_menu_rel");
        }
    }
}