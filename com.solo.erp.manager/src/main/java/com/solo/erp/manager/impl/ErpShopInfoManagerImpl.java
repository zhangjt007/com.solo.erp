package com.solo.erp.manager.impl;

import com.solo.erp.dao.mapper.ErpShopInfoMapper;
import com.solo.erp.dao.model.ErpShopInfo;
import com.solo.erp.dao.model.ErpShopInfoExample;
import com.solo.erp.manager.IErpShopInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("erpShopInfoManager")
public class ErpShopInfoManagerImpl implements IErpShopInfoManager {
    @Autowired
    private ErpShopInfoMapper shopInfoMapper;

    /**
     * 根据父节点查找子节点
     *
     * @param id
     * @return
     */
    @Override
    public List<ErpShopInfo> selectByParentId(int id) {
        ErpShopInfoExample example = new ErpShopInfoExample();
        example.createCriteria().andParentIdEqualTo(id);
        return shopInfoMapper.selectByExample(example);
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public ErpShopInfo selectById(int id) {
        return shopInfoMapper.selectByPrimaryKey(id);
    }
}
