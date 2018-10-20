package com.solo.erp.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class ErpVipInfo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.026+08:00", comments="Source field: erp_vip_info.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.03+08:00", comments="Source field: erp_vip_info.user_name")
    private String userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.03+08:00", comments="Source field: erp_vip_info.sex")
    private String sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.03+08:00", comments="Source field: erp_vip_info.brithday")
    private LocalDate brithday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.031+08:00", comments="Source field: erp_vip_info.mobile")
    private String mobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.031+08:00", comments="Source field: erp_vip_info.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.031+08:00", comments="Source field: erp_vip_info.address")
    private String address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.032+08:00", comments="Source field: erp_vip_info.score")
    private BigDecimal score;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.032+08:00", comments="Source field: erp_vip_info.history_score")
    private BigDecimal historyScore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.032+08:00", comments="Source field: erp_vip_info.is_enable")
    private Boolean isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.033+08:00", comments="Source field: erp_vip_info.gmt_create")
    private LocalDateTime gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.033+08:00", comments="Source field: erp_vip_info.gmt_modified")
    private LocalDateTime gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.033+08:00", comments="Source field: erp_vip_info.remark")
    private String remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.033+08:00", comments="Source field: erp_vip_info.vip_referee_mobile")
    private String vipRefereeMobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.034+08:00", comments="Source field: erp_vip_info.staff_id")
    private Integer staffId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.034+08:00", comments="Source field: erp_vip_info.staff_name")
    private String staffName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.034+08:00", comments="Source field: erp_vip_info.weixin")
    private String weixin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.034+08:00", comments="Source field: erp_vip_info.qq")
    private String qq;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.035+08:00", comments="Source field: erp_vip_info.create_date")
    private LocalDate createDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.035+08:00", comments="Source Table: erp_vip_info")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.029+08:00", comments="Source field: erp_vip_info.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.03+08:00", comments="Source field: erp_vip_info.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.03+08:00", comments="Source field: erp_vip_info.user_name")
    public String getUserName() {
        return userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.03+08:00", comments="Source field: erp_vip_info.user_name")
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.03+08:00", comments="Source field: erp_vip_info.sex")
    public String getSex() {
        return sex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.03+08:00", comments="Source field: erp_vip_info.sex")
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.031+08:00", comments="Source field: erp_vip_info.brithday")
    public LocalDate getBrithday() {
        return brithday;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.031+08:00", comments="Source field: erp_vip_info.brithday")
    public void setBrithday(LocalDate brithday) {
        this.brithday = brithday;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.031+08:00", comments="Source field: erp_vip_info.mobile")
    public String getMobile() {
        return mobile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.031+08:00", comments="Source field: erp_vip_info.mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.031+08:00", comments="Source field: erp_vip_info.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.031+08:00", comments="Source field: erp_vip_info.email")
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.031+08:00", comments="Source field: erp_vip_info.address")
    public String getAddress() {
        return address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.031+08:00", comments="Source field: erp_vip_info.address")
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.032+08:00", comments="Source field: erp_vip_info.score")
    public BigDecimal getScore() {
        return score;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.032+08:00", comments="Source field: erp_vip_info.score")
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.032+08:00", comments="Source field: erp_vip_info.history_score")
    public BigDecimal getHistoryScore() {
        return historyScore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.032+08:00", comments="Source field: erp_vip_info.history_score")
    public void setHistoryScore(BigDecimal historyScore) {
        this.historyScore = historyScore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.032+08:00", comments="Source field: erp_vip_info.is_enable")
    public Boolean getIsEnable() {
        return isEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.032+08:00", comments="Source field: erp_vip_info.is_enable")
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.033+08:00", comments="Source field: erp_vip_info.gmt_create")
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.033+08:00", comments="Source field: erp_vip_info.gmt_create")
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.033+08:00", comments="Source field: erp_vip_info.gmt_modified")
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.033+08:00", comments="Source field: erp_vip_info.gmt_modified")
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.033+08:00", comments="Source field: erp_vip_info.remark")
    public String getRemark() {
        return remark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.033+08:00", comments="Source field: erp_vip_info.remark")
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.034+08:00", comments="Source field: erp_vip_info.vip_referee_mobile")
    public String getVipRefereeMobile() {
        return vipRefereeMobile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.034+08:00", comments="Source field: erp_vip_info.vip_referee_mobile")
    public void setVipRefereeMobile(String vipRefereeMobile) {
        this.vipRefereeMobile = vipRefereeMobile == null ? null : vipRefereeMobile.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.034+08:00", comments="Source field: erp_vip_info.staff_id")
    public Integer getStaffId() {
        return staffId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.034+08:00", comments="Source field: erp_vip_info.staff_id")
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.034+08:00", comments="Source field: erp_vip_info.staff_name")
    public String getStaffName() {
        return staffName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.034+08:00", comments="Source field: erp_vip_info.staff_name")
    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.034+08:00", comments="Source field: erp_vip_info.weixin")
    public String getWeixin() {
        return weixin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.034+08:00", comments="Source field: erp_vip_info.weixin")
    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.035+08:00", comments="Source field: erp_vip_info.qq")
    public String getQq() {
        return qq;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.035+08:00", comments="Source field: erp_vip_info.qq")
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.035+08:00", comments="Source field: erp_vip_info.create_date")
    public LocalDate getCreateDate() {
        return createDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.035+08:00", comments="Source field: erp_vip_info.create_date")
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}