package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpProductInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpProductInfo;
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
public interface ErpProductInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ErpProductInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpProductInfoResult")
    ErpProductInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpProductInfoResult")
    List<ErpProductInfo> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    default Function<SelectStatementProvider, List<ErpProductInfo>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpProductInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="product_no", property="productNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="year", property="year", jdbcType=JdbcType.INTEGER),
        @Result(column="season", property="season", jdbcType=JdbcType.INTEGER),
        @Result(column="wave_band", property="waveBand", jdbcType=JdbcType.INTEGER),
        @Result(column="product_type", property="productType", jdbcType=JdbcType.CHAR),
        @Result(column="product_img", property="productImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_thums", property="productThums", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_name", property="brandName", jdbcType=JdbcType.VARCHAR),
        @Result(column="tag_price", property="tagPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="real_price", property="realPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="cost_price", property="costPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="size", property="size", jdbcType=JdbcType.VARCHAR),
        @Result(column="color", property="color", jdbcType=JdbcType.VARCHAR),
        @Result(column="discount", property="discount", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ErpProductInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpProductInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpProductInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpProductInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    default int insert(ErpProductInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpProductInfo)
                .map(id).toProperty("id")
                .map(productNo).toProperty("productNo")
                .map(productName).toProperty("productName")
                .map(year).toProperty("year")
                .map(season).toProperty("season")
                .map(waveBand).toProperty("waveBand")
                .map(productType).toProperty("productType")
                .map(productImg).toProperty("productImg")
                .map(productThums).toProperty("productThums")
                .map(brandName).toProperty("brandName")
                .map(tagPrice).toProperty("tagPrice")
                .map(realPrice).toProperty("realPrice")
                .map(costPrice).toProperty("costPrice")
                .map(size).toProperty("size")
                .map(color).toProperty("color")
                .map(discount).toProperty("discount")
                .map(remark).toProperty("remark")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    default int insertSelective(ErpProductInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpProductInfo)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(productNo).toPropertyWhenPresent("productNo", record::getProductNo)
                .map(productName).toPropertyWhenPresent("productName", record::getProductName)
                .map(year).toPropertyWhenPresent("year", record::getYear)
                .map(season).toPropertyWhenPresent("season", record::getSeason)
                .map(waveBand).toPropertyWhenPresent("waveBand", record::getWaveBand)
                .map(productType).toPropertyWhenPresent("productType", record::getProductType)
                .map(productImg).toPropertyWhenPresent("productImg", record::getProductImg)
                .map(productThums).toPropertyWhenPresent("productThums", record::getProductThums)
                .map(brandName).toPropertyWhenPresent("brandName", record::getBrandName)
                .map(tagPrice).toPropertyWhenPresent("tagPrice", record::getTagPrice)
                .map(realPrice).toPropertyWhenPresent("realPrice", record::getRealPrice)
                .map(costPrice).toPropertyWhenPresent("costPrice", record::getCostPrice)
                .map(size).toPropertyWhenPresent("size", record::getSize)
                .map(color).toPropertyWhenPresent("color", record::getColor)
                .map(discount).toPropertyWhenPresent("discount", record::getDiscount)
                .map(remark).toPropertyWhenPresent("remark", record::getRemark)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpProductInfo>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, productNo, productName, year, season, waveBand, productType, productImg, productThums, brandName, tagPrice, realPrice, costPrice, size, color, discount, remark, gmtCreate, gmtModified)
                .from(erpProductInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.195+08:00", comments="Source Table: erp_product_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpProductInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, productNo, productName, year, season, waveBand, productType, productImg, productThums, brandName, tagPrice, realPrice, costPrice, size, color, discount, remark, gmtCreate, gmtModified)
                .from(erpProductInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source Table: erp_product_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpProductInfo>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, productNo, productName, year, season, waveBand, productType, productImg, productThums, brandName, tagPrice, realPrice, costPrice, size, color, discount, remark, gmtCreate, gmtModified)
                .from(erpProductInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source Table: erp_product_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpProductInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, productNo, productName, year, season, waveBand, productType, productImg, productThums, brandName, tagPrice, realPrice, costPrice, size, color, discount, remark, gmtCreate, gmtModified)
                .from(erpProductInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source Table: erp_product_info")
    default ErpProductInfo selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, productNo, productName, year, season, waveBand, productType, productImg, productThums, brandName, tagPrice, realPrice, costPrice, size, color, discount, remark, gmtCreate, gmtModified)
                .from(erpProductInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source Table: erp_product_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpProductInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpProductInfo)
                .set(id).equalTo(record::getId)
                .set(productNo).equalTo(record::getProductNo)
                .set(productName).equalTo(record::getProductName)
                .set(year).equalTo(record::getYear)
                .set(season).equalTo(record::getSeason)
                .set(waveBand).equalTo(record::getWaveBand)
                .set(productType).equalTo(record::getProductType)
                .set(productImg).equalTo(record::getProductImg)
                .set(productThums).equalTo(record::getProductThums)
                .set(brandName).equalTo(record::getBrandName)
                .set(tagPrice).equalTo(record::getTagPrice)
                .set(realPrice).equalTo(record::getRealPrice)
                .set(costPrice).equalTo(record::getCostPrice)
                .set(size).equalTo(record::getSize)
                .set(color).equalTo(record::getColor)
                .set(discount).equalTo(record::getDiscount)
                .set(remark).equalTo(record::getRemark)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source Table: erp_product_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpProductInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpProductInfo)
                .set(id).equalToWhenPresent(record::getId)
                .set(productNo).equalToWhenPresent(record::getProductNo)
                .set(productName).equalToWhenPresent(record::getProductName)
                .set(year).equalToWhenPresent(record::getYear)
                .set(season).equalToWhenPresent(record::getSeason)
                .set(waveBand).equalToWhenPresent(record::getWaveBand)
                .set(productType).equalToWhenPresent(record::getProductType)
                .set(productImg).equalToWhenPresent(record::getProductImg)
                .set(productThums).equalToWhenPresent(record::getProductThums)
                .set(brandName).equalToWhenPresent(record::getBrandName)
                .set(tagPrice).equalToWhenPresent(record::getTagPrice)
                .set(realPrice).equalToWhenPresent(record::getRealPrice)
                .set(costPrice).equalToWhenPresent(record::getCostPrice)
                .set(size).equalToWhenPresent(record::getSize)
                .set(color).equalToWhenPresent(record::getColor)
                .set(discount).equalToWhenPresent(record::getDiscount)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source Table: erp_product_info")
    default int updateByPrimaryKey(ErpProductInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpProductInfo)
                .set(productNo).equalTo(record::getProductNo)
                .set(productName).equalTo(record::getProductName)
                .set(year).equalTo(record::getYear)
                .set(season).equalTo(record::getSeason)
                .set(waveBand).equalTo(record::getWaveBand)
                .set(productType).equalTo(record::getProductType)
                .set(productImg).equalTo(record::getProductImg)
                .set(productThums).equalTo(record::getProductThums)
                .set(brandName).equalTo(record::getBrandName)
                .set(tagPrice).equalTo(record::getTagPrice)
                .set(realPrice).equalTo(record::getRealPrice)
                .set(costPrice).equalTo(record::getCostPrice)
                .set(size).equalTo(record::getSize)
                .set(color).equalTo(record::getColor)
                .set(discount).equalTo(record::getDiscount)
                .set(remark).equalTo(record::getRemark)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.196+08:00", comments="Source Table: erp_product_info")
    default int updateByPrimaryKeySelective(ErpProductInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpProductInfo)
                .set(productNo).equalToWhenPresent(record::getProductNo)
                .set(productName).equalToWhenPresent(record::getProductName)
                .set(year).equalToWhenPresent(record::getYear)
                .set(season).equalToWhenPresent(record::getSeason)
                .set(waveBand).equalToWhenPresent(record::getWaveBand)
                .set(productType).equalToWhenPresent(record::getProductType)
                .set(productImg).equalToWhenPresent(record::getProductImg)
                .set(productThums).equalToWhenPresent(record::getProductThums)
                .set(brandName).equalToWhenPresent(record::getBrandName)
                .set(tagPrice).equalToWhenPresent(record::getTagPrice)
                .set(realPrice).equalToWhenPresent(record::getRealPrice)
                .set(costPrice).equalToWhenPresent(record::getCostPrice)
                .set(size).equalToWhenPresent(record::getSize)
                .set(color).equalToWhenPresent(record::getColor)
                .set(discount).equalToWhenPresent(record::getDiscount)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}