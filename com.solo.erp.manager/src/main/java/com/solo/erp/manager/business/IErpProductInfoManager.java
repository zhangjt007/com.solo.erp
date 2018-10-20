package com.solo.erp.manager.business;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.ProductQueryRequest;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.model.ErpProductInfo;

import java.util.List;

public interface IErpProductInfoManager  {
    /**
     * 商品信息新增
     *
     * @param info
     * @return
     * @throws ErpException
     */
    int create(ErpProductInfo info) throws ErpException;

    /**
     * 批量插入商品信息
     * @param list
     * @throws ErpException
     */
    void batchInsert(List<ErpProductInfo> list) throws ErpException;

    /**
     * 更新商品信息
     *
     * @param info
     * @return
     * @throws ErpException
     */
    int update(ErpProductInfo info) throws ErpException;

    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    ErpProductInfo selectById(int id);

    /**
     * 根据商品编号查询
     * @param productNo
     * @return
     */
    ErpProductInfo selectByProductNo(String productNo) throws ErpException;


    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    PageInfo<ErpProductInfo> selectPage(ProductQueryRequest req) throws ErpException;
}
