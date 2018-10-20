package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpRoleInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpRoleInfo;
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
public interface ErpRoleInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.056+08:00", comments="Source Table: erp_role_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.056+08:00", comments="Source Table: erp_role_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.056+08:00", comments="Source Table: erp_role_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ErpRoleInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpRoleInfoResult")
    ErpRoleInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpRoleInfoResult")
    List<ErpRoleInfo> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    default Function<SelectStatementProvider, List<ErpRoleInfo>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpRoleInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="name_zn", property="nameZn", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_enable", property="isEnable", jdbcType=JdbcType.BIT)
    })
    List<ErpRoleInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpRoleInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpRoleInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpRoleInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    default int insert(ErpRoleInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpRoleInfo)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(nameZn).toProperty("nameZn")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .map(isEnable).toProperty("isEnable")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    default int insertSelective(ErpRoleInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpRoleInfo)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(nameZn).toPropertyWhenPresent("nameZn", record::getNameZn)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .map(isEnable).toPropertyWhenPresent("isEnable", record::getIsEnable)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpRoleInfo>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, name, nameZn, gmtCreate, gmtModified, isEnable)
                .from(erpRoleInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpRoleInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, nameZn, gmtCreate, gmtModified, isEnable)
                .from(erpRoleInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpRoleInfo>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, name, nameZn, gmtCreate, gmtModified, isEnable)
                .from(erpRoleInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.057+08:00", comments="Source Table: erp_role_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpRoleInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, nameZn, gmtCreate, gmtModified, isEnable)
                .from(erpRoleInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.058+08:00", comments="Source Table: erp_role_info")
    default ErpRoleInfo selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, nameZn, gmtCreate, gmtModified, isEnable)
                .from(erpRoleInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.058+08:00", comments="Source Table: erp_role_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpRoleInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpRoleInfo)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(nameZn).equalTo(record::getNameZn)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(isEnable).equalTo(record::getIsEnable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.058+08:00", comments="Source Table: erp_role_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpRoleInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpRoleInfo)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(nameZn).equalToWhenPresent(record::getNameZn)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(isEnable).equalToWhenPresent(record::getIsEnable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.058+08:00", comments="Source Table: erp_role_info")
    default int updateByPrimaryKey(ErpRoleInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpRoleInfo)
                .set(name).equalTo(record::getName)
                .set(nameZn).equalTo(record::getNameZn)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(isEnable).equalTo(record::getIsEnable)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.058+08:00", comments="Source Table: erp_role_info")
    default int updateByPrimaryKeySelective(ErpRoleInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpRoleInfo)
                .set(name).equalToWhenPresent(record::getName)
                .set(nameZn).equalToWhenPresent(record::getNameZn)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}