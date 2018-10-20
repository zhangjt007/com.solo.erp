package com.solo.erp.manager.business.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.InventoryQueryRequest;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.ProductParseUtil;
import com.solo.erp.dao.mapper.DynamicSqlMapper;
import com.solo.erp.dao.mapper.ErpInventoryInfoMapper;
import com.solo.erp.dao.mapper.ErpProductInfoMapper;
import com.solo.erp.dao.model.ErpInventoryInfo;
import com.solo.erp.dao.model.ErpProductInfo;
import com.solo.erp.manager.business.IErpInventoryManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;

import static com.solo.erp.dao.mapper.ErpInventoryInfoDynamicSqlSupport.erpInventoryInfo;
import static com.solo.erp.dao.mapper.ErpProductInfoDynamicSqlSupport.erpProductInfo;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service("erpInventoryManager")
public class ErpInventoryManagerImpl implements IErpInventoryManager {

    private static final Logger log = LoggerFactory.getLogger(ErpInventoryManagerImpl.class);

    @Autowired
    ErpInventoryInfoMapper erpInventoryInfoMapper;
    @Autowired
    ErpProductInfoMapper productInfoMapper;
    @Autowired
    DynamicSqlMapper dynamicSqlMapper;

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
    public int stockIn(String productSn, int num, int shopId, String shopName) throws ErpException {
        log.info("商品入库-条码编号{}", productSn);
        String productNo = ProductParseUtil.parseProductNo(productSn);
        List<ErpProductInfo> productInfos = productInfoMapper.selectByExample()
                .where(erpProductInfo.productNo, isEqualTo(productNo))
                .build()
                .execute();
        if (productInfos == null || productInfos.isEmpty()) {
            log.error("条码" + productNo + "商品信息不存在，不允许入库");
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "条码" + productNo + "商品信息不存在，不允许入库");
        }
        if (productInfos.size() > 1) {
            log.error("条码" + productNo + "商品信息存在多条记录，不允许入库");
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "条码" + productNo + "商品信息存在多条记录，不允许入库");
        }
        ErpProductInfo productInfo = productInfos.get(0);
        int result = 0;
        List<ErpInventoryInfo> erpInventoryInfos = erpInventoryInfoMapper.selectByExample()
                .where(erpInventoryInfo.shopId, isEqualTo(shopId))
                .and(erpInventoryInfo.productSn, isEqualTo(productSn))
                .build()
                .execute();
        if (erpInventoryInfos == null || erpInventoryInfos.isEmpty()) {
            ErpInventoryInfo inventoryInfo = new ErpInventoryInfo();
            inventoryInfo.setShopId(shopId);
            inventoryInfo.setShopName(shopName);
            inventoryInfo.setProductSn(productSn);
            inventoryInfo.setProductName(productInfo.getProductName());
            inventoryInfo.setProductNo(ProductParseUtil.parseProductNo(productSn));
            inventoryInfo.setColor(ProductParseUtil.parseColor(productSn));
            inventoryInfo.setSize(ProductParseUtil.parseSize(productSn));
            inventoryInfo.setGmtModified(LocalDateTime.now());
            inventoryInfo.setGmtCreate(LocalDateTime.now());
            inventoryInfo.setNum(num > 0 ? num : 1);
            result = erpInventoryInfoMapper.insert(inventoryInfo);
            log.info("商品入库-门店{}新增条码{}商品库存信息", shopId, productSn);
        } else {
            ErpInventoryInfo info = erpInventoryInfos.get(0);
            info.setNum(info.getNum() + num);
            result = erpInventoryInfoMapper.updateByPrimaryKeySelective(info);
        }
        return result;
    }

    /**
     * @param productSn
     * @param num
     * @param shopId
     * @return
     * @throws ErpException
     */
    @Override
    public int updateInventoryNumByProductSn(int num, int shopId, String productSn) throws ErpException {
        int result = dynamicSqlMapper.addInventoryNumByProductSn(num, shopId, productSn);
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
        List<ErpInventoryInfo> inventoryInfos = erpInventoryInfoMapper.selectByExample()
                .where(erpInventoryInfo.productSn, isEqualTo(productSn))
                .build()
                .execute();
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
     * 根据条形码查询库存信息
     *
     * @param productSn
     * @return
     */
    @Override
    public ErpInventoryInfo selectByProductSn(String productSn) {
        ErpInventoryInfo inventoryInfo = null;
        List<ErpInventoryInfo> results = erpInventoryInfoMapper.selectByExample()
                .where(erpInventoryInfo.productSn, isEqualTo(productSn))
                .build().execute();
        if (results != null && !results.isEmpty()) {
            inventoryInfo = results.get(0);
        }
        return inventoryInfo;
    }

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    @Override
    public PageInfo<ErpInventoryInfo> selectPage(InventoryQueryRequest req) throws ErpException {

        PageInfo<ErpInventoryInfo> pageInfo = PageHelper.startPage(req.getPage(), req.getLimit())
                .doSelectPageInfo(() -> erpInventoryInfoMapper.selectByExample()
                        .where(erpInventoryInfo.productSn, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getProductSn()) ? null : req.getProductSn()))
                        .and(erpInventoryInfo.productNo, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getProductNo()) ? null : req.getProductNo()))
                        .and(erpInventoryInfo.productName, isLikeWhenPresent(() -> StringUtils.isEmpty(req.getProductName()) ? null : ("%" + req.getProductName() + "%")))
                        .and(erpInventoryInfo.size, isEqualToWhenPresent(req.getSize()))
                        .and(erpInventoryInfo.color, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getColor()) ? null : req.getColor()))
                        .and(erpInventoryInfo.num, isGreaterThanOrEqualToWhenPresent(req.getNum()))
                        .orderBy(erpInventoryInfo.gmtModified.descending(), erpInventoryInfo.gmtCreate.descending())
                        .build()
                        .execute()
                );
        return pageInfo;
    }
}
