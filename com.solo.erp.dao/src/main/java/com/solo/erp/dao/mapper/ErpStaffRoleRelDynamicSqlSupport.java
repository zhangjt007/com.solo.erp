package com.solo.erp.dao.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpStaffRoleRelDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.214+08:00", comments="Source Table: erp_staff_role_rel")
    public static final ErpStaffRoleRel erpStaffRoleRel = new ErpStaffRoleRel();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.214+08:00", comments="Source field: erp_staff_role_rel.id")
    public static final SqlColumn<Integer> id = erpStaffRoleRel.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source field: erp_staff_role_rel.staff_id")
    public static final SqlColumn<Integer> staffId = erpStaffRoleRel.staffId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source field: erp_staff_role_rel.role_id")
    public static final SqlColumn<Integer> roleId = erpStaffRoleRel.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source field: erp_staff_role_rel.is_enable")
    public static final SqlColumn<Boolean> isEnable = erpStaffRoleRel.isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source field: erp_staff_role_rel.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpStaffRoleRel.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source field: erp_staff_role_rel.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpStaffRoleRel.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.214+08:00", comments="Source Table: erp_staff_role_rel")
    public static final class ErpStaffRoleRel extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> staffId = column("staff_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> roleId = column("role_id", JDBCType.INTEGER);

        public final SqlColumn<Boolean> isEnable = column("is_enable", JDBCType.BIT);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public ErpStaffRoleRel() {
            super("erp_staff_role_rel");
        }
    }
}