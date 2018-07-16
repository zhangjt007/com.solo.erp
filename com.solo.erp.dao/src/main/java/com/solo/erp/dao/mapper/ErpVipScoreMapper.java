package com.solo.erp.dao.mapper;

import com.solo.erp.dao.model.ErpVipScore;
import com.solo.erp.dao.model.ErpVipScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ErpVipScoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_vip_score
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    long countByExample(ErpVipScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_vip_score
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int deleteByExample(ErpVipScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_vip_score
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_vip_score
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int insert(ErpVipScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_vip_score
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int insertSelective(ErpVipScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_vip_score
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    List<ErpVipScore> selectByExampleWithRowbounds(ErpVipScoreExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_vip_score
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    List<ErpVipScore> selectByExample(ErpVipScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_vip_score
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    ErpVipScore selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_vip_score
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") ErpVipScore record, @Param("example") ErpVipScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_vip_score
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int updateByExample(@Param("record") ErpVipScore record, @Param("example") ErpVipScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_vip_score
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int updateByPrimaryKeySelective(ErpVipScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_vip_score
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int updateByPrimaryKey(ErpVipScore record);
}