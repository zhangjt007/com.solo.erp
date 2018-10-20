package com.solo.erp.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class ErpShopInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.15+08:00", comments="Source field: erp_shop_info.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.15+08:00", comments="Source field: erp_shop_info.shop_name")
    private String shopName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.15+08:00", comments="Source field: erp_shop_info.shop_address")
    private String shopAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.15+08:00", comments="Source field: erp_shop_info.gmt_create")
    private LocalDateTime gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.151+08:00", comments="Source field: erp_shop_info.gmt_modified")
    private LocalDateTime gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.151+08:00", comments="Source field: erp_shop_info.is_enable")
    private Boolean isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.151+08:00", comments="Source field: erp_shop_info.parent_id")
    private Integer parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.151+08:00", comments="Source Table: erp_shop_info")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.15+08:00", comments="Source field: erp_shop_info.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.15+08:00", comments="Source field: erp_shop_info.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.15+08:00", comments="Source field: erp_shop_info.shop_name")
    public String getShopName() {
        return shopName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.15+08:00", comments="Source field: erp_shop_info.shop_name")
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.15+08:00", comments="Source field: erp_shop_info.shop_address")
    public String getShopAddress() {
        return shopAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.15+08:00", comments="Source field: erp_shop_info.shop_address")
    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.151+08:00", comments="Source field: erp_shop_info.gmt_create")
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.151+08:00", comments="Source field: erp_shop_info.gmt_create")
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.151+08:00", comments="Source field: erp_shop_info.gmt_modified")
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.151+08:00", comments="Source field: erp_shop_info.gmt_modified")
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.151+08:00", comments="Source field: erp_shop_info.is_enable")
    public Boolean getIsEnable() {
        return isEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.151+08:00", comments="Source field: erp_shop_info.is_enable")
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.151+08:00", comments="Source field: erp_shop_info.parent_id")
    public Integer getParentId() {
        return parentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.151+08:00", comments="Source field: erp_shop_info.parent_id")
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}