package com.solo.erp.manager.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.InventoryQueryRequest;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.DateUtils;
import com.solo.erp.dao.mapper.ErpInventoryInfoMapper;
import com.solo.erp.dao.mapper.ErpProductInfoMapper;
import com.solo.erp.dao.model.ErpInventoryInfo;
import com.solo.erp.dao.model.ErpInventoryInfoExample;
import com.solo.erp.dao.model.ErpProductInfo;
import com.solo.erp.dao.model.ErpProductInfoExample;
import com.solo.erp.manager.IErpInventoryManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service("erpInventoryManager")
public class ErpInventoryManagerImpl implements IErpInventoryManager {

    private static final Logger log = LoggerFactory.getLogger(ErpInventoryManagerImpl.class);

    @Autowired
    ErpInventoryInfoMapper erpInventoryInfoMapper;
    @Autowired
    ErpProductInfoMapper productInfoMapper;

    /**
     * 商品入库
     *
     * @param productSn
     * @param num
     * @param shopId
     * @return
     * @throws ErpException
     */
    @Override
    public int stockIn(String productSn, int num, int shopId) throws ErpException {
        log.info("商品入库-条码编号{}", productSn);
        ErpProductInfoExample productInfoExample = new ErpProductInfoExample();
        productInfoExample.createCriteria().andProductSnEqualTo(productSn);
        List<ErpProductInfo> productInfos = productInfoMapper.selectByExample(productInfoExample);
        if (productInfos == null || productInfos.isEmpty()) {
            log.error("条码" + productSn + "商品信息不存在，不允许入库");
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "条码" + productSn + "商品信息不存在，不允许入库");
        }
        if (productInfos.size() > 1) {
            log.error("条码" + productSn + "商品信息存在多条记录，不允许入库");
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "条码" + productSn + "商品信息存在多条记录，不允许入库");
        }
        ErpProductInfo productInfo = productInfos.get(0);
        if (num <= 1) {
            num = 1;
        }
        int result = 0;
        ErpInventoryInfoExample inventoryInfoExample = new ErpInventoryInfoExample();
        inventoryInfoExample.createCriteria().andShopIdEqualTo(shopId).andProductSnEqualTo(productSn);
        List<ErpInventoryInfo> erpInventoryInfos = erpInventoryInfoMapper.selectByExample(inventoryInfoExample);
        if (erpInventoryInfos == null || erpInventoryInfos.isEmpty()) {
            ErpInventoryInfo inventoryInfo = new ErpInventoryInfo();
            inventoryInfo.setShopId(shopId);
            inventoryInfo.setProductSn(productSn);
            inventoryInfo.setProductId(productInfo.getId());
            inventoryInfo.setGmtModified(new Date());
            inventoryInfo.setGmtCreate(new Date());
            inventoryInfo.setNum(num);
            erpInventoryInfoMapper.insert(inventoryInfo);
            log.info("商品入库-门店{}新增条码{}商品库存信息", shopId, productSn);
        } else {
            ErpInventoryInfo info = erpInventoryInfos.get(0);
            info.setNum(info.getNum() + num);
            result = erpInventoryInfoMapper.updateByPrimaryKeySelective(info);
        }
        return result;
    }

    /**
     * 商品出库
     *
     * @param productSn
     * @param num
     * @param shopId
     * @return
     * @throws ErpException
     */
    @Override
    public int stockOut(String productSn, int num, int shopId) throws ErpException {
        log.info("商品出库-条码编号{}", productSn);
        ErpInventoryInfoExample inventoryInfoExample = new ErpInventoryInfoExample();
        inventoryInfoExample.createCriteria().andProductSnEqualTo(productSn);
        List<ErpInventoryInfo> inventoryInfos = erpInventoryInfoMapper.selectByExample(inventoryInfoExample);
        if (inventoryInfos == null || inventoryInfos.isEmpty()) {
            log.error("条码" + productSn + "库存信息不存在，无法出库");
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "条码" + productSn + "库存信息不存在，无法出库");
        }
        if (inventoryInfos.size() > 1) {
            log.error("条码{}库存信息存在{}条记录，无法出库", productSn, inventoryInfos.size());
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "条码" + productSn + "库存信息存在多条记录，无法出库");
        }
        ErpInventoryInfo info = inventoryInfos.get(0);
        if (info.getNum() < num) {
            log.error("条码{}商品库存为{}，无法出库", productSn, info.getNum());
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "条码" + productSn + "商品库存为" + info.getNum() + "，无法出库");
        }
        if (num <= 1) {
            num = 1;
        }
        info.setNum(info.getNum() - num);
        int result = erpInventoryInfoMapper.updateByPrimaryKeySelective(info);
        return result;
    }

    /**
     * 商品库存信息新增
     *
     * @param info
     * @return
     * @throws ErpException
     */
    @Override
    public int create(ErpInventoryInfo info) throws ErpException {
        int result = erpInventoryInfoMapper.insert(info);
        return result;
    }

    /**
     * 更新商品库存信息
     *
     * @param info
     * @return
     * @throws ErpException
     */
    @Override
    public int update(ErpInventoryInfo info) throws ErpException {
        int result = erpInventoryInfoMapper.updateByPrimaryKeySelective(info);
        return result;
    }

    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    @Override
    public ErpInventoryInfo selectById(int id) {
        ErpInventoryInfo info = erpInventoryInfoMapper.selectByPrimaryKey(id);
        return info;
    }

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    @Override
    public PageInfo<ErpInventoryInfo> selectPage(InventoryQueryRequest req) throws ErpException {
        ErpInventoryInfoExample example = new ErpInventoryInfoExample();
        ErpInventoryInfoExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(req.getProductSn())) {
            criteria.andProductSnEqualTo(req.getProductSn());
        }
        if (!StringUtils.isEmpty(req.getNum())) {
            criteria.andNumEqualTo(req.getNum());
        }
        if (!StringUtils.isEmpty(req.getGmtCreate())) {
            try {
                criteria.andGmtCreateBetween(DateUtils.parseToStart(req.getGmtCreate()), DateUtils.parseToEnd(req.getGmtCreate()));
            } catch (ParseException e) {
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "创建日期格式解析错误");
            }
        }
        PageInfo<ErpInventoryInfo> pageInfo = PageHelper.startPage(req.getPageNum(), req.getPageSize()).doSelectPageInfo(() -> erpInventoryInfoMapper.selectByExample(example));
        return pageInfo;
    }
}
