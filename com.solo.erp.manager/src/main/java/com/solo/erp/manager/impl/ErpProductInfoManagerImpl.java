package com.solo.erp.manager.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.BaseQueryRequest;
import com.solo.erp.common.dto.request.ProductQueryRequest;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.DateUtils;
import com.solo.erp.dao.mapper.ErpInventoryInfoMapper;
import com.solo.erp.dao.mapper.ErpProductInfoMapper;
import com.solo.erp.dao.model.ErpInventoryInfo;
import com.solo.erp.dao.model.ErpProductInfo;
import com.solo.erp.dao.model.ErpProductInfoExample;
import com.solo.erp.manager.IErpProductInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.Date;

@Service("erpProductInfoManager")
public class ErpProductInfoManagerImpl implements IErpProductInfoManager {

    @Autowired
    ErpProductInfoMapper erpProductInfoMapper;

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
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    @Override
    public PageInfo<ErpProductInfo> selectPage(ProductQueryRequest req) throws ErpException {
        ErpProductInfoExample example = new ErpProductInfoExample();
        ErpProductInfoExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(req.getProductSn())) {
            criteria.andProductSnEqualTo(req.getProductSn());
        }
        if (!StringUtils.isEmpty(req.getProductName())) {
            criteria.andBrandNameLike("%" + req.getProductName() + "%");
        }
        if (!StringUtils.isEmpty(req.getBrandName())) {
            criteria.andBrandNameLike("%" + req.getBrandName() + "%");
        }
        if (!StringUtils.isEmpty(req.getSize())) {
            criteria.andSizeEqualTo(req.getSize());
        }
        if (!StringUtils.isEmpty(req.getColor())) {
            criteria.andColorEqualTo(req.getColor());
        }
        if (!StringUtils.isEmpty(req.getDiscount())) {
            criteria.andDiscountEqualTo(req.getDiscount());
        }
        if (!StringUtils.isEmpty(req.getGmtCreate())) {
            try {
                criteria.andGmtCreateBetween(DateUtils.parseToStart(req.getGmtCreate()), DateUtils.parseToEnd(req.getGmtCreate()));
            } catch (ParseException e) {
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "创建日期格式解析错误");
            }
        }
        PageInfo<ErpProductInfo> pageInfo = PageHelper.startPage(req.getPageNum(), req.getPageSize()).doSelectPageInfo(() -> erpProductInfoMapper.selectByExample(example));
        return pageInfo;
    }
}
