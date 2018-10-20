package com.solo.erp.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class ErpVipScore implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source field: erp_vip_score.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source field: erp_vip_score.vip_id")
    private Integer vipId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source field: erp_vip_score.score")
    private BigDecimal score;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.data_src")
    private String dataSrc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.data_id")
    private String dataId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.remark")
    private String remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.gmt_create")
    private LocalDateTime gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.gmt_modified")
    private LocalDateTime gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source Table: erp_vip_score")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source field: erp_vip_score.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source field: erp_vip_score.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source field: erp_vip_score.vip_id")
    public Integer getVipId() {
        return vipId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source field: erp_vip_score.vip_id")
    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source field: erp_vip_score.score")
    public BigDecimal getScore() {
        return score;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.score")
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.data_src")
    public String getDataSrc() {
        return dataSrc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.data_src")
    public void setDataSrc(String dataSrc) {
        this.dataSrc = dataSrc == null ? null : dataSrc.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.data_id")
    public String getDataId() {
        return dataId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.data_id")
    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.remark")
    public String getRemark() {
        return remark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.remark")
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.gmt_create")
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.gmt_create")
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.gmt_modified")
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.212+08:00", comments="Source field: erp_vip_score.gmt_modified")
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}