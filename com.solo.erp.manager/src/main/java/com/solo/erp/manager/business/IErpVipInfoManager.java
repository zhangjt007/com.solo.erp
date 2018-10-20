package com.solo.erp.manager.business;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.VipInfoQueryRequest;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.model.ErpVipInfo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public interface IErpVipInfoManager {
    /**
     * VIP用户新增
     *
     * @param info
     * @return
     * @throws ErpException
     */
    int createAndGetId(ErpVipInfo info) throws ErpException;

    /**
     * 更新VIP用户信息
     *
     * @param info
     * @return
     * @throws ErpException
     */
    int update(ErpVipInfo info) throws ErpException;

    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    ErpVipInfo selectById(int id);

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    PageInfo<ErpVipInfo> selectPage(VipInfoQueryRequest req);

    /**
     * 根据手机号查询
     *
     * @param mobile
     * @return
     */
    ErpVipInfo selectByMobile(String mobile) throws ErpException;

    /**
     * 查询最近过生日的VIP用户
     *
     * @param days
     * @return
     * @throws ErpException
     */
    List<HashMap> selectByLastBrithday(int days) throws ErpException;

    /**
     * 根据日期查询新开VIP数量
     *
     * @param date
     * @param shops
     * @return
     * @throws ErpException
     */
    int selectOpenVIPCountByDay(LocalDate date, Set shops) throws ErpException;

}
