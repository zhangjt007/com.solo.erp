package com.solo.erp.manager.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.OrderDetailQueryRequest;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.DateUtils;
import com.solo.erp.dao.mapper.ErpOrderDetailMapper;
import com.solo.erp.dao.mapper.ErpOrderInfoMapper;
import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.dao.model.ErpOrderDetailExample;
import com.solo.erp.manager.IErpOrderDetailManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.List;

@Service("erpOrderDetailManager")
public class ErpOrderDetailManagerImpl implements IErpOrderDetailManager {
    @Autowired
    ErpOrderDetailMapper orderDetailMapper;
    @Autowired
    ErpOrderInfoMapper orderInfoMapper;


    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    @Override
    public ErpOrderDetail selectById(int id) {
        return orderDetailMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据订单ID查询明细
     *
     * @param orderNo
     * @return
     */
    @Override
    public List<ErpOrderDetail> selectByOrderNo(String orderNo) {
        ErpOrderDetailExample example = new ErpOrderDetailExample();
        example.createCriteria().andOrderNoEqualTo(orderNo);
        List<ErpOrderDetail> results = orderDetailMapper.selectByExample(example);
        return results;
    }

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    @Override
    public PageInfo<ErpOrderDetail> selectPage(OrderDetailQueryRequest req) {
        PageInfo<ErpOrderDetail> pageInfo;
        ErpOrderDetailExample example = new ErpOrderDetailExample();
        ErpOrderDetailExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(req.getOrderNo())) {
            criteria.andOrderNoEqualTo(req.getOrderNo());
        }
        if(!StringUtils.isEmpty(req.getProductNo())){
            criteria.andProductNoEqualTo(req.getProductNo());
        }
        if (!StringUtils.isEmpty(req.getGmtCreate())) {
            try {
                criteria.andGmtCreateBetween(DateUtils.parseToStart(req.getGmtCreate()), DateUtils.parseToEnd(req.getGmtCreate()));
            } catch (ParseException e) {
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "创建日期格式解析错误");
            }
        }
        pageInfo = PageHelper.startPage(req.getPage(), req.getLimit()).doSelectPageInfo(() -> orderDetailMapper.selectByExample(example));
        return pageInfo;
    }
}
