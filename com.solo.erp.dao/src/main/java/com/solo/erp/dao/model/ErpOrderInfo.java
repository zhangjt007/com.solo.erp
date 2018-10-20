package com.solo.erp.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class ErpOrderInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.shop_id")
    private Integer shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.staff_id")
    private Integer staffId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.staff_name")
    private String staffName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.order_no")
    private String orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.447+08:00", comments="Source field: erp_order_info.order_type")
    private String orderType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.447+08:00", comments="Source field: erp_order_info.order_status")
    private String orderStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.447+08:00", comments="Source field: erp_order_info.pay_type")
    private String payType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.447+08:00", comments="Source field: erp_order_info.pay_amount")
    private BigDecimal payAmount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.pay_score")
    private BigDecimal payScore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.total_amount")
    private BigDecimal totalAmount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.order_score")
    private BigDecimal orderScore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.remark")
    private String remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.is_invoice")
    private Boolean isInvoice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.invoice_remark")
    private String invoiceRemark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.gmt_create")
    private LocalDateTime gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.gmt_modified")
    private LocalDateTime gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.order_date")
    private LocalDate orderDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.total_num")
    private Integer totalNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.45+08:00", comments="Source field: erp_order_info.vip_mobile")
    private String vipMobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.45+08:00", comments="Source Table: erp_order_info")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.shop_id")
    public Integer getShopId() {
        return shopId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.shop_id")
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.staff_id")
    public Integer getStaffId() {
        return staffId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.staff_id")
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.staff_name")
    public String getStaffName() {
        return staffName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.staff_name")
    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.order_no")
    public String getOrderNo() {
        return orderNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.446+08:00", comments="Source field: erp_order_info.order_no")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.447+08:00", comments="Source field: erp_order_info.order_type")
    public String getOrderType() {
        return orderType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.447+08:00", comments="Source field: erp_order_info.order_type")
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.447+08:00", comments="Source field: erp_order_info.order_status")
    public String getOrderStatus() {
        return orderStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.447+08:00", comments="Source field: erp_order_info.order_status")
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.447+08:00", comments="Source field: erp_order_info.pay_type")
    public String getPayType() {
        return payType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.447+08:00", comments="Source field: erp_order_info.pay_type")
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.447+08:00", comments="Source field: erp_order_info.pay_amount")
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.pay_amount")
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.pay_score")
    public BigDecimal getPayScore() {
        return payScore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.pay_score")
    public void setPayScore(BigDecimal payScore) {
        this.payScore = payScore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.total_amount")
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.total_amount")
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.order_score")
    public BigDecimal getOrderScore() {
        return orderScore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.order_score")
    public void setOrderScore(BigDecimal orderScore) {
        this.orderScore = orderScore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.remark")
    public String getRemark() {
        return remark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.remark")
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.448+08:00", comments="Source field: erp_order_info.is_invoice")
    public Boolean getIsInvoice() {
        return isInvoice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.is_invoice")
    public void setIsInvoice(Boolean isInvoice) {
        this.isInvoice = isInvoice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.invoice_remark")
    public String getInvoiceRemark() {
        return invoiceRemark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.invoice_remark")
    public void setInvoiceRemark(String invoiceRemark) {
        this.invoiceRemark = invoiceRemark == null ? null : invoiceRemark.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.gmt_create")
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.gmt_create")
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.gmt_modified")
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.gmt_modified")
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.order_date")
    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.449+08:00", comments="Source field: erp_order_info.order_date")
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.45+08:00", comments="Source field: erp_order_info.total_num")
    public Integer getTotalNum() {
        return totalNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.45+08:00", comments="Source field: erp_order_info.total_num")
    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.45+08:00", comments="Source field: erp_order_info.vip_mobile")
    public String getVipMobile() {
        return vipMobile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.45+08:00", comments="Source field: erp_order_info.vip_mobile")
    public void setVipMobile(String vipMobile) {
        this.vipMobile = vipMobile == null ? null : vipMobile.trim();
    }
}