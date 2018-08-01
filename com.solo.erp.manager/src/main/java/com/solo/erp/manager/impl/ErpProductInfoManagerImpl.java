package com.solo.erp.manager.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.ProductQueryRequest;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.DateUtils;
import com.solo.erp.dao.mapper.DynamicSqlMapper;
import com.solo.erp.dao.mapper.ErpProductInfoMapper;
import com.solo.erp.dao.model.ErpProductInfo;
import com.solo.erp.dao.model.ErpProductInfoExample;
import com.solo.erp.manager.IErpProductInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.List;

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
    public void batchInsert(List<ErpProductInfo> list) throws ErpException {
        try {
            dynamicSqlMapper.batchInsertProduct(list);
        } catch (ErpException e) {
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
        ErpProductInfoExample example = new ErpProductInfoExample();
        example.createCriteria().andProductNoEqualTo(productNo);
        List<ErpProductInfo> list = erpProductInfoMapper.selectByExample(example);
        if (list.isEmpty()){
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(),EnumRespCode.DATA_ERROR.getMsg());
        }else {
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
        ErpProductInfoExample example = new ErpProductInfoExample();
        ErpProductInfoExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(req.getProductNo())) {
            criteria.andProductNoEqualTo(req.getProductNo());
        }
        if (!StringUtils.isEmpty(req.getProductName())) {
            criteria.andProductNameLike("%" + req.getProductName() + "%");
        }
        if (req.getSeason() >= 0) {
            criteria.andSeasonEqualTo(req.getSeason());
        }
        if (req.getDiscount() >= 0) {
            criteria.andDiscountEqualTo(req.getDiscount());
        }
        if (req.getWave_band() >= 0) {
            criteria.andWaveBandEqualTo(req.getWave_band());
        }
        if (req.getYear() >= 0) {
            criteria.andYearEqualTo(req.getYear());
        }
        if (!StringUtils.isEmpty(req.getProductType())) {
            criteria.andProductTypeEqualTo(req.getProductType());
        }
        if (!StringUtils.isEmpty(req.getGmtCreate())) {
            try {
                criteria.andGmtCreateBetween(DateUtils.parseToStart(req.getGmtCreate()), DateUtils.parseToEnd(req.getGmtCreate()));
            } catch (ParseException e) {
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "创建日期格式解析错误");
            }
        }
        PageInfo<ErpProductInfo> pageInfo = PageHelper.startPage(req.getPage(), req.getLimit()).doSelectPageInfo(() -> erpProductInfoMapper.selectByExample(example));
        return pageInfo;
    }
}
