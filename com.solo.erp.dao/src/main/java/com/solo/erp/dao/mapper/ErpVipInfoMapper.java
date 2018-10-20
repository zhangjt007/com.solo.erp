package com.solo.erp.dao.mapper;

import static com.solo.erp.dao.mapper.ErpVipInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.solo.erp.dao.model.ErpVipInfo;
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
public interface ErpVipInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.042+08:00", comments="Source Table: erp_vip_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.043+08:00", comments="Source Table: erp_vip_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.044+08:00", comments="Source Table: erp_vip_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ErpVipInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.045+08:00", comments="Source Table: erp_vip_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpVipInfoResult")
    ErpVipInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.045+08:00", comments="Source Table: erp_vip_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ErpVipInfoResult")
    List<ErpVipInfo> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.046+08:00", comments="Source Table: erp_vip_info")
    default Function<SelectStatementProvider, List<ErpVipInfo>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.045+08:00", comments="Source Table: erp_vip_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ErpVipInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.CHAR),
        @Result(column="brithday", property="brithday", jdbcType=JdbcType.DATE),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.CHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType=JdbcType.DECIMAL),
        @Result(column="history_score", property="historyScore", jdbcType=JdbcType.DECIMAL),
        @Result(column="is_enable", property="isEnable", jdbcType=JdbcType.BIT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="vip_referee_mobile", property="vipRefereeMobile", jdbcType=JdbcType.CHAR),
        @Result(column="staff_id", property="staffId", jdbcType=JdbcType.INTEGER),
        @Result(column="staff_name", property="staffName", jdbcType=JdbcType.VARCHAR),
        @Result(column="weixin", property="weixin", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.DATE)
    })
    List<ErpVipInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.046+08:00", comments="Source Table: erp_vip_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.047+08:00", comments="Source Table: erp_vip_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(erpVipInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.047+08:00", comments="Source Table: erp_vip_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpVipInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.048+08:00", comments="Source Table: erp_vip_info")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, erpVipInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.048+08:00", comments="Source Table: erp_vip_info")
    default int insert(ErpVipInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpVipInfo)
                .map(userName).toProperty("userName")
                .map(sex).toProperty("sex")
                .map(brithday).toProperty("brithday")
                .map(mobile).toProperty("mobile")
                .map(email).toProperty("email")
                .map(address).toProperty("address")
                .map(score).toProperty("score")
                .map(historyScore).toProperty("historyScore")
                .map(isEnable).toProperty("isEnable")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .map(remark).toProperty("remark")
                .map(vipRefereeMobile).toProperty("vipRefereeMobile")
                .map(staffId).toProperty("staffId")
                .map(staffName).toProperty("staffName")
                .map(weixin).toProperty("weixin")
                .map(qq).toProperty("qq")
                .map(createDate).toProperty("createDate")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.049+08:00", comments="Source Table: erp_vip_info")
    default int insertSelective(ErpVipInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(erpVipInfo)
                .map(userName).toPropertyWhenPresent("userName", record::getUserName)
                .map(sex).toPropertyWhenPresent("sex", record::getSex)
                .map(brithday).toPropertyWhenPresent("brithday", record::getBrithday)
                .map(mobile).toPropertyWhenPresent("mobile", record::getMobile)
                .map(email).toPropertyWhenPresent("email", record::getEmail)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .map(score).toPropertyWhenPresent("score", record::getScore)
                .map(historyScore).toPropertyWhenPresent("historyScore", record::getHistoryScore)
                .map(isEnable).toPropertyWhenPresent("isEnable", record::getIsEnable)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .map(remark).toPropertyWhenPresent("remark", record::getRemark)
                .map(vipRefereeMobile).toPropertyWhenPresent("vipRefereeMobile", record::getVipRefereeMobile)
                .map(staffId).toPropertyWhenPresent("staffId", record::getStaffId)
                .map(staffName).toPropertyWhenPresent("staffName", record::getStaffName)
                .map(weixin).toPropertyWhenPresent("weixin", record::getWeixin)
                .map(qq).toPropertyWhenPresent("qq", record::getQq)
                .map(createDate).toPropertyWhenPresent("createDate", record::getCreateDate)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.05+08:00", comments="Source Table: erp_vip_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpVipInfo>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, userName, sex, brithday, mobile, email, address, score, historyScore, isEnable, gmtCreate, gmtModified, remark, vipRefereeMobile, staffId, staffName, weixin, qq, createDate)
                .from(erpVipInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.05+08:00", comments="Source Table: erp_vip_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpVipInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userName, sex, brithday, mobile, email, address, score, historyScore, isEnable, gmtCreate, gmtModified, remark, vipRefereeMobile, staffId, staffName, weixin, qq, createDate)
                .from(erpVipInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.051+08:00", comments="Source Table: erp_vip_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpVipInfo>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, userName, sex, brithday, mobile, email, address, score, historyScore, isEnable, gmtCreate, gmtModified, remark, vipRefereeMobile, staffId, staffName, weixin, qq, createDate)
                .from(erpVipInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.051+08:00", comments="Source Table: erp_vip_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ErpVipInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userName, sex, brithday, mobile, email, address, score, historyScore, isEnable, gmtCreate, gmtModified, remark, vipRefereeMobile, staffId, staffName, weixin, qq, createDate)
                .from(erpVipInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.051+08:00", comments="Source Table: erp_vip_info")
    default ErpVipInfo selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, userName, sex, brithday, mobile, email, address, score, historyScore, isEnable, gmtCreate, gmtModified, remark, vipRefereeMobile, staffId, staffName, weixin, qq, createDate)
                .from(erpVipInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.052+08:00", comments="Source Table: erp_vip_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ErpVipInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpVipInfo)
                .set(userName).equalTo(record::getUserName)
                .set(sex).equalTo(record::getSex)
                .set(brithday).equalTo(record::getBrithday)
                .set(mobile).equalTo(record::getMobile)
                .set(email).equalTo(record::getEmail)
                .set(address).equalTo(record::getAddress)
                .set(score).equalTo(record::getScore)
                .set(historyScore).equalTo(record::getHistoryScore)
                .set(isEnable).equalTo(record::getIsEnable)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(remark).equalTo(record::getRemark)
                .set(vipRefereeMobile).equalTo(record::getVipRefereeMobile)
                .set(staffId).equalTo(record::getStaffId)
                .set(staffName).equalTo(record::getStaffName)
                .set(weixin).equalTo(record::getWeixin)
                .set(qq).equalTo(record::getQq)
                .set(createDate).equalTo(record::getCreateDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.052+08:00", comments="Source Table: erp_vip_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ErpVipInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpVipInfo)
                .set(userName).equalToWhenPresent(record::getUserName)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(brithday).equalToWhenPresent(record::getBrithday)
                .set(mobile).equalToWhenPresent(record::getMobile)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(score).equalToWhenPresent(record::getScore)
                .set(historyScore).equalToWhenPresent(record::getHistoryScore)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(vipRefereeMobile).equalToWhenPresent(record::getVipRefereeMobile)
                .set(staffId).equalToWhenPresent(record::getStaffId)
                .set(staffName).equalToWhenPresent(record::getStaffName)
                .set(weixin).equalToWhenPresent(record::getWeixin)
                .set(qq).equalToWhenPresent(record::getQq)
                .set(createDate).equalToWhenPresent(record::getCreateDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.053+08:00", comments="Source Table: erp_vip_info")
    default int updateByPrimaryKey(ErpVipInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpVipInfo)
                .set(userName).equalTo(record::getUserName)
                .set(sex).equalTo(record::getSex)
                .set(brithday).equalTo(record::getBrithday)
                .set(mobile).equalTo(record::getMobile)
                .set(email).equalTo(record::getEmail)
                .set(address).equalTo(record::getAddress)
                .set(score).equalTo(record::getScore)
                .set(historyScore).equalTo(record::getHistoryScore)
                .set(isEnable).equalTo(record::getIsEnable)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(remark).equalTo(record::getRemark)
                .set(vipRefereeMobile).equalTo(record::getVipRefereeMobile)
                .set(staffId).equalTo(record::getStaffId)
                .set(staffName).equalTo(record::getStaffName)
                .set(weixin).equalTo(record::getWeixin)
                .set(qq).equalTo(record::getQq)
                .set(createDate).equalTo(record::getCreateDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-08-12T10:46:32.053+08:00", comments="Source Table: erp_vip_info")
    default int updateByPrimaryKeySelective(ErpVipInfo record) {
        return UpdateDSL.updateWithMapper(this::update, erpVipInfo)
                .set(userName).equalToWhenPresent(record::getUserName)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(brithday).equalToWhenPresent(record::getBrithday)
                .set(mobile).equalToWhenPresent(record::getMobile)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(score).equalToWhenPresent(record::getScore)
                .set(historyScore).equalToWhenPresent(record::getHistoryScore)
                .set(isEnable).equalToWhenPresent(record::getIsEnable)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(vipRefereeMobile).equalToWhenPresent(record::getVipRefereeMobile)
                .set(staffId).equalToWhenPresent(record::getStaffId)
                .set(staffName).equalToWhenPresent(record::getStaffName)
                .set(weixin).equalToWhenPresent(record::getWeixin)
                .set(qq).equalToWhenPresent(record::getQq)
                .set(createDate).equalToWhenPresent(record::getCreateDate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}