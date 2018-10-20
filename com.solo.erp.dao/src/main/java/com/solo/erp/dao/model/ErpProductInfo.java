package com.solo.erp.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class ErpProductInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.189+08:00", comments="Source field: erp_product_info.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.product_no")
    private String productNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.product_name")
    private String productName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.year")
    private Integer year;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.season")
    private Integer season;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.wave_band")
    private Integer waveBand;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.191+08:00", comments="Source field: erp_product_info.product_type")
    private String productType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.191+08:00", comments="Source field: erp_product_info.product_img")
    private String productImg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.191+08:00", comments="Source field: erp_product_info.product_thums")
    private String productThums;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.191+08:00", comments="Source field: erp_product_info.brand_name")
    private String brandName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.tag_price")
    private BigDecimal tagPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.real_price")
    private BigDecimal realPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.cost_price")
    private BigDecimal costPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.size")
    private String size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.color")
    private String color;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.discount")
    private Integer discount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.remark")
    private String remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source field: erp_product_info.gmt_create")
    private LocalDateTime gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source field: erp_product_info.gmt_modified")
    private LocalDateTime gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source Table: erp_product_info")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.189+08:00", comments="Source field: erp_product_info.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.189+08:00", comments="Source field: erp_product_info.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.product_no")
    public String getProductNo() {
        return productNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.product_no")
    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.product_name")
    public String getProductName() {
        return productName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.product_name")
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.year")
    public Integer getYear() {
        return year;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.year")
    public void setYear(Integer year) {
        this.year = year;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.season")
    public Integer getSeason() {
        return season;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.season")
    public void setSeason(Integer season) {
        this.season = season;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.19+08:00", comments="Source field: erp_product_info.wave_band")
    public Integer getWaveBand() {
        return waveBand;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.191+08:00", comments="Source field: erp_product_info.wave_band")
    public void setWaveBand(Integer waveBand) {
        this.waveBand = waveBand;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.191+08:00", comments="Source field: erp_product_info.product_type")
    public String getProductType() {
        return productType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.191+08:00", comments="Source field: erp_product_info.product_type")
    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.191+08:00", comments="Source field: erp_product_info.product_img")
    public String getProductImg() {
        return productImg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.191+08:00", comments="Source field: erp_product_info.product_img")
    public void setProductImg(String productImg) {
        this.productImg = productImg == null ? null : productImg.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.191+08:00", comments="Source field: erp_product_info.product_thums")
    public String getProductThums() {
        return productThums;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.191+08:00", comments="Source field: erp_product_info.product_thums")
    public void setProductThums(String productThums) {
        this.productThums = productThums == null ? null : productThums.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.brand_name")
    public String getBrandName() {
        return brandName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.brand_name")
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.tag_price")
    public BigDecimal getTagPrice() {
        return tagPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.tag_price")
    public void setTagPrice(BigDecimal tagPrice) {
        this.tagPrice = tagPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.real_price")
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.real_price")
    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.cost_price")
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.cost_price")
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.size")
    public String getSize() {
        return size;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.size")
    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.color")
    public String getColor() {
        return color;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.color")
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.discount")
    public Integer getDiscount() {
        return discount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.discount")
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.192+08:00", comments="Source field: erp_product_info.remark")
    public String getRemark() {
        return remark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source field: erp_product_info.remark")
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source field: erp_product_info.gmt_create")
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source field: erp_product_info.gmt_create")
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source field: erp_product_info.gmt_modified")
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.193+08:00", comments="Source field: erp_product_info.gmt_modified")
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}