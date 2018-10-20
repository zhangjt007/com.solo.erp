package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpUidSequenceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpUidSequence;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface ErpUidSequenceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.129+08:00", comments="Source Table: erp_uid_sequence")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.13+08:00", comments="Source Table: erp_uid_sequence")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.131+08:00", comments="Source Table: erp_uid_sequence")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ErpUidSequence> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.132+08:00", comments="Source Table: erp_uid_sequence")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpUidSequenceResult")
    ErpUidSequence selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.132+08:00", comments="Source Table: erp_uid_sequence")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpUidSequenceResult")
    List<ErpUidSequence> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.133+08:00", comments="Source Table: erp_uid_sequence")
    default Function<SelectStatementProvider, List<ErpUidSequence>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.132+08:00", comments="Source Table: erp_uid_sequence")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpUidSequenceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="id_name", property="idName", jdbcType=JdbcType.VARCHAR)
    })
    List<ErpUidSequence> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.133+08:00", comments="Source Table: erp_uid_sequence")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.134+08:00", comments="Source Table: erp_uid_sequence")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpUidSequence);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.134+08:00", comments="Source Table: erp_uid_sequence")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpUidSequence);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.135+08:00", comments="Source Table: erp_uid_sequence")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpUidSequence)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.135+08:00", comments="Source Table: erp_uid_sequence")
    default int insert(ErpUidSequence record) {
        return insert(SqlBuilder.insert(record)
                .into(erpUidSequence)
                .map(idName).toProperty("idName")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.136+08:00", comments="Source Table: erp_uid_sequence")
    default int insertSelective(ErpUidSequence record) {
        return insert(SqlBuilder.insert(record)
                .into(erpUidSequence)
                .map(idName).toPropertyWhenPresent("idName", record::getIdName)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.136+08:00", comments="Source Table: erp_uid_sequence")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpUidSequence>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, idName)
                .from(erpUidSequence);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.136+08:00", comments="Source Table: erp_uid_sequence")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpUidSequence>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, idName)
                .from(erpUidSequence);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.137+08:00", comments="Source Table: erp_uid_sequence")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpUidSequence>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, idName)
                .from(erpUidSequence);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.137+08:00", comments="Source Table: erp_uid_sequence")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpUidSequence>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, idName)
                .from(erpUidSequence);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.138+08:00", comments="Source Table: erp_uid_sequence")
    default ErpUidSequence selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, idName)
                .from(erpUidSequence)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.138+08:00", comments="Source Table: erp_uid_sequence")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpUidSequence record) {
        return UpdateDSL.updateWithMapper(this::update, erpUidSequence)
                .set(idName).equalTo(record::getIdName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.139+08:00", comments="Source Table: erp_uid_sequence")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpUidSequence record) {
        return UpdateDSL.updateWithMapper(this::update, erpUidSequence)
                .set(idName).equalToWhenPresent(record::getIdName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.139+08:00", comments="Source Table: erp_uid_sequence")
    default int updateByPrimaryKey(ErpUidSequence record) {
        return UpdateDSL.updateWithMapper(this::update, erpUidSequence)
                .set(idName).equalTo(record::getIdName)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.14+08:00", comments="Source Table: erp_uid_sequence")
    default int updateByPrimaryKeySelective(ErpUidSequence record) {
        return UpdateDSL.updateWithMapper(this::update, erpUidSequence)
                .set(idName).equalToWhenPresent(record::getIdName)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}