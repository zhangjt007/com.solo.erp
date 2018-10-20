package com.solo.erp.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class ErpInventoryInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source field: erp_inventory_info.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source field: erp_inventory_info.product_no")
    private String productNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source field: erp_inventory_info.product_sn")
    private String productSn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source field: erp_inventory_info.product_name")
    private String productName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.color")
    private String color;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.size")
    private Integer size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.num")
    private Integer num;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.shop_name")
    private String shopName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.shop_id")
    private Integer shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.gmt_create")
    private LocalDateTime gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.gmt_modified")
    private LocalDateTime gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source Table: erp_inventory_info")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source field: erp_inventory_info.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source field: erp_inventory_info.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source field: erp_inventory_info.product_no")
    public String getProductNo() {
        return productNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source field: erp_inventory_info.product_no")
    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source field: erp_inventory_info.product_sn")
    public String getProductSn() {
        return productSn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source field: erp_inventory_info.product_sn")
    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.product_name")
    public String getProductName() {
        return productName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.product_name")
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.color")
    public String getColor() {
        return color;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.color")
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.size")
    public Integer getSize() {
        return size;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.num")
    public Integer getNum() {
        return num;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.num")
    public void setNum(Integer num) {
        this.num = num;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.shop_name")
    public String getShopName() {
        return shopName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.shop_name")
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.shop_id")
    public Integer getShopId() {
        return shopId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.shop_id")
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.gmt_create")
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.gmt_create")
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.gmt_modified")
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.197+08:00", comments="Source field: erp_inventory_info.gmt_modified")
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}