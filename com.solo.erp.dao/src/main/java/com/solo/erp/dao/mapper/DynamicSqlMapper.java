package com.solo.erp.dao.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface DynamicSqlMapper {
    /**
     * 查询所有菜单所需要的权限信息，权限信息使用"|"分隔（权限校验时使用）
     *
     * @return
     */
    List<HashMap> selectAllMenuAndRole();

    /**
     * 查询登录用户相关信息
     * @return
     */
    HashMap selectLoginStaffInfoByLoginName(@Param("loginName")String loginName);
}
