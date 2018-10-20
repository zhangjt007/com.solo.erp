package com.solo.erp.manager.business.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.VipInfoQueryRequest;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.mapper.DynamicSqlMapper;
import com.solo.erp.dao.mapper.ErpVipInfoMapper;
import com.solo.erp.dao.model.ErpVipInfo;
import com.solo.erp.manager.business.IErpVipInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static com.solo.erp.dao.mapper.ErpVipInfoDynamicSqlSupport.erpVipInfo;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service("erpVipInfoManager")
public class ErpVipInfoManagerImpl implements IErpVipInfoManager {
    @Autowired
    ErpVipInfoMapper erpVipInfoMapper;
    @Autowired
    DynamicSqlMapper dynamicSqlMapper;

    /**
     * VIP用户新增并返回ID
     *
     * @param info
     * @return
     * @throws ErpException
     */
    @Override
    public int createAndGetId(ErpVipInfo info) throws ErpException {
        erpVipInfoMapper.insert(info);
        return info.getId();
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
        String userName = StringUtils.isEmpty(req.getUserName()) ? null : "%" + req.getUserName() + "%";

        PageInfo<ErpVipInfo> pageInfo = PageHelper.startPage(req.getPage(), req.getLimit())
                .doSelectPageInfo(() -> erpVipInfoMapper.selectByExample()
                        .where(erpVipInfo.brithday, isEqualToWhenPresent(req.getBrithday()))
                        .and(erpVipInfo.mobile, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getMobile()) ? null : req.getMobile()))
                        .and(erpVipInfo.userName, isLikeWhenPresent(() -> StringUtils.isEmpty(req.getUserName()) ? null : ("%" + req.getUserName() + "%")))
                        .orderBy(erpVipInfo.id.descending())
                        .build()
                        .execute()
                );
        return pageInfo;
    }

    /**
     * 根据手机号查询
     *
     * @param mobile
     * @return
     */
    @Override
    public ErpVipInfo selectByMobile(String mobile) throws ErpException {
        List<ErpVipInfo> result = this.erpVipInfoMapper.selectByExample()
                .where(erpVipInfo.mobile, isEqualTo(mobile))
                .build()
                .execute();
        if (result != null && !result.isEmpty()) {
            return result.get(0);
        } else {
            throw new ErpException(EnumRespCode.DATA_ERROR.getCode(), "会员信息不存在");
        }
    }

    /**
     * 查询最近过生日的VIP用户
     *
     * @param days
     * @return
     * @throws ErpException
     */
    @Override
    public List<HashMap> selectByLastBrithday(int days) throws ErpException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
        LocalDate today = LocalDate.now();
        LocalDate lastDay = today.plusDays(days);
        List<HashMap> result;
        if (today.getYear() == lastDay.getYear()) {
            result = this.dynamicSqlMapper.selectVIPByLastBrithday(today.format(formatter), lastDay.format(formatter), null, null);
        } else {
            result = this.dynamicSqlMapper.selectVIPByLastBrithday(today.format(formatter), "12-31", "01-01", lastDay.format(formatter));
        }
        return result;
    }

    @Override
    public int selectOpenVIPCountByDay(LocalDate date, Set shops) throws ErpException {
        HashMap result = this.dynamicSqlMapper.statisticsOpenVIPByDay(date.toString(), shops);
        return Integer.parseInt(result.get("vip_count").toString());
    }


}