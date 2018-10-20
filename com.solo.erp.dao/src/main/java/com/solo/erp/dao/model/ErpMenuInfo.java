package com.solo.erp.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class ErpMenuInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.143+08:00", comments="Source field: erp_menu_info.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.url")
    private String url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.path")
    private String path;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.component")
    private String component;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.145+08:00", comments="Source field: erp_menu_info.icon")
    private String icon;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.145+08:00", comments="Source field: erp_menu_info.parent_id")
    private Integer parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.145+08:00", comments="Source field: erp_menu_info.is_enable")
    private Boolean isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.145+08:00", comments="Source field: erp_menu_info.require_auth")
    private String requireAuth;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.146+08:00", comments="Source field: erp_menu_info.gmt_create")
    private LocalDateTime gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.146+08:00", comments="Source field: erp_menu_info.gmt_modified")
    private LocalDateTime gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.146+08:00", comments="Source Table: erp_menu_info")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.url")
    public String getUrl() {
        return url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.url")
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.path")
    public String getPath() {
        return path;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.path")
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.144+08:00", comments="Source field: erp_menu_info.component")
    public String getComponent() {
        return component;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.145+08:00", comments="Source field: erp_menu_info.component")
    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.145+08:00", comments="Source field: erp_menu_info.icon")
    public String getIcon() {
        return icon;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.145+08:00", comments="Source field: erp_menu_info.icon")
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.145+08:00", comments="Source field: erp_menu_info.parent_id")
    public Integer getParentId() {
        return parentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.145+08:00", comments="Source field: erp_menu_info.parent_id")
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.145+08:00", comments="Source field: erp_menu_info.is_enable")
    public Boolean getIsEnable() {
        return isEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.145+08:00", comments="Source field: erp_menu_info.is_enable")
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.145+08:00", comments="Source field: erp_menu_info.require_auth")
    public String getRequireAuth() {
        return requireAuth;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.146+08:00", comments="Source field: erp_menu_info.require_auth")
    public void setRequireAuth(String requireAuth) {
        this.requireAuth = requireAuth == null ? null : requireAuth.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.146+08:00", comments="Source field: erp_menu_info.gmt_create")
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.146+08:00", comments="Source field: erp_menu_info.gmt_create")
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.146+08:00", comments="Source field: erp_menu_info.gmt_modified")
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.146+08:00", comments="Source field: erp_menu_info.gmt_modified")
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}