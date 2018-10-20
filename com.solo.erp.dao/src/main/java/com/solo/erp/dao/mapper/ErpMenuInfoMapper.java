package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpMenuInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpMenuInfo;
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
public interface ErpMenuInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ErpMenuInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpMenuInfoResult")
    ErpMenuInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpMenuInfoResult")
    List<ErpMenuInfo> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    default Function<SelectStatementProvider, List<ErpMenuInfo>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpMenuInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="component", property="component", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_enable", property="isEnable", jdbcType=JdbcType.BIT),
        @Result(column="require_auth", property="requireAuth", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ErpMenuInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpMenuInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpMenuInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpMenuInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    default int insert(ErpMenuInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpMenuInfo)
                .map(id).toProperty("id")
                .map(url).toProperty("url")
                .map(path).toProperty("path")
                .map(name).toProperty("name")
                .map(component).toProperty("component")
                .map(icon).toProperty("icon")
                .map(parentId).toProperty("parentId")
                .map(isEnable).toProperty("isEnable")
                .map(requireAuth).toProperty("requireAuth")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.148+08:00", comments="Source Table: erp_menu_info")
    default int insertSelective(ErpMenuInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpMenuInfo)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(url).toPropertyWhenPresent("url", record::getUrl)
                .map(path).toPropertyWhenPresent("path", record::getPath)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(component).toPropertyWhenPresent("component", record::getComponent)
                .map(icon).toPropertyWhenPresent("icon", record::getIcon)
                .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
                .map(isEnable).toPropertyWhenPresent("isEnable", record::getIsEnable)
                .map(requireAuth).toPropertyWhenPresent("requireAuth", record::getRequireAuth)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.149+08:00", comments="Source Table: erp_menu_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpMenuInfo>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, url, path, name, component, icon, parentId, isEnable, requireAuth, gmtCreate, gmtModified)
                .from(erpMenuInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.149+08:00", comments="Source Table: erp_menu_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpMenuInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, url, path, name, component, icon, parentId, isEnable, requireAuth, gmtCreate, gmtModified)
                .from(erpMenuInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.149+08:00", comments="Source Table: erp_menu_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpMenuInfo>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, url, path, name, component, icon, parentId, isEnable, requireAuth, gmtCreate, gmtModified)
                .from(erpMenuInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.149+08:00", comments="Source Table: erp_menu_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpMenuInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, url, path, name, component, icon, parentId, isEnable, requireAuth, gmtCreate, gmtModified)
                .from(erpMenuInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.149+08:00", comments="Source Table: erp_menu_info")
    default ErpMenuInfo selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, url, path, name, component, icon, parentId, isEnable, requireAuth, gmtCreate, gmtModified)
                .from(erpMenuInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.149+08:00", comments="Source Table: erp_menu_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpMenuInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpMenuInfo)
                .set(id).equalTo(record::getId)
                .set(url).equalTo(record::getUrl)
                .set(path).equalTo(record::getPath)
                .set(name).equalTo(record::getName)
                .set(component).equalTo(record::getComponent)
                .set(icon).equalTo(record::getIcon)
                .set(parentId).equalTo(record::getParentId)
                .set(isEnable).equalTo(record::getIsEnable)
                .set(requireAuth).equalTo(record::getRequireAuth)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.149+08:00", comments="Source Table: erp_menu_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpMenuInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpMenuInfo)
                .set(id).equalToWhenPresent(record::getId)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(path).equalToWhenPresent(record::getPath)
                .set(name).equalToWhenPresent(record::getName)
                .set(component).equalToWhenPresent(record::getComponent)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .set(requireAuth).equalToWhenPresent(record::getRequireAuth)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.149+08:00", comments="Source Table: erp_menu_info")
    default int updateByPrimaryKey(ErpMenuInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpMenuInfo)
                .set(url).equalTo(record::getUrl)
                .set(path).equalTo(record::getPath)
                .set(name).equalTo(record::getName)
                .set(component).equalTo(record::getComponent)
                .set(icon).equalTo(record::getIcon)
                .set(parentId).equalTo(record::getParentId)
                .set(isEnable).equalTo(record::getIsEnable)
                .set(requireAuth).equalTo(record::getRequireAuth)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.15+08:00", comments="Source Table: erp_menu_info")
    default int updateByPrimaryKeySelective(ErpMenuInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpMenuInfo)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(path).equalToWhenPresent(record::getPath)
                .set(name).equalToWhenPresent(record::getName)
                .set(component).equalToWhenPresent(record::getComponent)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .set(requireAuth).equalToWhenPresent(record::getRequireAuth)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}