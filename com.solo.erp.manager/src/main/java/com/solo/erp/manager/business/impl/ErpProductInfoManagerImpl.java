package com.solo.erp.manager.business.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.ProductQueryRequest;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.mapper.DynamicSqlMapper;
import com.solo.erp.dao.mapper.ErpProductInfoMapper;
import com.solo.erp.dao.model.ErpProductInfo;
import com.solo.erp.manager.business.IErpProductInfoManager;
import org.mybatis.dynamic.sql.insert.render.BatchInsert;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

import static com.solo.erp.dao.mapper.ErpProductInfoDynamicSqlSupport.erpProductInfo;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service("erpProductInfoManager")
public class ErpProductInfoManagerImpl implements IErpProductInfoManager {

    @Autowired
    ErpProductInfoMapper erpProductInfoMapper;
    @Autowired
    DynamicSqlMapper dynamicSqlMapper;

    /**
     * 插入商品信息
     *
     * @param info
     * @return
     * @throws ErpException
     */
    @Override
    public int create(ErpProductInfo info) throws ErpException {
        int result = erpProductInfoMapper.insert(info);
        return result;
    }

    /**
     * 批量插入商品信息
     *
     * @param list
     * @throws ErpException
     */
    @Override
    @Transactional
    public void batchInsert(List<ErpProductInfo> list) throws ErpException {
        try {
            BatchInsert<ErpProductInfo> batchInsert = insert(list)
                    .into(erpProductInfo)
                    .map(erpProductInfo.id).toProperty("id")
                    .map(erpProductInfo.productNo).toProperty("productNo")
                    .map(erpProductInfo.productName).toProperty("productName")
                    .map(erpProductInfo.year).toProperty("year")
                    .map(erpProductInfo.season).toProperty("season")
                    .map(erpProductInfo.waveBand).toProperty("waveBand")
                    .map(erpProductInfo.productType).toProperty("productType")
                    .map(erpProductInfo.productImg).toProperty("productImg")
                    .map(erpProductInfo.productThums).toProperty("productThums")
                    .map(erpProductInfo.brandName).toProperty("brandName")
                    .map(erpProductInfo.tagPrice).toProperty("tagPrice")
                    .map(erpProductInfo.realPrice).toProperty("realPrice")
                    .map(erpProductInfo.costPrice).toProperty("costPrice")
                    .map(erpProductInfo.size).toProperty("size")
                    .map(erpProductInfo.color).toProperty("color")
                    .map(erpProductInfo.discount).toProperty("discount")
                    .map(erpProductInfo.remark).toProperty("remark")
                    .map(erpProductInfo.gmtCreate).toProperty("gmtCreate")
                    .map(erpProductInfo.gmtModified).toProperty("gmtModified")
                    .build()
                    .render(RenderingStrategy.MYBATIS3);
            batchInsert.insertStatements().stream().forEach(erpProductInfoMapper::insert);
        } catch (Exception e) {
            throw new ErpException(EnumRespCode.INSERT_ERROR.getCode(), "商品批量导入异常");
        }
    }

    /**
     * 更新商品信息
     *
     * @param info
     * @return
     * @throws ErpException
     */
    @Override
    public int update(ErpProductInfo info) throws ErpException {
        int result = erpProductInfoMapper.updateByPrimaryKeySelective(info);
        return result;
    }

    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    @Override
    public ErpProductInfo selectById(int id) {
        ErpProductInfo info = erpProductInfoMapper.selectByPrimaryKey(id);
        return info;
    }

    /**
     * 根据商品编号查询
     *
     * @param productNo
     * @return
     */
    @Override
    public ErpProductInfo selectByProductNo(String productNo) throws ErpException {
        List<ErpProductInfo> list = erpProductInfoMapper.selectByExample()
                .where(erpProductInfo.productNo, isEqualTo(productNo))
                .build()
                .execute();

        if (list.isEmpty()) {
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), EnumRespCode.DATA_ERROR.getMsg());
        } else {
            return list.get(0);
        }
    }

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    @Override
    public PageInfo<ErpProductInfo> selectPage(ProductQueryRequest req) throws ErpException {
        PageInfo<ErpProductInfo> pageInfo = PageHelper.startPage(req.getPage(), req.getLimit())
                .doSelectPageInfo(() -> erpProductInfoMapper.selectByExample()
                        .where(erpProductInfo.productNo, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getProductNo()) ? null : req.getProductNo()))
                        .and(erpProductInfo.productName, isLikeWhenPresent(() -> StringUtils.isEmpty(req.getProductName()) ? null : ("%" + req.getProductName() + "%")))
                        .and(erpProductInfo.season, isEqualToWhenPresent(req.getSeason()))
                        .and(erpProductInfo.discount, isEqualToWhenPresent(req.getDiscount()))
                        .and(erpProductInfo.waveBand, isEqualToWhenPresent(req.getWaveBand()))
                        .and(erpProductInfo.year, isEqualToWhenPresent(req.getYear()))
                        .and(erpProductInfo.productType, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getProductType()) ? null : req.getProductType()))
                        .orderBy(erpProductInfo.gmtModified.descending(), erpProductInfo.gmtCreate.descending())
                        .build()
                        .execute()
                );
        return pageInfo;
    }
}
