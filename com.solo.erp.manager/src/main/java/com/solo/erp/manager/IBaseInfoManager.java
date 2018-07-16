package com.solo.erp.manager;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.BaseQueryRequest;

public interface IBaseInfoManager<T> {
    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    T selectById(int id);

    /**
     * 根据查询条件分页查询
     *
     * @param req
     * @return
     */
    PageInfo<T> selectPage(BaseQueryRequest req);
}