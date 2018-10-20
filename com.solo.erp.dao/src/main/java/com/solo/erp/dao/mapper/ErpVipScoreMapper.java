package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpVipScoreDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpVipScore;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
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
public interface ErpVipScoreMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ErpVipScore> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpVipScoreResult")
    ErpVipScore selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpVipScoreResult")
    List<ErpVipScore> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    default Function<SelectStatementProvider, List<ErpVipScore>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpVipScoreResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="vip_id", property="vipId", jdbcType=JdbcType.INTEGER),
        @Result(column="score", property="score", jdbcType=JdbcType.DECIMAL),
        @Result(column="data_src", property="dataSrc", jdbcType=JdbcType.CHAR),
        @Result(column="data_id", property="dataId", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ErpVipScore> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpVipScore);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpVipScore);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpVipScore)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    default int insert(ErpVipScore record) {
        return insert(SqlBuilder.insert(record)
                .into(erpVipScore)
                .map(id).toProperty("id")
                .map(vipId).toProperty("vipId")
                .map(score).toProperty("score")
                .map(dataSrc).toProperty("dataSrc")
                .map(dataId).toProperty("dataId")
                .map(remark).toProperty("remark")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    default int insertSelective(ErpVipScore record) {
        return insert(SqlBuilder.insert(record)
                .into(erpVipScore)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(vipId).toPropertyWhenPresent("vipId", record::getVipId)
                .map(score).toPropertyWhenPresent("score", record::getScore)
                .map(dataSrc).toPropertyWhenPresent("dataSrc", record::getDataSrc)
                .map(dataId).toPropertyWhenPresent("dataId", record::getDataId)
                .map(remark).toPropertyWhenPresent("remark", record::getRemark)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpVipScore>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, vipId, score, dataSrc, dataId, remark, gmtCreate, gmtModified)
                .from(erpVipScore);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpVipScore>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, vipId, score, dataSrc, dataId, remark, gmtCreate, gmtModified)
                .from(erpVipScore);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpVipScore>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, vipId, score, dataSrc, dataId, remark, gmtCreate, gmtModified)
                .from(erpVipScore);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpVipScore>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, vipId, score, dataSrc, dataId, remark, gmtCreate, gmtModified)
                .from(erpVipScore);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    default ErpVipScore selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, vipId, score, dataSrc, dataId, remark, gmtCreate, gmtModified)
                .from(erpVipScore)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.213+08:00", comments="Source Table: erp_vip_score")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpVipScore record) {
        return UpdateDSL.updateWithMapper(this::update, erpVipScore)
                .set(id).equalTo(record::getId)
                .set(vipId).equalTo(record::getVipId)
                .set(score).equalTo(record::getScore)
                .set(dataSrc).equalTo(record::getDataSrc)
                .set(dataId).equalTo(record::getDataId)
                .set(remark).equalTo(record::getRemark)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.214+08:00", comments="Source Table: erp_vip_score")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpVipScore record) {
        return UpdateDSL.updateWithMapper(this::update, erpVipScore)
                .set(id).equalToWhenPresent(record::getId)
                .set(vipId).equalToWhenPresent(record::getVipId)
                .set(score).equalToWhenPresent(record::getScore)
                .set(dataSrc).equalToWhenPresent(record::getDataSrc)
                .set(dataId).equalToWhenPresent(record::getDataId)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.214+08:00", comments="Source Table: erp_vip_score")
    default int updateByPrimaryKey(ErpVipScore record) {
        return UpdateDSL.updateWithMapper(this::update, erpVipScore)
                .set(vipId).equalTo(record::getVipId)
                .set(score).equalTo(record::getScore)
                .set(dataSrc).equalTo(record::getDataSrc)
                .set(dataId).equalTo(record::getDataId)
                .set(remark).equalTo(record::getRemark)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.214+08:00", comments="Source Table: erp_vip_score")
    default int updateByPrimaryKeySelective(ErpVipScore record) {
        return UpdateDSL.updateWithMapper(this::update, erpVipScore)
                .set(vipId).equalToWhenPresent(record::getVipId)
                .set(score).equalToWhenPresent(record::getScore)
                .set(dataSrc).equalToWhenPresent(record::getDataSrc)
                .set(dataId).equalToWhenPresent(record::getDataId)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}