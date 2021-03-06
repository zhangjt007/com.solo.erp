package com.solo.erp.manager.business;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.StaffQueryRequest;
import com.solo.erp.common.dto.request.VipInfoQueryRequest;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.model.ErpStaffInfo;
import com.solo.erp.dao.model.ErpStaffRoleRel;
import com.solo.erp.dao.model.ErpVipInfo;
import com.solo.erp.manager.bo.LoginUserBO;

import java.util.List;

public interface IErpStaffManager {

    /**
     * 获取当前数量
     *
     * @return
     */
    String genStaffNo();

    /**
     * 员工查询
     *
     * @param req
     * @return
     */
    PageInfo<ErpStaffInfo> selectPage(StaffQueryRequest req);


    /**
     * 用户新增
     *
     * @param info
     * @return
     * @throws ErpException
     */
    int create(ErpStaffInfo info) throws ErpException;

    /**
     * 更新用户信息
     *
     * @param info
     * @return
     * @throws ErpException
     */
    int update(ErpStaffInfo info) throws ErpException;

    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    ErpStaffInfo selectById(int id) throws ErpException;

    /**
     * 根据登录名查询
     *
     * @param loginName
     * @return
     */
    ErpStaffInfo selectByLoginName(String loginName) throws ErpException;

    /**
     * 关系新增
     *
     * @param rel
     * @return
     * @throws ErpException
     */
    int create(ErpStaffRoleRel rel) throws ErpException;


}
