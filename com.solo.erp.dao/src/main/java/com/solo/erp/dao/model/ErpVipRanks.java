package com.solo.erp.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class ErpVipRanks implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.rank_name")
    private String rankName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.start_score")
    private BigDecimal startScore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.end_score")
    private BigDecimal endScore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.rebate")
    private Integer rebate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source field: erp_vip_ranks.gmt_create")
    private LocalDateTime gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source field: erp_vip_ranks.gmt_modified")
    private LocalDateTime gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source field: erp_vip_ranks.is_enable")
    private Boolean isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source Table: erp_vip_ranks")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.rank_name")
    public String getRankName() {
        return rankName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.rank_name")
    public void setRankName(String rankName) {
        this.rankName = rankName == null ? null : rankName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.start_score")
    public BigDecimal getStartScore() {
        return startScore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.start_score")
    public void setStartScore(BigDecimal startScore) {
        this.startScore = startScore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.end_score")
    public BigDecimal getEndScore() {
        return endScore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.end_score")
    public void setEndScore(BigDecimal endScore) {
        this.endScore = endScore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source field: erp_vip_ranks.rebate")
    public Integer getRebate() {
        return rebate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source field: erp_vip_ranks.rebate")
    public void setRebate(Integer rebate) {
        this.rebate = rebate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source field: erp_vip_ranks.gmt_create")
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source field: erp_vip_ranks.gmt_create")
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source field: erp_vip_ranks.gmt_modified")
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source field: erp_vip_ranks.gmt_modified")
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source field: erp_vip_ranks.is_enable")
    public Boolean getIsEnable() {
        return isEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.209+08:00", comments="Source field: erp_vip_ranks.is_enable")
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }
}