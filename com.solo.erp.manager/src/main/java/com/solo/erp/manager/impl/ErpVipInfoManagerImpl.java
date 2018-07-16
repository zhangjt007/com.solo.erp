package com.solo.erp.manager.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.BaseQueryRequest;
import com.solo.erp.common.dto.request.VipInfoQueryRequest;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.DateUtils;
import com.solo.erp.dao.mapper.ErpVipInfoMapper;
import com.solo.erp.dao.model.ErpVipInfo;
import com.solo.erp.dao.model.ErpVipInfoExample;
import com.solo.erp.manager.IErpVipInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.ParseException;

@Service("erpVipInfoManager")
public class ErpVipInfoManagerImpl implements IErpVipInfoManager {
    @Autowired
    ErpVipInfoMapper erpVipInfoMapper;

    /**
     * VIP用户新增
     *
     * @param info
     * @return
     * @throws ErpException
     */
    @Override
    public int create(ErpVipInfo info) throws ErpException {
        int result = erpVipInfoMapper.insert(info);
        return result;
    }

    /**
     * 更新VIP用户信息
     *
     * @param info
     * @return
     * @throws ErpException
     */
    @Override
    public int update(ErpVipInfo info) throws ErpException {
        int result = erpVipInfoMapper.updateByPrimaryKeySelective(info);
        return result;
    }

    @Override
    public ErpVipInfo selectById(int id) {
        ErpVipInfo info = erpVipInfoMapper.selectByPrimaryKey(id);
        return info;
    }

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    @Override
    public PageInfo<ErpVipInfo> selectPage(VipInfoQueryRequest req) {
        ErpVipInfoExample example = new ErpVipInfoExample();
        ErpVipInfoExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(req.getBrithday())) {
            try {
                criteria.andBrithdayEqualTo(DateUtils.parse(req.getBrithday()));
            } catch (ParseException e) {
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "生日格式解析错误");
            }
        }
        if (!StringUtils.isEmpty(req.getGmtCreate())) {
            try {
                criteria.andGmtCreateBetween(DateUtils.parseToStart(req.getGmtCreate()), DateUtils.parseToEnd(req.getGmtCreate()));
            } catch (ParseException e) {
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "创建日期格式解析错误");
            }
        }
        if (!StringUtils.isEmpty(req.getMobile())) {
            criteria.andMobileEqualTo(req.getMobile());
        }
        if (!StringUtils.isEmpty(req.getUserName())) {
            criteria.andUserNameLike("%" + req.getUserName() + "%");
        }
        PageInfo<ErpVipInfo> pageInfo = PageHelper.startPage(req.getPageNum(), req.getPageSize()).doSelectPageInfo(() -> erpVipInfoMapper.selectByExample(example));
        return pageInfo;
    }
}