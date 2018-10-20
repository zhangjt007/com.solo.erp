package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpRoleMenuRelDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpRoleMenuRel;
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
public interface ErpRoleMenuRelMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source Table: erp_role_menu_rel")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source Table: erp_role_menu_rel")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source Table: erp_role_menu_rel")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ErpRoleMenuRel> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source Table: erp_role_menu_rel")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpRoleMenuRelResult")
    ErpRoleMenuRel selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source Table: erp_role_menu_rel")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpRoleMenuRelResult")
    List<ErpRoleMenuRel> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source Table: erp_role_menu_rel")
    default Function<SelectStatementProvider, List<ErpRoleMenuRel>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source Table: erp_role_menu_rel")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpRoleMenuRelResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_enable", property="isEnable", jdbcType=JdbcType.BIT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ErpRoleMenuRel> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source Table: erp_role_menu_rel")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source Table: erp_role_menu_rel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpRoleMenuRel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source Table: erp_role_menu_rel")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpRoleMenuRel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source Table: erp_role_menu_rel")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpRoleMenuRel)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.206+08:00", comments="Source Table: erp_role_menu_rel")
    default int insert(ErpRoleMenuRel record) {
        return insert(SqlBuilder.insert(record)
                .into(erpRoleMenuRel)
                .map(id).toProperty("id")
                .map(roleId).toProperty("roleId")
                .map(menuId).toProperty("menuId")
                .map(isEnable).toProperty("isEnable")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.207+08:00", comments="Source Table: erp_role_menu_rel")
    default int insertSelective(ErpRoleMenuRel record) {
        return insert(SqlBuilder.insert(record)
                .into(erpRoleMenuRel)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
                .map(menuId).toPropertyWhenPresent("menuId", record::getMenuId)
                .map(isEnable).toPropertyWhenPresent("isEnable", record::getIsEnable)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.207+08:00", comments="Source Table: erp_role_menu_rel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpRoleMenuRel>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, roleId, menuId, isEnable, gmtCreate, gmtModified)
                .from(erpRoleMenuRel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.207+08:00", comments="Source Table: erp_role_menu_rel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpRoleMenuRel>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, roleId, menuId, isEnable, gmtCreate, gmtModified)
                .from(erpRoleMenuRel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.207+08:00", comments="Source Table: erp_role_menu_rel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpRoleMenuRel>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, roleId, menuId, isEnable, gmtCreate, gmtModified)
                .from(erpRoleMenuRel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.207+08:00", comments="Source Table: erp_role_menu_rel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpRoleMenuRel>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, roleId, menuId, isEnable, gmtCreate, gmtModified)
                .from(erpRoleMenuRel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.207+08:00", comments="Source Table: erp_role_menu_rel")
    default ErpRoleMenuRel selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, roleId, menuId, isEnable, gmtCreate, gmtModified)
                .from(erpRoleMenuRel)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.207+08:00", comments="Source Table: erp_role_menu_rel")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpRoleMenuRel record) {
        return UpdateDSL.updateWithMapper(this::update, erpRoleMenuRel)
                .set(id).equalTo(record::getId)
                .set(roleId).equalTo(record::getRoleId)
                .set(menuId).equalTo(record::getMenuId)
                .set(isEnable).equalTo(record::getIsEnable)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.207+08:00", comments="Source Table: erp_role_menu_rel")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpRoleMenuRel record) {
        return UpdateDSL.updateWithMapper(this::update, erpRoleMenuRel)
                .set(id).equalToWhenPresent(record::getId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(menuId).equalToWhenPresent(record::getMenuId)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.207+08:00", comments="Source Table: erp_role_menu_rel")
    default int updateByPrimaryKey(ErpRoleMenuRel record) {
        return UpdateDSL.updateWithMapper(this::update, erpRoleMenuRel)
                .set(roleId).equalTo(record::getRoleId)
                .set(menuId).equalTo(record::getMenuId)
                .set(isEnable).equalTo(record::getIsEnable)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.208+08:00", comments="Source Table: erp_role_menu_rel")
    default int updateByPrimaryKeySelective(ErpRoleMenuRel record) {
        return UpdateDSL.updateWithMapper(this::update, erpRoleMenuRel)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(menuId).equalToWhenPresent(record::getMenuId)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}