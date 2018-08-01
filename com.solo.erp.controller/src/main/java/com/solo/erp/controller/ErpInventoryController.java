package com.solo.erp.controller;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.InventoryQueryRequest;
import com.solo.erp.common.dto.request.InventoryUpdateRequest;
import com.solo.erp.common.dto.response.BaseDetailViewResponse;
import com.solo.erp.common.dto.response.BaseQueryPageResponse;
import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.dao.model.ErpInventoryInfo;
import com.solo.erp.manager.IErpInventoryManager;
import com.solo.erp.manager.bo.LoginUserBO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@RestController
@RequestMapping("/inventory")
public class ErpInventoryController extends BaseController {
    @Autowired
    IErpInventoryManager erpInventoryManager;

    private static final Logger log = LoggerFactory.getLogger(ErpVipInfoController.class);

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public BaseDetailViewResponse getByID(@PathVariable("id") Integer id) {
        BaseDetailViewResponse resp = new BaseDetailViewResponse();
        ErpInventoryInfo info = erpInventoryManager.selectById(id);
        resp.setData(info);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("获取信息成功");
        return resp;
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public BaseQueryPageResponse query(@RequestBody @Valid InventoryQueryRequest req, final BindingResult result) {
        checkError(result);
        BaseQueryPageResponse resp = new BaseQueryPageResponse();
        PageInfo page = erpInventoryManager.selectPage(req);
        BeanUtils.copyProperties(page, resp);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("查询成功");
        return resp;
    }

    @RequestMapping(value = "/stock_in/{product_sn}/num/{num}", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse stockIn(@PathVariable("product_sn") String product_sn, @PathVariable("num") Integer num) {
        BaseResponse resp = new BaseResponse();
        LoginUserBO bo = this.getSessionLoginUser();
        int count = 0;
        try {
            count = erpInventoryManager.stockIn(product_sn, num, bo.getShopId(), bo.getShopName());
        } catch (ErpException e) {
            resp.setCode(e.getErrorCode());
            resp.setMessage(e.getErrorMsg());
        }
        if (count == 0) {
            resp.setCode(EnumRespCode.SYSTEM_ERROR.getCode());
            resp.setMessage("新增库存失败，详情咨询管理员");
        } else {
            resp.setCode(EnumRespCode.SUCCESS.getCode());
            resp.setMessage("新增库存成功");
        }
        return resp;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse update(@RequestBody @Valid InventoryUpdateRequest req, final BindingResult result) {
        checkError(result);
        BaseResponse resp = new BaseResponse();
        int count = 0;
        ErpInventoryInfo info = new ErpInventoryInfo();
        info.setId(req.getId());
        info.setNum(req.getNum());
        info.setGmtModified(new Date());
        try {
            count = erpInventoryManager.update(info);
        } catch (ErpException e) {
            resp.setCode(e.getErrorCode());
            resp.setMessage(e.getErrorMsg());
        }
        if (count == 0) {
            resp.setCode(EnumRespCode.SYSTEM_ERROR.getCode());
            resp.setMessage("修改库存信息失败，详情咨询管理员");
        } else {
            resp.setCode(EnumRespCode.SUCCESS.getCode());
            resp.setMessage("修改库存信息成功");
        }
        return resp;
    }

}
