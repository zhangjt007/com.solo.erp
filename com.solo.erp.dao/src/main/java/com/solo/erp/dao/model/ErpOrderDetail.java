package com.solo.erp.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class ErpOrderDetail implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.413+08:00", comments="Source field: erp_order_detail.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.419+08:00", comments="Source field: erp_order_detail.order_no")
    private String orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.419+08:00", comments="Source field: erp_order_detail.product_name")
    private String productName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.42+08:00", comments="Source field: erp_order_detail.product_sn")
    private String productSn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.42+08:00", comments="Source field: erp_order_detail.product_no")
    private String productNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.42+08:00", comments="Source field: erp_order_detail.size")
    private Integer size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.42+08:00", comments="Source field: erp_order_detail.color")
    private String color;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.421+08:00", comments="Source field: erp_order_detail.num")
    private Integer num;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.421+08:00", comments="Source field: erp_order_detail.real_price")
    private BigDecimal realPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.421+08:00", comments="Source field: erp_order_detail.tag_price")
    private BigDecimal tagPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.422+08:00", comments="Source field: erp_order_detail.order_score")
    private BigDecimal orderScore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.422+08:00", comments="Source field: erp_order_detail.order_date")
    private LocalDate orderDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.422+08:00", comments="Source field: erp_order_detail.origin_id")
    private Integer originId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.423+08:00", comments="Source field: erp_order_detail.is_refund")
    private Boolean isRefund;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.423+08:00", comments="Source field: erp_order_detail.order_status")
    private String orderStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.423+08:00", comments="Source field: erp_order_detail.vip_mobile")
    private String vipMobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.423+08:00", comments="Source field: erp_order_detail.shop_id")
    private Integer shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.424+08:00", comments="Source field: erp_order_detail.staff_id")
    private Integer staffId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.424+08:00", comments="Source field: erp_order_detail.staff_name")
    private String staffName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.425+08:00", comments="Source field: erp_order_detail.gmt_create")
    private LocalDateTime gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.425+08:00", comments="Source field: erp_order_detail.gmt_modified")
    private LocalDateTime gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.425+08:00", comments="Source Table: erp_order_detail")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.418+08:00", comments="Source field: erp_order_detail.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.419+08:00", comments="Source field: erp_order_detail.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.419+08:00", comments="Source field: erp_order_detail.order_no")
    public String getOrderNo() {
        return orderNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.419+08:00", comments="Source field: erp_order_detail.order_no")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.42+08:00", comments="Source field: erp_order_detail.product_name")
    public String getProductName() {
        return productName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.42+08:00", comments="Source field: erp_order_detail.product_name")
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.42+08:00", comments="Source field: erp_order_detail.product_sn")
    public String getProductSn() {
        return productSn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.42+08:00", comments="Source field: erp_order_detail.product_sn")
    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.42+08:00", comments="Source field: erp_order_detail.product_no")
    public String getProductNo() {
        return productNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.42+08:00", comments="Source field: erp_order_detail.product_no")
    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.42+08:00", comments="Source field: erp_order_detail.size")
    public Integer getSize() {
        return size;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.42+08:00", comments="Source field: erp_order_detail.size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.421+08:00", comments="Source field: erp_order_detail.color")
    public String getColor() {
        return color;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.421+08:00", comments="Source field: erp_order_detail.color")
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.421+08:00", comments="Source field: erp_order_detail.num")
    public Integer getNum() {
        return num;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.421+08:00", comments="Source field: erp_order_detail.num")
    public void setNum(Integer num) {
        this.num = num;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.421+08:00", comments="Source field: erp_order_detail.real_price")
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.421+08:00", comments="Source field: erp_order_detail.real_price")
    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.421+08:00", comments="Source field: erp_order_detail.tag_price")
    public BigDecimal getTagPrice() {
        return tagPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.421+08:00", comments="Source field: erp_order_detail.tag_price")
    public void setTagPrice(BigDecimal tagPrice) {
        this.tagPrice = tagPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.422+08:00", comments="Source field: erp_order_detail.order_score")
    public BigDecimal getOrderScore() {
        return orderScore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.422+08:00", comments="Source field: erp_order_detail.order_score")
    public void setOrderScore(BigDecimal orderScore) {
        this.orderScore = orderScore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.422+08:00", comments="Source field: erp_order_detail.order_date")
    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.422+08:00", comments="Source field: erp_order_detail.order_date")
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.422+08:00", comments="Source field: erp_order_detail.origin_id")
    public Integer getOriginId() {
        return originId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.422+08:00", comments="Source field: erp_order_detail.origin_id")
    public void setOriginId(Integer originId) {
        this.originId = originId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.423+08:00", comments="Source field: erp_order_detail.is_refund")
    public Boolean getIsRefund() {
        return isRefund;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.423+08:00", comments="Source field: erp_order_detail.is_refund")
    public void setIsRefund(Boolean isRefund) {
        this.isRefund = isRefund;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.423+08:00", comments="Source field: erp_order_detail.order_status")
    public String getOrderStatus() {
        return orderStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.423+08:00", comments="Source field: erp_order_detail.order_status")
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.423+08:00", comments="Source field: erp_order_detail.vip_mobile")
    public String getVipMobile() {
        return vipMobile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.423+08:00", comments="Source field: erp_order_detail.vip_mobile")
    public void setVipMobile(String vipMobile) {
        this.vipMobile = vipMobile == null ? null : vipMobile.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.424+08:00", comments="Source field: erp_order_detail.shop_id")
    public Integer getShopId() {
        return shopId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.424+08:00", comments="Source field: erp_order_detail.shop_id")
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.424+08:00", comments="Source field: erp_order_detail.staff_id")
    public Integer getStaffId() {
        return staffId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.424+08:00", comments="Source field: erp_order_detail.staff_id")
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.424+08:00", comments="Source field: erp_order_detail.staff_name")
    public String getStaffName() {
        return staffName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.424+08:00", comments="Source field: erp_order_detail.staff_name")
    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.425+08:00", comments="Source field: erp_order_detail.gmt_create")
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.425+08:00", comments="Source field: erp_order_detail.gmt_create")
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.425+08:00", comments="Source field: erp_order_detail.gmt_modified")
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.425+08:00", comments="Source field: erp_order_detail.gmt_modified")
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}