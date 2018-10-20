package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpInventoryInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpInventoryInfo;
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
public interface ErpInventoryInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source Table: erp_inventory_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source Table: erp_inventory_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.198+08:00", comments="Source Table: erp_inventory_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ErpInventoryInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpInventoryInfoResult")
    ErpInventoryInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpInventoryInfoResult")
    List<ErpInventoryInfo> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default Function<SelectStatementProvider, List<ErpInventoryInfo>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpInventoryInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="product_no", property="productNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_sn", property="productSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="color", property="color", jdbcType=JdbcType.VARCHAR),
        @Result(column="size", property="size", jdbcType=JdbcType.INTEGER),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="shop_name", property="shopName", jdbcType=JdbcType.VARCHAR),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ErpInventoryInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpInventoryInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpInventoryInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpInventoryInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default int insert(ErpInventoryInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpInventoryInfo)
                .map(id).toProperty("id")
                .map(productNo).toProperty("productNo")
                .map(productSn).toProperty("productSn")
                .map(productName).toProperty("productName")
                .map(color).toProperty("color")
                .map(size).toProperty("size")
                .map(num).toProperty("num")
                .map(shopName).toProperty("shopName")
                .map(shopId).toProperty("shopId")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default int insertSelective(ErpInventoryInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpInventoryInfo)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(productNo).toPropertyWhenPresent("productNo", record::getProductNo)
                .map(productSn).toPropertyWhenPresent("productSn", record::getProductSn)
                .map(productName).toPropertyWhenPresent("productName", record::getProductName)
                .map(color).toPropertyWhenPresent("color", record::getColor)
                .map(size).toPropertyWhenPresent("size", record::getSize)
                .map(num).toPropertyWhenPresent("num", record::getNum)
                .map(shopName).toPropertyWhenPresent("shopName", record::getShopName)
                .map(shopId).toPropertyWhenPresent("shopId", record::getShopId)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpInventoryInfo>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, productNo, productSn, productName, color, size, num, shopName, shopId, gmtCreate, gmtModified)
                .from(erpInventoryInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpInventoryInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, productNo, productSn, productName, color, size, num, shopName, shopId, gmtCreate, gmtModified)
                .from(erpInventoryInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpInventoryInfo>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, productNo, productSn, productName, color, size, num, shopName, shopId, gmtCreate, gmtModified)
                .from(erpInventoryInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpInventoryInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, productNo, productSn, productName, color, size, num, shopName, shopId, gmtCreate, gmtModified)
                .from(erpInventoryInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default ErpInventoryInfo selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, productNo, productSn, productName, color, size, num, shopName, shopId, gmtCreate, gmtModified)
                .from(erpInventoryInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpInventoryInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpInventoryInfo)
                .set(id).equalTo(record::getId)
                .set(productNo).equalTo(record::getProductNo)
                .set(productSn).equalTo(record::getProductSn)
                .set(productName).equalTo(record::getProductName)
                .set(color).equalTo(record::getColor)
                .set(size).equalTo(record::getSize)
                .set(num).equalTo(record::getNum)
                .set(shopName).equalTo(record::getShopName)
                .set(shopId).equalTo(record::getShopId)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpInventoryInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpInventoryInfo)
                .set(id).equalToWhenPresent(record::getId)
                .set(productNo).equalToWhenPresent(record::getProductNo)
                .set(productSn).equalToWhenPresent(record::getProductSn)
                .set(productName).equalToWhenPresent(record::getProductName)
                .set(color).equalToWhenPresent(record::getColor)
                .set(size).equalToWhenPresent(record::getSize)
                .set(num).equalToWhenPresent(record::getNum)
                .set(shopName).equalToWhenPresent(record::getShopName)
                .set(shopId).equalToWhenPresent(record::getShopId)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default int updateByPrimaryKey(ErpInventoryInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpInventoryInfo)
                .set(productNo).equalTo(record::getProductNo)
                .set(productSn).equalTo(record::getProductSn)
                .set(productName).equalTo(record::getProductName)
                .set(color).equalTo(record::getColor)
                .set(size).equalTo(record::getSize)
                .set(num).equalTo(record::getNum)
                .set(shopName).equalTo(record::getShopName)
                .set(shopId).equalTo(record::getShopId)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.199+08:00", comments="Source Table: erp_inventory_info")
    default int updateByPrimaryKeySelective(ErpInventoryInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpInventoryInfo)
                .set(productNo).equalToWhenPresent(record::getProductNo)
                .set(productSn).equalToWhenPresent(record::getProductSn)
                .set(productName).equalToWhenPresent(record::getProductName)
                .set(color).equalToWhenPresent(record::getColor)
                .set(size).equalToWhenPresent(record::getSize)
                .set(num).equalToWhenPresent(record::getNum)
                .set(shopName).equalToWhenPresent(record::getShopName)
                .set(shopId).equalToWhenPresent(record::getShopId)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}