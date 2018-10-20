package com.solo.erp.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class ErpRoleInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.054+08:00", comments="Source field: erp_role_info.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.054+08:00", comments="Source field: erp_role_info.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.054+08:00", comments="Source field: erp_role_info.name_zn")
    private String nameZn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source field: erp_role_info.gmt_create")
    private LocalDateTime gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source field: erp_role_info.gmt_modified")
    private LocalDateTime gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source field: erp_role_info.is_enable")
    private Boolean isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source Table: erp_role_info")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.054+08:00", comments="Source field: erp_role_info.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.054+08:00", comments="Source field: erp_role_info.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.054+08:00", comments="Source field: erp_role_info.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.054+08:00", comments="Source field: erp_role_info.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.054+08:00", comments="Source field: erp_role_info.name_zn")
    public String getNameZn() {
        return nameZn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.054+08:00", comments="Source field: erp_role_info.name_zn")
    public void setNameZn(String nameZn) {
        this.nameZn = nameZn == null ? null : nameZn.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source field: erp_role_info.gmt_create")
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source field: erp_role_info.gmt_create")
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source field: erp_role_info.gmt_modified")
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source field: erp_role_info.gmt_modified")
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source field: erp_role_info.is_enable")
    public Boolean getIsEnable() {
        return isEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.055+08:00", comments="Source field: erp_role_info.is_enable")
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }
}