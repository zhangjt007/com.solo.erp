package com.solo.erp.dao.mapper;

import java.sql.JDBCType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpStaffInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.539+08:00", comments="Source Table: erp_staff_info")
    public static final ErpStaffInfo erpStaffInfo = new ErpStaffInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.54+08:00", comments="Source field: erp_staff_info.id")
    public static final SqlColumn<Integer> id = erpStaffInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.54+08:00", comments="Source field: erp_staff_info.login_name")
    public static final SqlColumn<String> loginName = erpStaffInfo.loginName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.54+08:00", comments="Source field: erp_staff_info.login_pwd")
    public static final SqlColumn<String> loginPwd = erpStaffInfo.loginPwd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.54+08:00", comments="Source field: erp_staff_info.staff_name")
    public static final SqlColumn<String> staffName = erpStaffInfo.staffName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.54+08:00", comments="Source field: erp_staff_info.staff_no")
    public static final SqlColumn<String> staffNo = erpStaffInfo.staffNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.54+08:00", comments="Source field: erp_staff_info.staff_photo")
    public static final SqlColumn<String> staffPhoto = erpStaffInfo.staffPhoto;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.541+08:00", comments="Source field: erp_staff_info.mobile")
    public static final SqlColumn<String> mobile = erpStaffInfo.mobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.541+08:00", comments="Source field: erp_staff_info.address")
    public static final SqlColumn<String> address = erpStaffInfo.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.541+08:00", comments="Source field: erp_staff_info.shop_id")
    public static final SqlColumn<Integer> shopId = erpStaffInfo.shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.541+08:00", comments="Source field: erp_staff_info.is_enable")
    public static final SqlColumn<Boolean> isEnable = erpStaffInfo.isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.541+08:00", comments="Source field: erp_staff_info.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpStaffInfo.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.541+08:00", comments="Source field: erp_staff_info.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpStaffInfo.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.541+08:00", comments="Source field: erp_staff_info.sex")
    public static final SqlColumn<String> sex = erpStaffInfo.sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.541+08:00", comments="Source field: erp_staff_info.brithday")
    public static final SqlColumn<LocalDate> brithday = erpStaffInfo.brithday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.542+08:00", comments="Source field: erp_staff_info.shop_name")
    public static final SqlColumn<String> shopName = erpStaffInfo.shopName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.542+08:00", comments="Source field: erp_staff_info.last_time")
    public static final SqlColumn<LocalDateTime> lastTime = erpStaffInfo.lastTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.542+08:00", comments="Source field: erp_staff_info.last_ip")
    public static final SqlColumn<String> lastIp = erpStaffInfo.lastIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.542+08:00", comments="Source field: erp_staff_info.cert_no")
    public static final SqlColumn<String> certNo = erpStaffInfo.certNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.539+08:00", comments="Source Table: erp_staff_info")
    public static final class ErpStaffInfo extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> loginName = column("login_name", JDBCType.VARCHAR);

        public final SqlColumn<String> loginPwd = column("login_pwd", JDBCType.VARCHAR);

        public final SqlColumn<String> staffName = column("staff_name", JDBCType.VARCHAR);

        public final SqlColumn<String> staffNo = column("staff_no", JDBCType.VARCHAR);

        public final SqlColumn<String> staffPhoto = column("staff_photo", JDBCType.VARCHAR);

        public final SqlColumn<String> mobile = column("mobile", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<Integer> shopId = column("shop_id", JDBCType.INTEGER);

        public final SqlColumn<Boolean> isEnable = column("is_enable", JDBCType.BIT);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<String> sex = column("sex", JDBCType.CHAR);

        public final SqlColumn<LocalDate> brithday = column("brithday", JDBCType.DATE);

        public final SqlColumn<String> shopName = column("shop_name", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> lastTime = column("last_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lastIp = column("last_ip", JDBCType.VARCHAR);

        public final SqlColumn<String> certNo = column("cert_no", JDBCType.VARCHAR);

        public ErpStaffInfo() {
            super("erp_staff_info");
        }
    }
}