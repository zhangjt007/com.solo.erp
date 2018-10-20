package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpStaffInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpStaffInfo;
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
public interface ErpStaffInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.543+08:00", comments="Source Table: erp_staff_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.544+08:00", comments="Source Table: erp_staff_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.544+08:00", comments="Source Table: erp_staff_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ErpStaffInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.545+08:00", comments="Source Table: erp_staff_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpStaffInfoResult")
    ErpStaffInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.546+08:00", comments="Source Table: erp_staff_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpStaffInfoResult")
    List<ErpStaffInfo> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.546+08:00", comments="Source Table: erp_staff_info")
    default Function<SelectStatementProvider, List<ErpStaffInfo>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.546+08:00", comments="Source Table: erp_staff_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpStaffInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_pwd", property="loginPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="staff_name", property="staffName", jdbcType=JdbcType.VARCHAR),
        @Result(column="staff_no", property="staffNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="staff_photo", property="staffPhoto", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_enable", property="isEnable", jdbcType=JdbcType.BIT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sex", property="sex", jdbcType=JdbcType.CHAR),
        @Result(column="brithday", property="brithday", jdbcType=JdbcType.DATE),
        @Result(column="shop_name", property="shopName", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_time", property="lastTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_ip", property="lastIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="cert_no", property="certNo", jdbcType=JdbcType.VARCHAR)
    })
    List<ErpStaffInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.547+08:00", comments="Source Table: erp_staff_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.547+08:00", comments="Source Table: erp_staff_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpStaffInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.548+08:00", comments="Source Table: erp_staff_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpStaffInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.548+08:00", comments="Source Table: erp_staff_info")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpStaffInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.548+08:00", comments="Source Table: erp_staff_info")
    default int insert(ErpStaffInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpStaffInfo)
                .map(loginName).toProperty("loginName")
                .map(loginPwd).toProperty("loginPwd")
                .map(staffName).toProperty("staffName")
                .map(staffNo).toProperty("staffNo")
                .map(staffPhoto).toProperty("staffPhoto")
                .map(mobile).toProperty("mobile")
                .map(address).toProperty("address")
                .map(shopId).toProperty("shopId")
                .map(isEnable).toProperty("isEnable")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .map(sex).toProperty("sex")
                .map(brithday).toProperty("brithday")
                .map(shopName).toProperty("shopName")
                .map(lastTime).toProperty("lastTime")
                .map(lastIp).toProperty("lastIp")
                .map(certNo).toProperty("certNo")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.549+08:00", comments="Source Table: erp_staff_info")
    default int insertSelective(ErpStaffInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpStaffInfo)
                .map(loginName).toPropertyWhenPresent("loginName", record::getLoginName)
                .map(loginPwd).toPropertyWhenPresent("loginPwd", record::getLoginPwd)
                .map(staffName).toPropertyWhenPresent("staffName", record::getStaffName)
                .map(staffNo).toPropertyWhenPresent("staffNo", record::getStaffNo)
                .map(staffPhoto).toPropertyWhenPresent("staffPhoto", record::getStaffPhoto)
                .map(mobile).toPropertyWhenPresent("mobile", record::getMobile)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .map(shopId).toPropertyWhenPresent("shopId", record::getShopId)
                .map(isEnable).toPropertyWhenPresent("isEnable", record::getIsEnable)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .map(sex).toPropertyWhenPresent("sex", record::getSex)
                .map(brithday).toPropertyWhenPresent("brithday", record::getBrithday)
                .map(shopName).toPropertyWhenPresent("shopName", record::getShopName)
                .map(lastTime).toPropertyWhenPresent("lastTime", record::getLastTime)
                .map(lastIp).toPropertyWhenPresent("lastIp", record::getLastIp)
                .map(certNo).toPropertyWhenPresent("certNo", record::getCertNo)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.55+08:00", comments="Source Table: erp_staff_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpStaffInfo>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, loginName, loginPwd, staffName, staffNo, staffPhoto, mobile, address, shopId, isEnable, gmtCreate, gmtModified, sex, brithday, shopName, lastTime, lastIp, certNo)
                .from(erpStaffInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.55+08:00", comments="Source Table: erp_staff_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpStaffInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, loginName, loginPwd, staffName, staffNo, staffPhoto, mobile, address, shopId, isEnable, gmtCreate, gmtModified, sex, brithday, shopName, lastTime, lastIp, certNo)
                .from(erpStaffInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.551+08:00", comments="Source Table: erp_staff_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpStaffInfo>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, loginName, loginPwd, staffName, staffNo, staffPhoto, mobile, address, shopId, isEnable, gmtCreate, gmtModified, sex, brithday, shopName, lastTime, lastIp, certNo)
                .from(erpStaffInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.551+08:00", comments="Source Table: erp_staff_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpStaffInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, loginName, loginPwd, staffName, staffNo, staffPhoto, mobile, address, shopId, isEnable, gmtCreate, gmtModified, sex, brithday, shopName, lastTime, lastIp, certNo)
                .from(erpStaffInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.551+08:00", comments="Source Table: erp_staff_info")
    default ErpStaffInfo selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, loginName, loginPwd, staffName, staffNo, staffPhoto, mobile, address, shopId, isEnable, gmtCreate, gmtModified, sex, brithday, shopName, lastTime, lastIp, certNo)
                .from(erpStaffInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.552+08:00", comments="Source Table: erp_staff_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpStaffInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpStaffInfo)
                .set(loginName).equalTo(record::getLoginName)
                .set(loginPwd).equalTo(record::getLoginPwd)
                .set(staffName).equalTo(record::getStaffName)
                .set(staffNo).equalTo(record::getStaffNo)
                .set(staffPhoto).equalTo(record::getStaffPhoto)
                .set(mobile).equalTo(record::getMobile)
                .set(address).equalTo(record::getAddress)
                .set(shopId).equalTo(record::getShopId)
                .set(isEnable).equalTo(record::getIsEnable)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(sex).equalTo(record::getSex)
                .set(brithday).equalTo(record::getBrithday)
                .set(shopName).equalTo(record::getShopName)
                .set(lastTime).equalTo(record::getLastTime)
                .set(lastIp).equalTo(record::getLastIp)
                .set(certNo).equalTo(record::getCertNo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.552+08:00", comments="Source Table: erp_staff_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpStaffInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpStaffInfo)
                .set(loginName).equalToWhenPresent(record::getLoginName)
                .set(loginPwd).equalToWhenPresent(record::getLoginPwd)
                .set(staffName).equalToWhenPresent(record::getStaffName)
                .set(staffNo).equalToWhenPresent(record::getStaffNo)
                .set(staffPhoto).equalToWhenPresent(record::getStaffPhoto)
                .set(mobile).equalToWhenPresent(record::getMobile)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(shopId).equalToWhenPresent(record::getShopId)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(brithday).equalToWhenPresent(record::getBrithday)
                .set(shopName).equalToWhenPresent(record::getShopName)
                .set(lastTime).equalToWhenPresent(record::getLastTime)
                .set(lastIp).equalToWhenPresent(record::getLastIp)
                .set(certNo).equalToWhenPresent(record::getCertNo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.553+08:00", comments="Source Table: erp_staff_info")
    default int updateByPrimaryKey(ErpStaffInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpStaffInfo)
                .set(loginName).equalTo(record::getLoginName)
                .set(loginPwd).equalTo(record::getLoginPwd)
                .set(staffName).equalTo(record::getStaffName)
                .set(staffNo).equalTo(record::getStaffNo)
                .set(staffPhoto).equalTo(record::getStaffPhoto)
                .set(mobile).equalTo(record::getMobile)
                .set(address).equalTo(record::getAddress)
                .set(shopId).equalTo(record::getShopId)
                .set(isEnable).equalTo(record::getIsEnable)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(sex).equalTo(record::getSex)
                .set(brithday).equalTo(record::getBrithday)
                .set(shopName).equalTo(record::getShopName)
                .set(lastTime).equalTo(record::getLastTime)
                .set(lastIp).equalTo(record::getLastIp)
                .set(certNo).equalTo(record::getCertNo)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T11:12:55.553+08:00", comments="Source Table: erp_staff_info")
    default int updateByPrimaryKeySelective(ErpStaffInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpStaffInfo)
                .set(loginName).equalToWhenPresent(record::getLoginName)
                .set(loginPwd).equalToWhenPresent(record::getLoginPwd)
                .set(staffName).equalToWhenPresent(record::getStaffName)
                .set(staffNo).equalToWhenPresent(record::getStaffNo)
                .set(staffPhoto).equalToWhenPresent(record::getStaffPhoto)
                .set(mobile).equalToWhenPresent(record::getMobile)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(shopId).equalToWhenPresent(record::getShopId)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(brithday).equalToWhenPresent(record::getBrithday)
                .set(shopName).equalToWhenPresent(record::getShopName)
                .set(lastTime).equalToWhenPresent(record::getLastTime)
                .set(lastIp).equalToWhenPresent(record::getLastIp)
                .set(certNo).equalToWhenPresent(record::getCertNo)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}