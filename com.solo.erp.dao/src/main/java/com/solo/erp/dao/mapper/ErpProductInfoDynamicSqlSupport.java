package com.solo.erp.dao.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpProductInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source Table: erp_product_info")
    public static final ErpProductInfo erpProductInfo = new ErpProductInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source field: erp_product_info.id")
    public static final SqlColumn<Integer> id = erpProductInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source field: erp_product_info.product_no")
    public static final SqlColumn<String> productNo = erpProductInfo.productNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source field: erp_product_info.product_name")
    public static final SqlColumn<String> productName = erpProductInfo.productName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source field: erp_product_info.year")
    public static final SqlColumn<Integer> year = erpProductInfo.year;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.194+08:00", comments="Source field: erp_product_info.season")
    public static final SqlColumn<Integer> season = erpProductInfo.season;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.194+08:00", comments="Source field: erp_product_info.wave_band")
    public static final SqlColumn<Integer> waveBand = erpProductInfo.waveBand;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.194+08:00", comments="Source field: erp_product_info.product_type")
    public static final SqlColumn<String> productType = erpProductInfo.productType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.194+08:00", comments="Source field: erp_product_info.product_img")
    public static final SqlColumn<String> productImg = erpProductInfo.productImg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.194+08:00", comments="Source field: erp_product_info.product_thums")
    public static final SqlColumn<String> productThums = erpProductInfo.productThums;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.194+08:00", comments="Source field: erp_product_info.brand_name")
    public static final SqlColumn<String> brandName = erpProductInfo.brandName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.194+08:00", comments="Source field: erp_product_info.tag_price")
    public static final SqlColumn<BigDecimal> tagPrice = erpProductInfo.tagPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.194+08:00", comments="Source field: erp_product_info.real_price")
    public static final SqlColumn<BigDecimal> realPrice = erpProductInfo.realPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.194+08:00", comments="Source field: erp_product_info.cost_price")
    public static final SqlColumn<BigDecimal> costPrice = erpProductInfo.costPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.194+08:00", comments="Source field: erp_product_info.size")
    public static final SqlColumn<String> size = erpProductInfo.size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.194+08:00", comments="Source field: erp_product_info.color")
    public static final SqlColumn<String> color = erpProductInfo.color;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.194+08:00", comments="Source field: erp_product_info.discount")
    public static final SqlColumn<Integer> discount = erpProductInfo.discount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source field: erp_product_info.remark")
    public static final SqlColumn<String> remark = erpProductInfo.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source field: erp_product_info.gmt_create")
    public static final SqlColumn<LocalDateTime> gmtCreate = erpProductInfo.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source field: erp_product_info.gmt_modified")
    public static final SqlColumn<LocalDateTime> gmtModified = erpProductInfo.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source Table: erp_product_info")
    public static final class ErpProductInfo extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> productNo = column("product_no", JDBCType.VARCHAR);

        public final SqlColumn<String> productName = column("product_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> year = column("year", JDBCType.INTEGER);

        public final SqlColumn<Integer> season = column("season", JDBCType.INTEGER);

        public final SqlColumn<Integer> waveBand = column("wave_band", JDBCType.INTEGER);

        public final SqlColumn<String> productType = column("product_type", JDBCType.CHAR);

        public final SqlColumn<String> productImg = column("product_img", JDBCType.VARCHAR);

        public final SqlColumn<String> productThums = column("product_thums", JDBCType.VARCHAR);

        public final SqlColumn<String> brandName = column("brand_name", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> tagPrice = column("tag_price", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> realPrice = column("real_price", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> costPrice = column("cost_price", JDBCType.DECIMAL);

        public final SqlColumn<String> size = column("size", JDBCType.VARCHAR);

        public final SqlColumn<String> color = column("color", JDBCType.VARCHAR);

        public final SqlColumn<Integer> discount = column("discount", JDBCType.INTEGER);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public ErpProductInfo() {
            super("erp_product_info");
        }
    }
}