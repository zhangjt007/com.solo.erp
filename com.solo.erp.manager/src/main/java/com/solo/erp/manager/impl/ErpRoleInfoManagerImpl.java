package com.solo.erp.manager.impl;

import com.solo.erp.dao.mapper.ErpRoleInfoMapper;
import com.solo.erp.dao.model.ErpRoleInfo;
import com.solo.erp.dao.model.ErpRoleInfoExample;
import com.solo.erp.manager.IErpRoleInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("erpRoleInfoManager")
public class ErpRoleInfoManagerImpl implements IErpRoleInfoManager {

    @Autowired
    ErpRoleInfoMapper erpRoleInfoMapper;

    /**
     * 获取所有可用角色
     *
     * @return
     */
    @Override
    public List<ErpRoleInfo> selectAll() {
        ErpRoleInfoExample example = new ErpRoleInfoExample();
        example.createCriteria().andIsEnableEqualTo(true);
        return erpRoleInfoMapper.selectByExample(example);
    }
}
