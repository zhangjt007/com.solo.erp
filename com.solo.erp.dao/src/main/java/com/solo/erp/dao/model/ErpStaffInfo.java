package com.solo.erp.dao.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class ErpStaffInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.527+08:00", comments="Source field: erp_staff_info.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.531+08:00", comments="Source field: erp_staff_info.login_name")
    private String loginName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.531+08:00", comments="Source field: erp_staff_info.login_pwd")
    private String loginPwd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.531+08:00", comments="Source field: erp_staff_info.staff_name")
    private String staffName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.532+08:00", comments="Source field: erp_staff_info.staff_no")
    private String staffNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.532+08:00", comments="Source field: erp_staff_info.staff_photo")
    private String staffPhoto;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.532+08:00", comments="Source field: erp_staff_info.mobile")
    private String mobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.532+08:00", comments="Source field: erp_staff_info.address")
    private String address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.533+08:00", comments="Source field: erp_staff_info.shop_id")
    private Integer shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.533+08:00", comments="Source field: erp_staff_info.is_enable")
    private Boolean isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.533+08:00", comments="Source field: erp_staff_info.gmt_create")
    private LocalDateTime gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.533+08:00", comments="Source field: erp_staff_info.gmt_modified")
    private LocalDateTime gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.534+08:00", comments="Source field: erp_staff_info.sex")
    private String sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.534+08:00", comments="Source field: erp_staff_info.brithday")
    private LocalDate brithday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.534+08:00", comments="Source field: erp_staff_info.shop_name")
    private String shopName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.535+08:00", comments="Source field: erp_staff_info.last_time")
    private LocalDateTime lastTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.535+08:00", comments="Source field: erp_staff_info.last_ip")
    private String lastIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.535+08:00", comments="Source field: erp_staff_info.cert_no")
    private String certNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.535+08:00", comments="Source Table: erp_staff_info")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.53+08:00", comments="Source field: erp_staff_info.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.531+08:00", comments="Source field: erp_staff_info.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.531+08:00", comments="Source field: erp_staff_info.login_name")
    public String getLoginName() {
        return loginName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.531+08:00", comments="Source field: erp_staff_info.login_name")
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.531+08:00", comments="Source field: erp_staff_info.login_pwd")
    public String getLoginPwd() {
        return loginPwd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.531+08:00", comments="Source field: erp_staff_info.login_pwd")
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.531+08:00", comments="Source field: erp_staff_info.staff_name")
    public String getStaffName() {
        return staffName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.531+08:00", comments="Source field: erp_staff_info.staff_name")
    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.532+08:00", comments="Source field: erp_staff_info.staff_no")
    public String getStaffNo() {
        return staffNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.532+08:00", comments="Source field: erp_staff_info.staff_no")
    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo == null ? null : staffNo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.532+08:00", comments="Source field: erp_staff_info.staff_photo")
    public String getStaffPhoto() {
        return staffPhoto;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.532+08:00", comments="Source field: erp_staff_info.staff_photo")
    public void setStaffPhoto(String staffPhoto) {
        this.staffPhoto = staffPhoto == null ? null : staffPhoto.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.532+08:00", comments="Source field: erp_staff_info.mobile")
    public String getMobile() {
        return mobile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.532+08:00", comments="Source field: erp_staff_info.mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.533+08:00", comments="Source field: erp_staff_info.address")
    public String getAddress() {
        return address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.533+08:00", comments="Source field: erp_staff_info.address")
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.533+08:00", comments="Source field: erp_staff_info.shop_id")
    public Integer getShopId() {
        return shopId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.533+08:00", comments="Source field: erp_staff_info.shop_id")
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.533+08:00", comments="Source field: erp_staff_info.is_enable")
    public Boolean getIsEnable() {
        return isEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.533+08:00", comments="Source field: erp_staff_info.is_enable")
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.533+08:00", comments="Source field: erp_staff_info.gmt_create")
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.533+08:00", comments="Source field: erp_staff_info.gmt_create")
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.534+08:00", comments="Source field: erp_staff_info.gmt_modified")
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.534+08:00", comments="Source field: erp_staff_info.gmt_modified")
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.534+08:00", comments="Source field: erp_staff_info.sex")
    public String getSex() {
        return sex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.534+08:00", comments="Source field: erp_staff_info.sex")
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.534+08:00", comments="Source field: erp_staff_info.brithday")
    public LocalDate getBrithday() {
        return brithday;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.534+08:00", comments="Source field: erp_staff_info.brithday")
    public void setBrithday(LocalDate brithday) {
        this.brithday = brithday;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.534+08:00", comments="Source field: erp_staff_info.shop_name")
    public String getShopName() {
        return shopName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.534+08:00", comments="Source field: erp_staff_info.shop_name")
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.535+08:00", comments="Source field: erp_staff_info.last_time")
    public LocalDateTime getLastTime() {
        return lastTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.535+08:00", comments="Source field: erp_staff_info.last_time")
    public void setLastTime(LocalDateTime lastTime) {
        this.lastTime = lastTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.535+08:00", comments="Source field: erp_staff_info.last_ip")
    public String getLastIp() {
        return lastIp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.535+08:00", comments="Source field: erp_staff_info.last_ip")
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.535+08:00", comments="Source field: erp_staff_info.cert_no")
    public String getCertNo() {
        return certNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.535+08:00", comments="Source field: erp_staff_info.cert_no")
    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }
}