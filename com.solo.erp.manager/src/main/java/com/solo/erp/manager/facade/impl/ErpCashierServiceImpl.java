package com.solo.erp.manager.facade.impl;

import com.solo.erp.common.bean.CashierViewBean;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.model.ErpInventoryInfo;
import com.solo.erp.dao.model.ErpProductInfo;
import com.solo.erp.manager.business.IErpInventoryManager;
import com.solo.erp.manager.business.IErpProductInfoManager;
import com.solo.erp.manager.facade.IErpCashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cashierService")
public class ErpCashierServiceImpl implements IErpCashierService {

    @Autowired
    private IErpProductInfoManager productInfoManager;
    @Autowired
    private IErpInventoryManager inventoryManager;

    /**
     * 根据商品SN查询
     *
     * @param productSn
     * @return
     */
    @Override
    public CashierViewBean getByProductSn(String productSn) throws ErpException {

        ErpInventoryInfo inventoryInfo = inventoryManager.selectByProductSn(productSn);
        if (inventoryInfo == null) {
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "库存信息不存在");
        }
        if (inventoryInfo.getNum() <= 0) {
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "商品" + inventoryInfo.getProductSn() + "库存不足");
        }
        ErpProductInfo productInfo = productInfoManager.selectByProductNo(inventoryInfo.getProductNo());
        if (productInfo == null) {
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "商品信息不存在");
        }
        CashierViewBean bean = new CashierViewBean();
        bean.setBrandName(productInfo.getBrandName());
        bean.setColor(inventoryInfo.getColor());
        bean.setCostPrice(productInfo.getCostPrice());
        bean.setDiscount(productInfo.getDiscount());
        bean.setNum(inventoryInfo.getNum());
        bean.setProductImg(productInfo.getProductImg());
        bean.setProductName(productInfo.getProductName());
        bean.setProductNo(productInfo.getProductNo());
        bean.setProductSn(inventoryInfo.getProductSn());
        bean.setProductType(productInfo.getProductType());
        bean.setRealPrice(productInfo.getRealPrice());
        bean.setRemark(productInfo.getRemark());
        bean.setSeason(productInfo.getSeason());
        bean.setSize(inventoryInfo.getSize());
        bean.setTagPrice(productInfo.getTagPrice());
        bean.setYear(productInfo.getYear());
        bean.setWaveBand(productInfo.getWaveBand());
        return bean;
    }
}
