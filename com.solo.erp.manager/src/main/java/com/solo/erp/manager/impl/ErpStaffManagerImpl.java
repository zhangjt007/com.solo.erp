package com.solo.erp.manager.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.StaffQueryRequest;
import com.solo.erp.common.enums.EnumBool;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.DateUtils;
import com.solo.erp.dao.mapper.DynamicSqlMapper;
import com.solo.erp.dao.mapper.ErpStaffInfoMapper;
import com.solo.erp.dao.mapper.ErpStaffRoleRelMapper;
import com.solo.erp.dao.model.ErpStaffInfo;
import com.solo.erp.dao.model.ErpStaffInfoExample;
import com.solo.erp.dao.model.ErpStaffRoleRel;
import com.solo.erp.dao.model.ErpVipInfo;
import com.solo.erp.manager.IErpStaffManager;
import com.solo.erp.manager.bo.LoginUserBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service("staffManager")
public class ErpStaffManagerImpl implements IErpStaffManager {

    @Autowired
    private ErpStaffInfoMapper staffInfoMapper;
    @Autowired
    private ErpStaffRoleRelMapper staffRoleRelMapper;
    @Autowired
    private DynamicSqlMapper dynamicSqlMapper;

    /**
     * 注册员工信息
     *
     * @param info
     * @param roles
     * @return
     */
    @Override
    @Transactional
    public void register(ErpStaffInfo info, List<Integer> roles) throws ErpException {
        int result = staffInfoMapper.insert(info);
        for (int role : roles) {
            ErpStaffRoleRel rel = new ErpStaffRoleRel();
            rel.setStaffId(info.getId());
            rel.setRoleId(role);
            rel.setGmtCreate(new Date());
            rel.setGmtModified(new Date());
            rel.setIsEnable(true);
            staffRoleRelMapper.insert(rel);
        }
    }

    /**
     * 根据登录名查询相关用户信息
     *
     * @param loginName
     * @return
     */
    @Override
    public LoginUserBO selectLoginUserInfo(String loginName) {
        HashMap<String, Object> result = dynamicSqlMapper.selectLoginStaffInfoByLoginName(loginName);
        if (result != null && !result.isEmpty()) {
            LoginUserBO bo = new LoginUserBO();
            bo.setId((int) result.get("id"));
            bo.setShopId((int) result.get("shop_id"));
            bo.setShopName(result.get("shop_name").toString());
            bo.setUsername(result.get("login_name").toString());
            bo.setPassword(result.get("login_pwd").toString());
            bo.setRole(result.get("role_name").toString());
            bo.setName(result.get("staff_name").toString());
            bo.setStaffNo(result.get("staff_no").toString());
            bo.setStaffPhoto(result.get("staff_photo").toString());
            int isEnable = (int) result.get("is_enable");
            if (EnumBool.TRUE.getCode() == isEnable) {
                bo.setEnabled(true);
            } else {
                bo.setEnabled(false);
            }
            bo.setSalt("");
            return bo;
        } else {
            return null;
        }
    }

    /**
     * 生成员工号
     *
     * @return
     */
    @Override
    public String genStaffNo() {
        ErpStaffInfoExample example = new ErpStaffInfoExample();
        long result = staffInfoMapper.countByExample(example);
        String staffNo = String.format("%04d", ++result);
        return staffNo;
    }

    /**
     * 员工查询
     *
     * @param req
     * @return
     */
    @Override
    public PageInfo<ErpStaffInfo> selectPage(StaffQueryRequest req) {
        ErpStaffInfoExample example = new ErpStaffInfoExample();
        ErpStaffInfoExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(req.getMobile())) {
            criteria.andMobileEqualTo(req.getMobile());
        }
        if (!StringUtils.isEmpty(req.getStaffNo())) {
            criteria.andStaffNoEqualTo(req.getStaffNo());
        }
        if (!StringUtils.isEmpty(req.getStaffName())) {
            criteria.andStaffNameLike("%" + req.getStaffName() + "%");
        }
        if (!StringUtils.isEmpty(req.getGmtCreate())) {
            try {
                criteria.andGmtCreateBetween(DateUtils.parseToStart(req.getGmtCreate()), DateUtils.parseToEnd(req.getGmtCreate()));
            } catch (ParseException e) {
                throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "创建日期格式解析错误");
            }
        }
        PageInfo<ErpStaffInfo> pageInfo = PageHelper.startPage(req.getPage(), req.getLimit()).doSelectPageInfo(() -> staffInfoMapper.selectByExample(example));
        return pageInfo;
    }

    /**
     * 用户新增
     *
     * @param info
     * @return
     * @throws ErpException
     */
    @Override
    public int create(ErpStaffInfo info) throws ErpException {
        int result = staffInfoMapper.insert(info);
        return result;
    }

    /**
     * 更新用户信息
     *
     * @param info
     * @return
     * @throws ErpException
     */
    @Override
    public int update(ErpStaffInfo info) throws ErpException {
        int result = staffInfoMapper.updateByPrimaryKeySelective(info);
        return result;
    }

    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    @Override
    public ErpStaffInfo selectById(int id) {
        ErpStaffInfo info = staffInfoMapper.selectByPrimaryKey(id);
        return info;
    }

    /**
     * 关系新增
     *
     * @param rel
     * @return
     * @throws ErpException
     */
    @Override
    public int create(ErpStaffRoleRel rel) throws ErpException {
        return staffRoleRelMapper.insert(rel);
    }

}
