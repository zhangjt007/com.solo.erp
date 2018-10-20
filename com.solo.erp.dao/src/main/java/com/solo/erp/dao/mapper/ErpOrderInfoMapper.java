package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpOrderInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpOrderInfo;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
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
public interface ErpOrderInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ErpOrderInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpOrderInfoResult")
    ErpOrderInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpOrderInfoResult")
    List<ErpOrderInfo> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    default Function<SelectStatementProvider, List<ErpOrderInfo>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpOrderInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="staff_id", property="staffId", jdbcType=JdbcType.INTEGER),
        @Result(column="staff_name", property="staffName", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_type", property="orderType", jdbcType=JdbcType.CHAR),
        @Result(column="order_status", property="orderStatus", jdbcType=JdbcType.CHAR),
        @Result(column="pay_type", property="payType", jdbcType=JdbcType.CHAR),
        @Result(column="pay_amount", property="payAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="pay_score", property="payScore", jdbcType=JdbcType.DECIMAL),
        @Result(column="total_amount", property="totalAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_score", property="orderScore", jdbcType=JdbcType.DECIMAL),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_invoice", property="isInvoice", jdbcType=JdbcType.BIT),
        @Result(column="invoice_remark", property="invoiceRemark", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_date", property="orderDate", jdbcType=JdbcType.DATE),
        @Result(column="total_num", property="totalNum", jdbcType=JdbcType.INTEGER),
        @Result(column="vip_mobile", property="vipMobile", jdbcType=JdbcType.CHAR)
    })
    List<ErpOrderInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpOrderInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpOrderInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpOrderInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    default int insert(ErpOrderInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpOrderInfo)
                .map(shopId).toProperty("shopId")
                .map(staffId).toProperty("staffId")
                .map(staffName).toProperty("staffName")
                .map(orderNo).toProperty("orderNo")
                .map(orderType).toProperty("orderType")
                .map(orderStatus).toProperty("orderStatus")
                .map(payType).toProperty("payType")
                .map(payAmount).toProperty("payAmount")
                .map(payScore).toProperty("payScore")
                .map(totalAmount).toProperty("totalAmount")
                .map(orderScore).toProperty("orderScore")
                .map(remark).toProperty("remark")
                .map(isInvoice).toProperty("isInvoice")
                .map(invoiceRemark).toProperty("invoiceRemark")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .map(orderDate).toProperty("orderDate")
                .map(totalNum).toProperty("totalNum")
                .map(vipMobile).toProperty("vipMobile")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.453+08:00", comments="Source Table: erp_order_info")
    default int insertSelective(ErpOrderInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpOrderInfo)
                .map(shopId).toPropertyWhenPresent("shopId", record::getShopId)
                .map(staffId).toPropertyWhenPresent("staffId", record::getStaffId)
                .map(staffName).toPropertyWhenPresent("staffName", record::getStaffName)
                .map(orderNo).toPropertyWhenPresent("orderNo", record::getOrderNo)
                .map(orderType).toPropertyWhenPresent("orderType", record::getOrderType)
                .map(orderStatus).toPropertyWhenPresent("orderStatus", record::getOrderStatus)
                .map(payType).toPropertyWhenPresent("payType", record::getPayType)
                .map(payAmount).toPropertyWhenPresent("payAmount", record::getPayAmount)
                .map(payScore).toPropertyWhenPresent("payScore", record::getPayScore)
                .map(totalAmount).toPropertyWhenPresent("totalAmount", record::getTotalAmount)
                .map(orderScore).toPropertyWhenPresent("orderScore", record::getOrderScore)
                .map(remark).toPropertyWhenPresent("remark", record::getRemark)
                .map(isInvoice).toPropertyWhenPresent("isInvoice", record::getIsInvoice)
                .map(invoiceRemark).toPropertyWhenPresent("invoiceRemark", record::getInvoiceRemark)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .map(orderDate).toPropertyWhenPresent("orderDate", record::getOrderDate)
                .map(totalNum).toPropertyWhenPresent("totalNum", record::getTotalNum)
                .map(vipMobile).toPropertyWhenPresent("vipMobile", record::getVipMobile)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.454+08:00", comments="Source Table: erp_order_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpOrderInfo>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, shopId, staffId, staffName, orderNo, orderType, orderStatus, payType, payAmount, payScore, totalAmount, orderScore, remark, isInvoice, invoiceRemark, gmtCreate, gmtModified, orderDate, totalNum, vipMobile)
                .from(erpOrderInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.454+08:00", comments="Source Table: erp_order_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpOrderInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, shopId, staffId, staffName, orderNo, orderType, orderStatus, payType, payAmount, payScore, totalAmount, orderScore, remark, isInvoice, invoiceRemark, gmtCreate, gmtModified, orderDate, totalNum, vipMobile)
                .from(erpOrderInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.454+08:00", comments="Source Table: erp_order_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpOrderInfo>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, shopId, staffId, staffName, orderNo, orderType, orderStatus, payType, payAmount, payScore, totalAmount, orderScore, remark, isInvoice, invoiceRemark, gmtCreate, gmtModified, orderDate, totalNum, vipMobile)
                .from(erpOrderInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.454+08:00", comments="Source Table: erp_order_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpOrderInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, shopId, staffId, staffName, orderNo, orderType, orderStatus, payType, payAmount, payScore, totalAmount, orderScore, remark, isInvoice, invoiceRemark, gmtCreate, gmtModified, orderDate, totalNum, vipMobile)
                .from(erpOrderInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.454+08:00", comments="Source Table: erp_order_info")
    default ErpOrderInfo selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, shopId, staffId, staffName, orderNo, orderType, orderStatus, payType, payAmount, payScore, totalAmount, orderScore, remark, isInvoice, invoiceRemark, gmtCreate, gmtModified, orderDate, totalNum, vipMobile)
                .from(erpOrderInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.454+08:00", comments="Source Table: erp_order_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpOrderInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpOrderInfo)
                .set(shopId).equalTo(record::getShopId)
                .set(staffId).equalTo(record::getStaffId)
                .set(staffName).equalTo(record::getStaffName)
                .set(orderNo).equalTo(record::getOrderNo)
                .set(orderType).equalTo(record::getOrderType)
                .set(orderStatus).equalTo(record::getOrderStatus)
                .set(payType).equalTo(record::getPayType)
                .set(payAmount).equalTo(record::getPayAmount)
                .set(payScore).equalTo(record::getPayScore)
                .set(totalAmount).equalTo(record::getTotalAmount)
                .set(orderScore).equalTo(record::getOrderScore)
                .set(remark).equalTo(record::getRemark)
                .set(isInvoice).equalTo(record::getIsInvoice)
                .set(invoiceRemark).equalTo(record::getInvoiceRemark)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(orderDate).equalTo(record::getOrderDate)
                .set(totalNum).equalTo(record::getTotalNum)
                .set(vipMobile).equalTo(record::getVipMobile);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.454+08:00", comments="Source Table: erp_order_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpOrderInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpOrderInfo)
                .set(shopId).equalToWhenPresent(record::getShopId)
                .set(staffId).equalToWhenPresent(record::getStaffId)
                .set(staffName).equalToWhenPresent(record::getStaffName)
                .set(orderNo).equalToWhenPresent(record::getOrderNo)
                .set(orderType).equalToWhenPresent(record::getOrderType)
                .set(orderStatus).equalToWhenPresent(record::getOrderStatus)
                .set(payType).equalToWhenPresent(record::getPayType)
                .set(payAmount).equalToWhenPresent(record::getPayAmount)
                .set(payScore).equalToWhenPresent(record::getPayScore)
                .set(totalAmount).equalToWhenPresent(record::getTotalAmount)
                .set(orderScore).equalToWhenPresent(record::getOrderScore)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(isInvoice).equalToWhenPresent(record::getIsInvoice)
                .set(invoiceRemark).equalToWhenPresent(record::getInvoiceRemark)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(orderDate).equalToWhenPresent(record::getOrderDate)
                .set(totalNum).equalToWhenPresent(record::getTotalNum)
                .set(vipMobile).equalToWhenPresent(record::getVipMobile);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.454+08:00", comments="Source Table: erp_order_info")
    default int updateByPrimaryKey(ErpOrderInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpOrderInfo)
                .set(shopId).equalTo(record::getShopId)
                .set(staffId).equalTo(record::getStaffId)
                .set(staffName).equalTo(record::getStaffName)
                .set(orderNo).equalTo(record::getOrderNo)
                .set(orderType).equalTo(record::getOrderType)
                .set(orderStatus).equalTo(record::getOrderStatus)
                .set(payType).equalTo(record::getPayType)
                .set(payAmount).equalTo(record::getPayAmount)
                .set(payScore).equalTo(record::getPayScore)
                .set(totalAmount).equalTo(record::getTotalAmount)
                .set(orderScore).equalTo(record::getOrderScore)
                .set(remark).equalTo(record::getRemark)
                .set(isInvoice).equalTo(record::getIsInvoice)
                .set(invoiceRemark).equalTo(record::getInvoiceRemark)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(orderDate).equalTo(record::getOrderDate)
                .set(totalNum).equalTo(record::getTotalNum)
                .set(vipMobile).equalTo(record::getVipMobile)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-20T16:00:12.454+08:00", comments="Source Table: erp_order_info")
    default int updateByPrimaryKeySelective(ErpOrderInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpOrderInfo)
                .set(shopId).equalToWhenPresent(record::getShopId)
                .set(staffId).equalToWhenPresent(record::getStaffId)
                .set(staffName).equalToWhenPresent(record::getStaffName)
                .set(orderNo).equalToWhenPresent(record::getOrderNo)
                .set(orderType).equalToWhenPresent(record::getOrderType)
                .set(orderStatus).equalToWhenPresent(record::getOrderStatus)
                .set(payType).equalToWhenPresent(record::getPayType)
                .set(payAmount).equalToWhenPresent(record::getPayAmount)
                .set(payScore).equalToWhenPresent(record::getPayScore)
                .set(totalAmount).equalToWhenPresent(record::getTotalAmount)
                .set(orderScore).equalToWhenPresent(record::getOrderScore)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(isInvoice).equalToWhenPresent(record::getIsInvoice)
                .set(invoiceRemark).equalToWhenPresent(record::getInvoiceRemark)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(orderDate).equalToWhenPresent(record::getOrderDate)
                .set(totalNum).equalToWhenPresent(record::getTotalNum)
                .set(vipMobile).equalToWhenPresent(record::getVipMobile)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}