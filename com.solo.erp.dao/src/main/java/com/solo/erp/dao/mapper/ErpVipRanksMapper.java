package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpVipRanksDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpVipRanks;
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
public interface ErpVipRanksMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ErpVipRanks> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpVipRanksResult")
    ErpVipRanks selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpVipRanksResult")
    List<ErpVipRanks> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    default Function<SelectStatementProvider, List<ErpVipRanks>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpVipRanksResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="rank_name", property="rankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_score", property="startScore", jdbcType=JdbcType.DECIMAL),
        @Result(column="end_score", property="endScore", jdbcType=JdbcType.DECIMAL),
        @Result(column="rebate", property="rebate", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_enable", property="isEnable", jdbcType=JdbcType.BIT)
    })
    List<ErpVipRanks> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpVipRanks);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpVipRanks);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpVipRanks)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    default int insert(ErpVipRanks record) {
        return insert(SqlBuilder.insert(record)
                .into(erpVipRanks)
                .map(id).toProperty("id")
                .map(rankName).toProperty("rankName")
                .map(startScore).toProperty("startScore")
                .map(endScore).toProperty("endScore")
                .map(rebate).toProperty("rebate")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .map(isEnable).toProperty("isEnable")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    default int insertSelective(ErpVipRanks record) {
        return insert(SqlBuilder.insert(record)
                .into(erpVipRanks)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(rankName).toPropertyWhenPresent("rankName", record::getRankName)
                .map(startScore).toPropertyWhenPresent("startScore", record::getStartScore)
                .map(endScore).toPropertyWhenPresent("endScore", record::getEndScore)
                .map(rebate).toPropertyWhenPresent("rebate", record::getRebate)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .map(isEnable).toPropertyWhenPresent("isEnable", record::getIsEnable)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpVipRanks>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, rankName, startScore, endScore, rebate, gmtCreate, gmtModified, isEnable)
                .from(erpVipRanks);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.21+08:00", comments="Source Table: erp_vip_ranks")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpVipRanks>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, rankName, startScore, endScore, rebate, gmtCreate, gmtModified, isEnable)
                .from(erpVipRanks);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source Table: erp_vip_ranks")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpVipRanks>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, rankName, startScore, endScore, rebate, gmtCreate, gmtModified, isEnable)
                .from(erpVipRanks);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source Table: erp_vip_ranks")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpVipRanks>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, rankName, startScore, endScore, rebate, gmtCreate, gmtModified, isEnable)
                .from(erpVipRanks);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source Table: erp_vip_ranks")
    default ErpVipRanks selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, rankName, startScore, endScore, rebate, gmtCreate, gmtModified, isEnable)
                .from(erpVipRanks)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source Table: erp_vip_ranks")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpVipRanks record) {
        return UpdateDSL.updateWithMapper(this::update, erpVipRanks)
                .set(id).equalTo(record::getId)
                .set(rankName).equalTo(record::getRankName)
                .set(startScore).equalTo(record::getStartScore)
                .set(endScore).equalTo(record::getEndScore)
                .set(rebate).equalTo(record::getRebate)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(isEnable).equalTo(record::getIsEnable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source Table: erp_vip_ranks")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpVipRanks record) {
        return UpdateDSL.updateWithMapper(this::update, erpVipRanks)
                .set(id).equalToWhenPresent(record::getId)
                .set(rankName).equalToWhenPresent(record::getRankName)
                .set(startScore).equalToWhenPresent(record::getStartScore)
                .set(endScore).equalToWhenPresent(record::getEndScore)
                .set(rebate).equalToWhenPresent(record::getRebate)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(isEnable).equalToWhenPresent(record::getIsEnable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source Table: erp_vip_ranks")
    default int updateByPrimaryKey(ErpVipRanks record) {
        return UpdateDSL.updateWithMapper(this::update, erpVipRanks)
                .set(rankName).equalTo(record::getRankName)
                .set(startScore).equalTo(record::getStartScore)
                .set(endScore).equalTo(record::getEndScore)
                .set(rebate).equalTo(record::getRebate)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(isEnable).equalTo(record::getIsEnable)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.211+08:00", comments="Source Table: erp_vip_ranks")
    default int updateByPrimaryKeySelective(ErpVipRanks record) {
        return UpdateDSL.updateWithMapper(this::update, erpVipRanks)
                .set(rankName).equalToWhenPresent(record::getRankName)
                .set(startScore).equalToWhenPresent(record::getStartScore)
                .set(endScore).equalToWhenPresent(record::getEndScore)
                .set(rebate).equalToWhenPresent(record::getRebate)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}