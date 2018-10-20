package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpOrderDetailDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpOrderDetail;
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
public interface ErpOrderDetailMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.433+08:00", comments="Source Table: erp_order_detail")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.435+08:00", comments="Source Table: erp_order_detail")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.435+08:00", comments="Source Table: erp_order_detail")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ErpOrderDetail> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.436+08:00", comments="Source Table: erp_order_detail")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpOrderDetailResult")
    ErpOrderDetail selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.436+08:00", comments="Source Table: erp_order_detail")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpOrderDetailResult")
    List<ErpOrderDetail> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.437+08:00", comments="Source Table: erp_order_detail")
    default Function<SelectStatementProvider, List<ErpOrderDetail>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.436+08:00", comments="Source Table: erp_order_detail")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpOrderDetailResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_sn", property="productSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_no", property="productNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="size", property="size", jdbcType=JdbcType.INTEGER),
        @Result(column="color", property="color", jdbcType=JdbcType.VARCHAR),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="real_price", property="realPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="tag_price", property="tagPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_score", property="orderScore", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_date", property="orderDate", jdbcType=JdbcType.DATE),
        @Result(column="origin_id", property="originId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_refund", property="isRefund", jdbcType=JdbcType.BIT),
        @Result(column="order_status", property="orderStatus", jdbcType=JdbcType.CHAR),
        @Result(column="vip_mobile", property="vipMobile", jdbcType=JdbcType.CHAR),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="staff_id", property="staffId", jdbcType=JdbcType.INTEGER),
        @Result(column="staff_name", property="staffName", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ErpOrderDetail> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.437+08:00", comments="Source Table: erp_order_detail")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.438+08:00", comments="Source Table: erp_order_detail")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpOrderDetail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.438+08:00", comments="Source Table: erp_order_detail")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpOrderDetail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.439+08:00", comments="Source Table: erp_order_detail")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpOrderDetail)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.439+08:00", comments="Source Table: erp_order_detail")
    default int insert(ErpOrderDetail record) {
        return insert(SqlBuilder.insert(record)
                .into(erpOrderDetail)
                .map(id).toProperty("id")
                .map(orderNo).toProperty("orderNo")
                .map(productName).toProperty("productName")
                .map(productSn).toProperty("productSn")
                .map(productNo).toProperty("productNo")
                .map(size).toProperty("size")
                .map(color).toProperty("color")
                .map(num).toProperty("num")
                .map(realPrice).toProperty("realPrice")
                .map(tagPrice).toProperty("tagPrice")
                .map(orderScore).toProperty("orderScore")
                .map(orderDate).toProperty("orderDate")
                .map(originId).toProperty("originId")
                .map(isRefund).toProperty("isRefund")
                .map(orderStatus).toProperty("orderStatus")
                .map(vipMobile).toProperty("vipMobile")
                .map(shopId).toProperty("shopId")
                .map(staffId).toProperty("staffId")
                .map(staffName).toProperty("staffName")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.441+08:00", comments="Source Table: erp_order_detail")
    default int insertSelective(ErpOrderDetail record) {
        return insert(SqlBuilder.insert(record)
                .into(erpOrderDetail)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(orderNo).toPropertyWhenPresent("orderNo", record::getOrderNo)
                .map(productName).toPropertyWhenPresent("productName", record::getProductName)
                .map(productSn).toPropertyWhenPresent("productSn", record::getProductSn)
                .map(productNo).toPropertyWhenPresent("productNo", record::getProductNo)
                .map(size).toPropertyWhenPresent("size", record::getSize)
                .map(color).toPropertyWhenPresent("color", record::getColor)
                .map(num).toPropertyWhenPresent("num", record::getNum)
                .map(realPrice).toPropertyWhenPresent("realPrice", record::getRealPrice)
                .map(tagPrice).toPropertyWhenPresent("tagPrice", record::getTagPrice)
                .map(orderScore).toPropertyWhenPresent("orderScore", record::getOrderScore)
                .map(orderDate).toPropertyWhenPresent("orderDate", record::getOrderDate)
                .map(originId).toPropertyWhenPresent("originId", record::getOriginId)
                .map(isRefund).toPropertyWhenPresent("isRefund", record::getIsRefund)
                .map(orderStatus).toPropertyWhenPresent("orderStatus", record::getOrderStatus)
                .map(vipMobile).toPropertyWhenPresent("vipMobile", record::getVipMobile)
                .map(shopId).toPropertyWhenPresent("shopId", record::getShopId)
                .map(staffId).toPropertyWhenPresent("staffId", record::getStaffId)
                .map(staffName).toPropertyWhenPresent("staffName", record::getStaffName)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.441+08:00", comments="Source Table: erp_order_detail")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpOrderDetail>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, orderNo, productName, productSn, productNo, size, color, num, realPrice, tagPrice, orderScore, orderDate, originId, isRefund, orderStatus, vipMobile, shopId, staffId, staffName, gmtCreate, gmtModified)
                .from(erpOrderDetail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.441+08:00", comments="Source Table: erp_order_detail")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpOrderDetail>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, orderNo, productName, productSn, productNo, size, color, num, realPrice, tagPrice, orderScore, orderDate, originId, isRefund, orderStatus, vipMobile, shopId, staffId, staffName, gmtCreate, gmtModified)
                .from(erpOrderDetail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.442+08:00", comments="Source Table: erp_order_detail")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpOrderDetail>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, orderNo, productName, productSn, productNo, size, color, num, realPrice, tagPrice, orderScore, orderDate, originId, isRefund, orderStatus, vipMobile, shopId, staffId, staffName, gmtCreate, gmtModified)
                .from(erpOrderDetail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.442+08:00", comments="Source Table: erp_order_detail")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpOrderDetail>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, orderNo, productName, productSn, productNo, size, color, num, realPrice, tagPrice, orderScore, orderDate, originId, isRefund, orderStatus, vipMobile, shopId, staffId, staffName, gmtCreate, gmtModified)
                .from(erpOrderDetail);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.443+08:00", comments="Source Table: erp_order_detail")
    default ErpOrderDetail selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, orderNo, productName, productSn, productNo, size, color, num, realPrice, tagPrice, orderScore, orderDate, originId, isRefund, orderStatus, vipMobile, shopId, staffId, staffName, gmtCreate, gmtModified)
                .from(erpOrderDetail)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.443+08:00", comments="Source Table: erp_order_detail")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpOrderDetail record) {
        return UpdateDSL.updateWithMapper(this::update, erpOrderDetail)
                .set(id).equalTo(record::getId)
                .set(orderNo).equalTo(record::getOrderNo)
                .set(productName).equalTo(record::getProductName)
                .set(productSn).equalTo(record::getProductSn)
                .set(productNo).equalTo(record::getProductNo)
                .set(size).equalTo(record::getSize)
                .set(color).equalTo(record::getColor)
                .set(num).equalTo(record::getNum)
                .set(realPrice).equalTo(record::getRealPrice)
                .set(tagPrice).equalTo(record::getTagPrice)
                .set(orderScore).equalTo(record::getOrderScore)
                .set(orderDate).equalTo(record::getOrderDate)
                .set(originId).equalTo(record::getOriginId)
                .set(isRefund).equalTo(record::getIsRefund)
                .set(orderStatus).equalTo(record::getOrderStatus)
                .set(vipMobile).equalTo(record::getVipMobile)
                .set(shopId).equalTo(record::getShopId)
                .set(staffId).equalTo(record::getStaffId)
                .set(staffName).equalTo(record::getStaffName)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.444+08:00", comments="Source Table: erp_order_detail")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpOrderDetail record) {
        return UpdateDSL.updateWithMapper(this::update, erpOrderDetail)
                .set(id).equalToWhenPresent(record::getId)
                .set(orderNo).equalToWhenPresent(record::getOrderNo)
                .set(productName).equalToWhenPresent(record::getProductName)
                .set(productSn).equalToWhenPresent(record::getProductSn)
                .set(productNo).equalToWhenPresent(record::getProductNo)
                .set(size).equalToWhenPresent(record::getSize)
                .set(color).equalToWhenPresent(record::getColor)
                .set(num).equalToWhenPresent(record::getNum)
                .set(realPrice).equalToWhenPresent(record::getRealPrice)
                .set(tagPrice).equalToWhenPresent(record::getTagPrice)
                .set(orderScore).equalToWhenPresent(record::getOrderScore)
                .set(orderDate).equalToWhenPresent(record::getOrderDate)
                .set(originId).equalToWhenPresent(record::getOriginId)
                .set(isRefund).equalToWhenPresent(record::getIsRefund)
                .set(orderStatus).equalToWhenPresent(record::getOrderStatus)
                .set(vipMobile).equalToWhenPresent(record::getVipMobile)
                .set(shopId).equalToWhenPresent(record::getShopId)
                .set(staffId).equalToWhenPresent(record::getStaffId)
                .set(staffName).equalToWhenPresent(record::getStaffName)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.444+08:00", comments="Source Table: erp_order_detail")
    default int updateByPrimaryKey(ErpOrderDetail record) {
        return UpdateDSL.updateWithMapper(this::update, erpOrderDetail)
                .set(orderNo).equalTo(record::getOrderNo)
                .set(productName).equalTo(record::getProductName)
                .set(productSn).equalTo(record::getProductSn)
                .set(productNo).equalTo(record::getProductNo)
                .set(size).equalTo(record::getSize)
                .set(color).equalTo(record::getColor)
                .set(num).equalTo(record::getNum)
                .set(realPrice).equalTo(record::getRealPrice)
                .set(tagPrice).equalTo(record::getTagPrice)
                .set(orderScore).equalTo(record::getOrderScore)
                .set(orderDate).equalTo(record::getOrderDate)
                .set(originId).equalTo(record::getOriginId)
                .set(isRefund).equalTo(record::getIsRefund)
                .set(orderStatus).equalTo(record::getOrderStatus)
                .set(vipMobile).equalTo(record::getVipMobile)
                .set(shopId).equalTo(record::getShopId)
                .set(staffId).equalTo(record::getStaffId)
                .set(staffName).equalTo(record::getStaffName)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.445+08:00", comments="Source Table: erp_order_detail")
    default int updateByPrimaryKeySelective(ErpOrderDetail record) {
        return UpdateDSL.updateWithMapper(this::update, erpOrderDetail)
                .set(orderNo).equalToWhenPresent(record::getOrderNo)
                .set(productName).equalToWhenPresent(record::getProductName)
                .set(productSn).equalToWhenPresent(record::getProductSn)
                .set(productNo).equalToWhenPresent(record::getProductNo)
                .set(size).equalToWhenPresent(record::getSize)
                .set(color).equalToWhenPresent(record::getColor)
                .set(num).equalToWhenPresent(record::getNum)
                .set(realPrice).equalToWhenPresent(record::getRealPrice)
                .set(tagPrice).equalToWhenPresent(record::getTagPrice)
                .set(orderScore).equalToWhenPresent(record::getOrderScore)
                .set(orderDate).equalToWhenPresent(record::getOrderDate)
                .set(originId).equalToWhenPresent(record::getOriginId)
                .set(isRefund).equalToWhenPresent(record::getIsRefund)
                .set(orderStatus).equalToWhenPresent(record::getOrderStatus)
                .set(vipMobile).equalToWhenPresent(record::getVipMobile)
                .set(shopId).equalToWhenPresent(record::getShopId)
                .set(staffId).equalToWhenPresent(record::getStaffId)
                .set(staffName).equalToWhenPresent(record::getStaffName)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}