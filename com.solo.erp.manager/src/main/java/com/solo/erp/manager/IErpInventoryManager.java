package com.solo.erp.manager;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.InventoryQueryRequest;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.model.ErpInventoryInfo;

public interface IErpInventoryManager {
    /**
     * 商品入库
     * @param productSn
     * @param num
     * @param shopId
     * @return
     * @throws ErpException
     */
    int stockIn(String productSn, int num, int shopId) throws ErpException;

    /**
     * 商品出库
     * @param productSn
     * @param num
     * @param shopId
     * @return
     * @throws ErpException
     */
    int stockOut(String productSn, int num, int shopId) throws ErpException;

    /**
     * 商品库存信息新增
     *
     * @param info
     * @return
     * @throws ErpException
     */
    int create(ErpInventoryInfo info) throws ErpException;

    /**
     * 更新商品库存信息
     *
     * @param info
     * @return
     * @throws ErpException
     */
    int update(ErpInventoryInfo info) throws ErpException;

    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    ErpInventoryInfo selectById(int id);

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    PageInfo<ErpInventoryInfo> selectPage(InventoryQueryRequest req) throws ErpException;
}
