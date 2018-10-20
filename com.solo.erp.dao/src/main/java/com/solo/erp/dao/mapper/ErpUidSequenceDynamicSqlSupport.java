package com.solo.erp.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ErpUidSequenceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.128+08:00", comments="Source Table: erp_uid_sequence")
    public static final ErpUidSequence erpUidSequence = new ErpUidSequence();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.128+08:00", comments="Source field: erp_uid_sequence.id")
    public static final SqlColumn<Integer> id = erpUidSequence.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.129+08:00", comments="Source field: erp_uid_sequence.id_name")
    public static final SqlColumn<String> idName = erpUidSequence.idName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.128+08:00", comments="Source Table: erp_uid_sequence")
    public static final class ErpUidSequence extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> idName = column("id_name", JDBCType.VARCHAR);

        public ErpUidSequence() {
            super("erp_uid_sequence");
        }
    }
}