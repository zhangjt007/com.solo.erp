package com.solo.erp.dao.mapper;

import com.solo.erp.dao.model.ErpProductInfo;
import com.solo.erp.dao.model.ErpProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ErpProductInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_product_info
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    long countByExample(ErpProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_product_info
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int deleteByExample(ErpProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_product_info
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_product_info
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int insert(ErpProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_product_info
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int insertSelective(ErpProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_product_info
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    List<ErpProductInfo> selectByExampleWithRowbounds(ErpProductInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_product_info
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    List<ErpProductInfo> selectByExample(ErpProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_product_info
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    ErpProductInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_product_info
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") ErpProductInfo record, @Param("example") ErpProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_product_info
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int updateByExample(@Param("record") ErpProductInfo record, @Param("example") ErpProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_product_info
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int updateByPrimaryKeySelective(ErpProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_product_info
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int updateByPrimaryKey(ErpProductInfo record);
}