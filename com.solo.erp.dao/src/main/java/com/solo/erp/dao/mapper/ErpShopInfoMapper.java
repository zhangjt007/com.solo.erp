package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpShopInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpShopInfo;
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
public interface ErpShopInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.152+08:00", comments="Source Table: erp_shop_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ErpShopInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpShopInfoResult")
    ErpShopInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpShopInfoResult")
    List<ErpShopInfo> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    default Function<SelectStatementProvider, List<ErpShopInfo>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpShopInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="shop_name", property="shopName", jdbcType=JdbcType.VARCHAR),
        @Result(column="shop_address", property="shopAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_enable", property="isEnable", jdbcType=JdbcType.BIT),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER)
    })
    List<ErpShopInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpShopInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpShopInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpShopInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    default int insert(ErpShopInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpShopInfo)
                .map(id).toProperty("id")
                .map(shopName).toProperty("shopName")
                .map(shopAddress).toProperty("shopAddress")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .map(isEnable).toProperty("isEnable")
                .map(parentId).toProperty("parentId")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    default int insertSelective(ErpShopInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpShopInfo)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(shopName).toPropertyWhenPresent("shopName", record::getShopName)
                .map(shopAddress).toPropertyWhenPresent("shopAddress", record::getShopAddress)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .map(isEnable).toPropertyWhenPresent("isEnable", record::getIsEnable)
                .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpShopInfo>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, shopName, shopAddress, gmtCreate, gmtModified, isEnable, parentId)
                .from(erpShopInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.153+08:00", comments="Source Table: erp_shop_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpShopInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, shopName, shopAddress, gmtCreate, gmtModified, isEnable, parentId)
                .from(erpShopInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.154+08:00", comments="Source Table: erp_shop_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpShopInfo>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, shopName, shopAddress, gmtCreate, gmtModified, isEnable, parentId)
                .from(erpShopInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.154+08:00", comments="Source Table: erp_shop_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpShopInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, shopName, shopAddress, gmtCreate, gmtModified, isEnable, parentId)
                .from(erpShopInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.154+08:00", comments="Source Table: erp_shop_info")
    default ErpShopInfo selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, shopName, shopAddress, gmtCreate, gmtModified, isEnable, parentId)
                .from(erpShopInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.154+08:00", comments="Source Table: erp_shop_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpShopInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpShopInfo)
                .set(id).equalTo(record::getId)
                .set(shopName).equalTo(record::getShopName)
                .set(shopAddress).equalTo(record::getShopAddress)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(isEnable).equalTo(record::getIsEnable)
                .set(parentId).equalTo(record::getParentId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.154+08:00", comments="Source Table: erp_shop_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpShopInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpShopInfo)
                .set(id).equalToWhenPresent(record::getId)
                .set(shopName).equalToWhenPresent(record::getShopName)
                .set(shopAddress).equalToWhenPresent(record::getShopAddress)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .set(parentId).equalToWhenPresent(record::getParentId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.154+08:00", comments="Source Table: erp_shop_info")
    default int updateByPrimaryKey(ErpShopInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpShopInfo)
                .set(shopName).equalTo(record::getShopName)
                .set(shopAddress).equalTo(record::getShopAddress)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(isEnable).equalTo(record::getIsEnable)
                .set(parentId).equalTo(record::getParentId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.154+08:00", comments="Source Table: erp_shop_info")
    default int updateByPrimaryKeySelective(ErpShopInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpShopInfo)
                .set(shopName).equalToWhenPresent(record::getShopName)
                .set(shopAddress).equalToWhenPresent(record::getShopAddress)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}