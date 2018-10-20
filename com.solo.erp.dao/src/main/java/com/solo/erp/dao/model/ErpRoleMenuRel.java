package com.solo.erp.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class ErpRoleMenuRel implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.203+08:00", comments="Source field: erp_role_menu_rel.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.role_id")
    private Integer roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.menu_id")
    private Integer menuId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.is_enable")
    private Boolean isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.gmt_create")
    private LocalDateTime gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.gmt_modified")
    private LocalDateTime gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.205+08:00", comments="Source Table: erp_role_menu_rel")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.203+08:00", comments="Source field: erp_role_menu_rel.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.203+08:00", comments="Source field: erp_role_menu_rel.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.role_id")
    public Integer getRoleId() {
        return roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.role_id")
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.menu_id")
    public Integer getMenuId() {
        return menuId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.menu_id")
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.is_enable")
    public Boolean getIsEnable() {
        return isEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.is_enable")
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.gmt_create")
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.gmt_create")
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.204+08:00", comments="Source field: erp_role_menu_rel.gmt_modified")
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.205+08:00", comments="Source field: erp_role_menu_rel.gmt_modified")
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}