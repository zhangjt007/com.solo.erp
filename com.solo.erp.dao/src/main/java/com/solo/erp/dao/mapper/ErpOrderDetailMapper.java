package com.solo.erp.dao.mapper;

import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.dao.model.ErpOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ErpOrderDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_order_detail
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    long countByExample(ErpOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_order_detail
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int deleteByExample(ErpOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_order_detail
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_order_detail
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int insert(ErpOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_order_detail
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int insertSelective(ErpOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_order_detail
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    List<ErpOrderDetail> selectByExampleWithRowbounds(ErpOrderDetailExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_order_detail
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    List<ErpOrderDetail> selectByExample(ErpOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_order_detail
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    ErpOrderDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_order_detail
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") ErpOrderDetail record, @Param("example") ErpOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_order_detail
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int updateByExample(@Param("record") ErpOrderDetail record, @Param("example") ErpOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_order_detail
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int updateByPrimaryKeySelective(ErpOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table erp_order_detail
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    int updateByPrimaryKey(ErpOrderDetail record);
}