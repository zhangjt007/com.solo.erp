package com.solo.erp.manager.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.OrderInfoQueryRequest;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.DateUtils;
import com.solo.erp.dao.mapper.ErpOrderDetailMapper;
import com.solo.erp.dao.mapper.ErpOrderInfoMapper;
import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.dao.model.ErpOrderDetailExample;
import com.solo.erp.dao.model.ErpOrderInfo;
import com.solo.erp.dao.model.ErpOrderInfoExample;
import com.solo.erp.manager.IErpOrderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.List;

@Service("orderManager")
public class ErpOrderManagerImpl implements IErpOrderManager {

    @Autowired
    ErpOrderInfoMapper orderInfoMapper;
    @Autowired
    ErpOrderDetailMapper orderDetailMapper;

    /**
     * 插入订单信息和明细
     *
     * @param orderInfo
     * @param orderDetails
     * @return
     */
    @Override
    public int insertOrderInfo(ErpOrderInfo orderInfo, List<ErpOrderDetail> orderDetails) {
        int record = orderInfoMapper.insert(orderInfo);
        if (orderDetails != null && !orderDetails.isEmpty()) {
            for (ErpOrderDetail detail : orderDetails) {
                orderDetailMapper.insert(detail);
            }
        }
        return record;
    }

    /**
     * 根据订单编号查询订单信息
     *
     * @param orderNo
     * @return
     */
    @Override
    public ErpOrderInfo selectByOrderNo(String orderNo) {
        ErpOrderInfoExample erpOrderInfoExample = new ErpOrderInfoExample();
        erpOrderInfoExample.createCriteria().andOrderNoEqualTo(orderNo);
        List<ErpOrderInfo> result = this.orderInfoMapper.selectByExample(erpOrderInfoExample);
        return result.get(0);
    }

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    @Override
    public PageInfo<ErpOrderInfo> selectPage(OrderInfoQueryRequest req) throws ErpException {
        ErpOrderInfoExample example = new ErpOrderInfoExample();
        ErpOrderInfoExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(req.getOrderNo())) {
            criteria.andOrderNoEqualTo(req.getOrderNo());
        }
        if (!StringUtils.isEmpty(req.getOrderStatus())) {
            criteria.andOrderStatusEqualTo(req.getOrderStatus());
        }
        if (!StringUtils.isEmpty(req.getStaffName())) {
            criteria.andStaffNameLike("%" + req.getStaffName() + "%");
        }
        if (req.isRefundFlag()) {
            criteria.andIsRefundEqualTo(req.isRefundFlag());
        }
        if (!StringUtils.isEmpty(req.getPayType())) {
            criteria.andPayTypeEqualTo(req.getPayType());
        }
        if (!StringUtils.isEmpty(req.getGmtCreate())) {
            try {
                criteria.andGmtCreateBetween(DateUtils.parseToStart(req.getGmtCreate()), DateUtils.parseToEnd(req.getGmtCreate()));
            } catch (ParseException e) {
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "创建日期格式解析错误");
            }
        }
        PageInfo<ErpOrderInfo> pageInfo = PageHelper.startPage(req.getPage(), req.getLimit()).doSelectPageInfo(() -> orderInfoMapper.selectByExample(example));
        return pageInfo;
    }

    /**
     * 更新订单信息
     *
     * @param orderInfo
     * @return
     */
    @Override
    public int updateOrderInfo(ErpOrderInfo orderInfo) {
        int result = this.orderInfoMapper.updateByPrimaryKeySelective(orderInfo);
        return result;
    }
}
