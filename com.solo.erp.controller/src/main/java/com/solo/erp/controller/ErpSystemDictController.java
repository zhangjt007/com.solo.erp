package com.solo.erp.controller;

import com.solo.erp.common.bean.DictOptionBean;
import com.solo.erp.common.dto.response.SystemDictResponse;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.dao.model.ErpRoleInfo;
import com.solo.erp.dao.model.ErpShopInfo;
import com.solo.erp.manager.business.IErpRoleInfoManager;
import com.solo.erp.manager.business.IErpShopInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/system/dict")
public class ErpSystemDictController extends BaseController {
    @Autowired
    private IErpRoleInfoManager roleInfoManager;
    @Autowired
    private IErpShopInfoManager shopInfoManager;

    @GetMapping("/roles")
    public SystemDictResponse fetchRoles() {
        SystemDictResponse response = new SystemDictResponse();
        List<DictOptionBean> dict = new ArrayList<>();
        List<ErpRoleInfo> roleInfoList = roleInfoManager.selectAll();
        if (!roleInfoList.isEmpty()) {
            for (ErpRoleInfo info : roleInfoList) {
                DictOptionBean bean = new DictOptionBean();
                bean.setLabel(info.getNameZn());
                bean.setValue(info.getId());
                dict.add(bean);
            }
        }
        response.setOptions(dict);
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage(EnumRespCode.SUCCESS.getMsg());
        return response;
    }

    @GetMapping("/shops")
    public SystemDictResponse fetchShops() {
        SystemDictResponse response = new SystemDictResponse();
        response.setOptions(this.recursion(-1, 1));
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage(EnumRespCode.SUCCESS.getMsg());
        return response;
    }

    private List<DictOptionBean> recursion(int parent, int level) {
        List<DictOptionBean> list = new ArrayList<>();
        List<ErpShopInfo> infoList = shopInfoManager.selectByParentId(parent);
        level++;
        for (ErpShopInfo info : infoList) {
            DictOptionBean bean = new DictOptionBean();
            bean.setValue(info.getId());
            bean.setLabel(info.getShopName());
            if (level <= 3) {
                List<DictOptionBean> leafs = this.recursion(info.getId(), level);
                bean.setChildren(leafs);
            }
            list.add(bean);
        }
        return list;
    }
}
