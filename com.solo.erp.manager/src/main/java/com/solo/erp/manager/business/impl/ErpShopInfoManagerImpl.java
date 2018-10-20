package com.solo.erp.manager.business.impl;

import com.solo.erp.dao.mapper.ErpShopInfoMapper;
import com.solo.erp.dao.model.ErpShopInfo;
import com.solo.erp.manager.business.IErpShopInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.solo.erp.dao.mapper.ErpShopInfoDynamicSqlSupport.erpShopInfo;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

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
    @Cacheable(value = "ErpShopInfo", key = "'PARENT_ID_' + #id")
    public List<ErpShopInfo> selectByParentId(int id) {
        return shopInfoMapper.selectByExample().where(erpShopInfo.parentId, isEqualTo(id))
                .build()
                .execute();
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    @Cacheable(value = "ErpShopInfo", key = "'ID_' + #id")
    public ErpShopInfo selectById(int id) {
        return shopInfoMapper.selectByPrimaryKey(id);
    }
}
