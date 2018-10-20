package com.solo.erp.dao.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpOrderDetailDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.429+08:00", comments="Source Table: erp_order_detail")
    public static final ErpOrderDetail erpOrderDetail = new ErpOrderDetail();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.43+08:00", comments="Source field: erp_order_detail.id")
    public static final SqlColumn<Integer> id = erpOrderDetail.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.43+08:00", comments="Source field: erp_order_detail.order_no")
    public static final SqlColumn<String> orderNo = erpOrderDetail.orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.43+08:00", comments="Source field: erp_order_detail.product_name")
    public static final SqlColumn<String> productName = erpOrderDetail.productName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.431+08:00", comments="Source field: erp_order_detail.product_sn")
    public static final SqlColumn<String> productSn = erpOrderDetail.productSn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.431+08:00", comments="Source field: erp_order_detail.product_no")
    public static final SqlColumn<String> productNo = erpOrderDetail.productNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.431+08:00", comments="Source field: erp_order_detail.size")
    public static final SqlColumn<Integer> size = erpOrderDetail.size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.431+08:00", comments="Source field: erp_order_detail.color")
    public static final SqlColumn<String> color = erpOrderDetail.color;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.431+08:00", comments="Source field: erp_order_detail.num")
    public static final SqlColumn<Integer> num = erpOrderDetail.num;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.431+08:00", comments="Source field: erp_order_detail.real_price")
    public static final SqlColumn<BigDecimal> realPrice = erpOrderDetail.realPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.431+08:00", comments="Source field: erp_order_detail.tag_price")
    public static final SqlColumn<BigDecimal> tagPrice = erpOrderDetail.tagPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.432+08:00", comments="Source field: erp_order_detail.order_score")
    public static final SqlColumn<BigDecimal> orderScore = erpOrderDetail.orderScore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.432+08:00", comments="Source field: erp_order_detail.order_date")
    public static final SqlColumn<LocalDate> orderDate = erpOrderDetail.orderDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.432+08:00", comments="Source field: erp_order_detail.origin_id")
    public static final SqlColumn<Integer> originId = erpOrderDetail.originId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.432+08:00", comments="Source field: erp_order_detail.is_refund")
    public static final SqlColumn<Boolean> isRefund = erpOrderDetail.isRefund;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.432+08:00", comments="Source field: erp_order_detail.order_status")
    public static final SqlColumn<String> orderStatus = erpOrderDetail.orderStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.432+08:00", comments="Source field: erp_order_detail.vip_mobile")
    public static final SqlColumn<String> vipMobile = erpOrderDetail.vipMobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.432+08:00", comments="Source field: erp_order_detail.shop_id")
    public static final SqlColumn<Integer> shopId = erpOrderDetail.shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.432+08:00", comments="Source field: erp_order_detail.staff_id")
    public static final SqlColumn<Integer> staffId = erpOrderDetail.staffId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.432+08:00", comments="Source field: erp_order_detail.staff_name")
    public static final SqlColumn<String> staffName = erpOrderDetail.staffName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.433+08:00", comments="Source field: erp_order_detail.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpOrderDetail.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.433+08:00", comments="Source field: erp_order_detail.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpOrderDetail.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.43+08:00", comments="Source Table: erp_order_detail")
    public static final class ErpOrderDetail extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> orderNo = column("order_no", JDBCType.VARCHAR);

        public final SqlColumn<String> productName = column("product_name", JDBCType.VARCHAR);

        public final SqlColumn<String> productSn = column("product_sn", JDBCType.VARCHAR);

        public final SqlColumn<String> productNo = column("product_no", JDBCType.VARCHAR);

        public final SqlColumn<Integer> size = column("size", JDBCType.INTEGER);

        public final SqlColumn<String> color = column("color", JDBCType.VARCHAR);

        public final SqlColumn<Integer> num = column("num", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> realPrice = column("real_price", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> tagPrice = column("tag_price", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> orderScore = column("order_score", JDBCType.DECIMAL);

        public final SqlColumn<LocalDate> orderDate = column("order_date", JDBCType.DATE);

        public final SqlColumn<Integer> originId = column("origin_id", JDBCType.INTEGER);

        public final SqlColumn<Boolean> isRefund = column("is_refund", JDBCType.BIT);

        public final SqlColumn<String> orderStatus = column("order_status", JDBCType.CHAR);

        public final SqlColumn<String> vipMobile = column("vip_mobile", JDBCType.CHAR);

        public final SqlColumn<Integer> shopId = column("shop_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> staffId = column("staff_id", JDBCType.INTEGER);

        public final SqlColumn<String> staffName = column("staff_name", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public ErpOrderDetail() {
            super("erp_order_detail");
        }
    }
}