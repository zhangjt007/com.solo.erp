package com.solo.erp.dao.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ErpUidSequence implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.119+08:00", comments="Source field: erp_uid_sequence.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.123+08:00", comments="Source field: erp_uid_sequence.id_name")
    private String idName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.123+08:00", comments="Source Table: erp_uid_sequence")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.123+08:00", comments="Source field: erp_uid_sequence.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.123+08:00", comments="Source field: erp_uid_sequence.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.123+08:00", comments="Source field: erp_uid_sequence.id_name")
    public String getIdName() {
        return idName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.123+08:00", comments="Source field: erp_uid_sequence.id_name")
    public void setIdName(String idName) {
        this.idName = idName == null ? null : idName.trim();
    }
}