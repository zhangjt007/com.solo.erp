package com.solo.erp.manager.business.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.StaffQueryRequest;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.dao.mapper.ErpStaffInfoMapper;
import com.solo.erp.dao.mapper.ErpStaffRoleRelMapper;
import com.solo.erp.dao.model.ErpStaffInfo;
import com.solo.erp.dao.model.ErpStaffRoleRel;
import com.solo.erp.manager.business.IErpStaffManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

import static com.solo.erp.dao.mapper.ErpStaffInfoDynamicSqlSupport.erpStaffInfo;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service("staffManager")
public class ErpStaffManagerImpl implements IErpStaffManager {

    @Autowired
    private ErpStaffInfoMapper staffInfoMapper;
    @Autowired
    private ErpStaffRoleRelMapper staffRoleRelMapper;

    /**
     * 生成员工号
     *
     * @return
     */
    @Override
    public String genStaffNo() {
        long result = staffInfoMapper.countByExample().build().execute();
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
        PageInfo<ErpStaffInfo> pageInfo = PageHelper.startPage(req.getPage(), req.getLimit())
                .doSelectPageInfo(() -> staffInfoMapper.selectByExample()
                        .where(erpStaffInfo.mobile, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getMobile()) ? null : req.getMobile()))
                        .and(erpStaffInfo.staffName, isLikeWhenPresent(() -> StringUtils.isEmpty(req.getStaffName()) ? null : ("%" + req.getStaffName() + "%")))
                        .and(erpStaffInfo.staffNo, isEqualToWhenPresent(() -> StringUtils.isEmpty(req.getStaffNo()) ? null : req.getStaffNo()))
                        .orderBy(erpStaffInfo.id.descending())
                        .build()
                        .execute()
                );
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
        return staffInfoMapper.insert(info);
    }

    /**
     * 更新用户信息
     *
     * @param info
     * @return
     * @throws ErpException
     */
    @Override
    @CacheEvict(value = "ErpStaffInfo", allEntries = true)
    public int update(ErpStaffInfo info) throws ErpException {
        return staffInfoMapper.updateByPrimaryKeySelective(info);
    }

    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    @Override
    @Cacheable(value = "ErpStaffInfo", key = "'ID_' + #id")
    public ErpStaffInfo selectById(int id) throws ErpException {
        return staffInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据登录名查询
     *
     * @param loginName
     * @return
     */
    @Override
    @Cacheable(value = "ErpStaffInfo", key = "'LOGINNAME_' + #loginName")
    public ErpStaffInfo selectByLoginName(String loginName) throws ErpException {
        ErpStaffInfo info = null;
        List<ErpStaffInfo> staffInfos = staffInfoMapper.selectByExample()
                .where(erpStaffInfo.loginName, isEqualTo(loginName))
                .and(erpStaffInfo.isEnable, isEqualTo(true))
                .build()
                .execute();
        if (staffInfos != null && !staffInfos.isEmpty()) {
            info = staffInfos.get(0);
        }
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
