package com.solo.erp.manager;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.BaseQueryRequest;
import com.solo.erp.common.dto.request.VipInfoQueryRequest;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.model.ErpVipInfo;

public interface IErpVipInfoManager {
    /**
     * VIP用户新增
     *
     * @param info
     * @return
     * @throws ErpException
     */
    int create(ErpVipInfo info) throws ErpException;

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
     * @param mobile
     * @return
     */
    ErpVipInfo selectByMobile(String mobile) throws ErpException;
}
