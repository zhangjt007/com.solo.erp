package com.solo.erp.dao.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpOrderInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.45+08:00", comments="Source Table: erp_order_info")
    public static final ErpOrderInfo erpOrderInfo = new ErpOrderInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.45+08:00", comments="Source field: erp_order_info.id")
    public static final SqlColumn<Integer> id = erpOrderInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.45+08:00", comments="Source field: erp_order_info.shop_id")
    public static final SqlColumn<Integer> shopId = erpOrderInfo.shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.451+08:00", comments="Source field: erp_order_info.staff_id")
    public static final SqlColumn<Integer> staffId = erpOrderInfo.staffId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.451+08:00", comments="Source field: erp_order_info.staff_name")
    public static final SqlColumn<String> staffName = erpOrderInfo.staffName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.451+08:00", comments="Source field: erp_order_info.order_no")
    public static final SqlColumn<String> orderNo = erpOrderInfo.orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.451+08:00", comments="Source field: erp_order_info.order_type")
    public static final SqlColumn<String> orderType = erpOrderInfo.orderType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.451+08:00", comments="Source field: erp_order_info.order_status")
    public static final SqlColumn<String> orderStatus = erpOrderInfo.orderStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.451+08:00", comments="Source field: erp_order_info.pay_type")
    public static final SqlColumn<String> payType = erpOrderInfo.payType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.451+08:00", comments="Source field: erp_order_info.pay_amount")
    public static final SqlColumn<BigDecimal> payAmount = erpOrderInfo.payAmount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.451+08:00", comments="Source field: erp_order_info.pay_score")
    public static final SqlColumn<BigDecimal> payScore = erpOrderInfo.payScore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.452+08:00", comments="Source field: erp_order_info.total_amount")
    public static final SqlColumn<BigDecimal> totalAmount = erpOrderInfo.totalAmount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.452+08:00", comments="Source field: erp_order_info.order_score")
    public static final SqlColumn<BigDecimal> orderScore = erpOrderInfo.orderScore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.452+08:00", comments="Source field: erp_order_info.remark")
    public static final SqlColumn<String> remark = erpOrderInfo.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.452+08:00", comments="Source field: erp_order_info.is_invoice")
    public static final SqlColumn<Boolean> isInvoice = erpOrderInfo.isInvoice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.452+08:00", comments="Source field: erp_order_info.invoice_remark")
    public static final SqlColumn<String> invoiceRemark = erpOrderInfo.invoiceRemark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.452+08:00", comments="Source field: erp_order_info.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpOrderInfo.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.452+08:00", comments="Source field: erp_order_info.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpOrderInfo.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.452+08:00", comments="Source field: erp_order_info.order_date")
    public static final SqlColumn<LocalDate> orderDate = erpOrderInfo.orderDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.452+08:00", comments="Source field: erp_order_info.total_num")
    public static final SqlColumn<Integer> totalNum = erpOrderInfo.totalNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.452+08:00", comments="Source field: erp_order_info.vip_mobile")
    public static final SqlColumn<String> vipMobile = erpOrderInfo.vipMobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.45+08:00", comments="Source Table: erp_order_info")
    public static final class ErpOrderInfo extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> shopId = column("shop_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> staffId = column("staff_id", JDBCType.INTEGER);

        public final SqlColumn<String> staffName = column("staff_name", JDBCType.VARCHAR);

        public final SqlColumn<String> orderNo = column("order_no", JDBCType.VARCHAR);

        public final SqlColumn<String> orderType = column("order_type", JDBCType.CHAR);

        public final SqlColumn<String> orderStatus = column("order_status", JDBCType.CHAR);

        public final SqlColumn<String> payType = column("pay_type", JDBCType.CHAR);

        public final SqlColumn<BigDecimal> payAmount = column("pay_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> payScore = column("pay_score", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> totalAmount = column("total_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> orderScore = column("order_score", JDBCType.DECIMAL);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> isInvoice = column("is_invoice", JDBCType.BIT);

        public final SqlColumn<String> invoiceRemark = column("invoice_remark", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDate> orderDate = column("order_date", JDBCType.DATE);

        public final SqlColumn<Integer> totalNum = column("total_num", JDBCType.INTEGER);

        public final SqlColumn<String> vipMobile = column("vip_mobile", JDBCType.CHAR);

        public ErpOrderInfo() {
            super("erp_order_info");
        }
    }
}