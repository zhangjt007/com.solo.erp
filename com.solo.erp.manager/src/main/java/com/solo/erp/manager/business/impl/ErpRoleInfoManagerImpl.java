package com.solo.erp.manager.business.impl;

import com.solo.erp.dao.mapper.ErpRoleInfoMapper;
import com.solo.erp.dao.model.ErpRoleInfo;
import com.solo.erp.manager.business.IErpRoleInfoManager;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.solo.erp.dao.mapper.ErpRoleInfoDynamicSqlSupport.erpRoleInfo;
import static com.solo.erp.dao.mapper.ErpStaffRoleRelDynamicSqlSupport.erpStaffRoleRel;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

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
        return erpRoleInfoMapper.selectByExample()
                .where(erpRoleInfo.isEnable, isEqualTo(true))
                .build()
                .execute();
    }

    /**
     * 根据职员ID查询角色
     *
     * @param id
     * @return
     */
    @Override
    @Cacheable(value = "ErpRoleInfo", key = "'ID_' + #id")
    public List<ErpRoleInfo> selectByStaffId(int id) {
        SelectStatementProvider provider = select(erpRoleInfo.name, erpRoleInfo.nameZn, erpRoleInfo.isEnable, erpRoleInfo.id)
                .from(erpStaffRoleRel)
                .leftJoin(erpRoleInfo).on(erpStaffRoleRel.roleId, equalTo(erpRoleInfo.id))
                .where(erpStaffRoleRel.staffId, isEqualTo(id))
                .and(erpRoleInfo.isEnable, isEqualTo(true))
                .build()
                .render(RenderingStrategy.MYBATIS3);
        return erpRoleInfoMapper.selectMany(provider);
    }
}
