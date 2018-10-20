package com.solo.erp.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;

public class ErpShopTarget implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.14+08:00", comments="Source field: erp_shop_target.date")
    private LocalDate date;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.14+08:00", comments="Source field: erp_shop_target.shop_id")
    private Integer shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.141+08:00", comments="Source field: erp_shop_target.target_amout")
    private BigDecimal targetAmout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.141+08:00", comments="Source Table: erp_shop_target")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.14+08:00", comments="Source field: erp_shop_target.date")
    public LocalDate getDate() {
        return date;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.14+08:00", comments="Source field: erp_shop_target.date")
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.14+08:00", comments="Source field: erp_shop_target.shop_id")
    public Integer getShopId() {
        return shopId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.141+08:00", comments="Source field: erp_shop_target.shop_id")
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.141+08:00", comments="Source field: erp_shop_target.target_amout")
    public BigDecimal getTargetAmout() {
        return targetAmout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.141+08:00", comments="Source field: erp_shop_target.target_amout")
    public void setTargetAmout(BigDecimal targetAmout) {
        this.targetAmout = targetAmout;
    }
}