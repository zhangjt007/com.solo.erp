package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpStaffRoleRelDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpStaffRoleRel;
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
public interface ErpStaffRoleRelMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ErpStaffRoleRel> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpStaffRoleRelResult")
    ErpStaffRoleRel selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpStaffRoleRelResult")
    List<ErpStaffRoleRel> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    default Function<SelectStatementProvider, List<ErpStaffRoleRel>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpStaffRoleRelResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="staff_id", property="staffId", jdbcType=JdbcType.INTEGER),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_enable", property="isEnable", jdbcType=JdbcType.BIT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ErpStaffRoleRel> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpStaffRoleRel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpStaffRoleRel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpStaffRoleRel)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    default int insert(ErpStaffRoleRel record) {
        return insert(SqlBuilder.insert(record)
                .into(erpStaffRoleRel)
                .map(id).toProperty("id")
                .map(staffId).toProperty("staffId")
                .map(roleId).toProperty("roleId")
                .map(isEnable).toProperty("isEnable")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    default int insertSelective(ErpStaffRoleRel record) {
        return insert(SqlBuilder.insert(record)
                .into(erpStaffRoleRel)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(staffId).toPropertyWhenPresent("staffId", record::getStaffId)
                .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
                .map(isEnable).toPropertyWhenPresent("isEnable", record::getIsEnable)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpStaffRoleRel>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, staffId, roleId, isEnable, gmtCreate, gmtModified)
                .from(erpStaffRoleRel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpStaffRoleRel>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, staffId, roleId, isEnable, gmtCreate, gmtModified)
                .from(erpStaffRoleRel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpStaffRoleRel>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, staffId, roleId, isEnable, gmtCreate, gmtModified)
                .from(erpStaffRoleRel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpStaffRoleRel>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, staffId, roleId, isEnable, gmtCreate, gmtModified)
                .from(erpStaffRoleRel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    default ErpStaffRoleRel selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, staffId, roleId, isEnable, gmtCreate, gmtModified)
                .from(erpStaffRoleRel)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.215+08:00", comments="Source Table: erp_staff_role_rel")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpStaffRoleRel record) {
        return UpdateDSL.updateWithMapper(this::update, erpStaffRoleRel)
                .set(id).equalTo(record::getId)
                .set(staffId).equalTo(record::getStaffId)
                .set(roleId).equalTo(record::getRoleId)
                .set(isEnable).equalTo(record::getIsEnable)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.216+08:00", comments="Source Table: erp_staff_role_rel")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpStaffRoleRel record) {
        return UpdateDSL.updateWithMapper(this::update, erpStaffRoleRel)
                .set(id).equalToWhenPresent(record::getId)
                .set(staffId).equalToWhenPresent(record::getStaffId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.216+08:00", comments="Source Table: erp_staff_role_rel")
    default int updateByPrimaryKey(ErpStaffRoleRel record) {
        return UpdateDSL.updateWithMapper(this::update, erpStaffRoleRel)
                .set(staffId).equalTo(record::getStaffId)
                .set(roleId).equalTo(record::getRoleId)
                .set(isEnable).equalTo(record::getIsEnable)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.216+08:00", comments="Source Table: erp_staff_role_rel")
    default int updateByPrimaryKeySelective(ErpStaffRoleRel record) {
        return UpdateDSL.updateWithMapper(this::update, erpStaffRoleRel)
                .set(staffId).equalToWhenPresent(record::getStaffId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}