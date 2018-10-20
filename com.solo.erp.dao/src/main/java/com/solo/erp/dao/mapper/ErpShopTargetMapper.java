package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpShopTargetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpShopTarget;
import java.time.LocalDate;
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
public interface ErpShopTargetMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.141+08:00", comments="Source Table: erp_shop_target")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ErpShopTarget> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpShopTargetResult")
    ErpShopTarget selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpShopTargetResult")
    List<ErpShopTarget> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    default Function<SelectStatementProvider, List<ErpShopTarget>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpShopTargetResult", value = {
        @Result(column="date", property="date", jdbcType=JdbcType.DATE, id=true),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="target_amout", property="targetAmout", jdbcType=JdbcType.DECIMAL)
    })
    List<ErpShopTarget> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpShopTarget);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpShopTarget);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    default int deleteByPrimaryKey(LocalDate date_, Integer shopId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpShopTarget)
                .where(date, isEqualTo(date_))
                .and(shopId, isEqualTo(shopId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    default int insert(ErpShopTarget record) {
        return insert(SqlBuilder.insert(record)
                .into(erpShopTarget)
                .map(date).toProperty("date")
                .map(shopId).toProperty("shopId")
                .map(targetAmout).toProperty("targetAmout")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    default int insertSelective(ErpShopTarget record) {
        return insert(SqlBuilder.insert(record)
                .into(erpShopTarget)
                .map(date).toPropertyWhenPresent("date", record::getDate)
                .map(shopId).toPropertyWhenPresent("shopId", record::getShopId)
                .map(targetAmout).toPropertyWhenPresent("targetAmout", record::getTargetAmout)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpShopTarget>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), date, shopId, targetAmout)
                .from(erpShopTarget);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.142+08:00", comments="Source Table: erp_shop_target")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpShopTarget>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, date, shopId, targetAmout)
                .from(erpShopTarget);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.143+08:00", comments="Source Table: erp_shop_target")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpShopTarget>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), date, shopId, targetAmout)
                .from(erpShopTarget);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.143+08:00", comments="Source Table: erp_shop_target")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpShopTarget>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, date, shopId, targetAmout)
                .from(erpShopTarget);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.143+08:00", comments="Source Table: erp_shop_target")
    default ErpShopTarget selectByPrimaryKey(LocalDate date_, Integer shopId_) {
        return SelectDSL.selectWithMapper(this::selectOne, date, shopId, targetAmout)
                .from(erpShopTarget)
                .where(date, isEqualTo(date_))
                .and(shopId, isEqualTo(shopId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.143+08:00", comments="Source Table: erp_shop_target")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpShopTarget record) {
        return UpdateDSL.updateWithMapper(this::update, erpShopTarget)
                .set(date).equalTo(record::getDate)
                .set(shopId).equalTo(record::getShopId)
                .set(targetAmout).equalTo(record::getTargetAmout);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.143+08:00", comments="Source Table: erp_shop_target")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpShopTarget record) {
        return UpdateDSL.updateWithMapper(this::update, erpShopTarget)
                .set(date).equalToWhenPresent(record::getDate)
                .set(shopId).equalToWhenPresent(record::getShopId)
                .set(targetAmout).equalToWhenPresent(record::getTargetAmout);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.143+08:00", comments="Source Table: erp_shop_target")
    default int updateByPrimaryKey(ErpShopTarget record) {
        return UpdateDSL.updateWithMapper(this::update, erpShopTarget)
                .set(targetAmout).equalTo(record::getTargetAmout)
                .where(date, isEqualTo(record::getDate))
                .and(shopId, isEqualTo(record::getShopId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-08T11:45:11.143+08:00", comments="Source Table: erp_shop_target")
    default int updateByPrimaryKeySelective(ErpShopTarget record) {
        return UpdateDSL.updateWithMapper(this::update, erpShopTarget)
                .set(targetAmout).equalToWhenPresent(record::getTargetAmout)
                .where(date, isEqualTo(record::getDate))
                .and(shopId, isEqualTo(record::getShopId))
                .build()
                .execute();
    }
}