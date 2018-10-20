package com.solo.erp.manager.business.impl;

import com.solo.erp.dao.mapper.ErpStaffRoleRelMapper;
import com.solo.erp.dao.model.ErpStaffRoleRel;
import com.solo.erp.manager.business.IErpStaffRoleRelManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("staffRoleRelManager")
public class ErpStaffRoleRelManagerImpl implements IErpStaffRoleRelManager {
    @Autowired
    private ErpStaffRoleRelMapper staffRoleRelMapper;

    @Override
    public int create(ErpStaffRoleRel rel) {
        return staffRoleRelMapper.insert(rel);
    }
}
