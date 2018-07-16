package com.solo.erp.controller;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.*;
import com.solo.erp.common.dto.response.BaseDetailViewResponse;
import com.solo.erp.common.dto.response.BaseQueryPageResponse;
import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.DateUtils;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.dao.model.ErpProductInfo;
import com.solo.erp.dao.model.ErpVipInfo;
import com.solo.erp.manager.IErpProductInfoManager;
import com.solo.erp.manager.IErpVipInfoManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

@RestController
@RequestMapping("/product")
public class ErpProductInfoController extends BaseController {

    @Autowired
    IErpProductInfoManager erpProductInfoManager;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public BaseDetailViewResponse getByID(@PathVariable("id") Integer id) {
        BaseDetailViewResponse resp = new BaseDetailViewResponse();
        ErpProductInfo info = erpProductInfoManager.selectById(id);
        resp.setData(info);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("获取信息成功");
        return resp;
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public BaseQueryPageResponse<ErpProductInfo> query(@RequestBody @Valid ProductQueryRequest req, final BindingResult result) {
        checkError(result);
        BaseQueryPageResponse resp = new BaseQueryPageResponse();
        PageInfo<ErpProductInfo> page = erpProductInfoManager.selectPage(req);
        BeanUtils.copyProperties(page, resp);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("查询成功");
        return resp;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse create(@RequestBody @Valid ProductCreateRequest req, final BindingResult result) {
        checkError(result);
        BaseResponse resp = new BaseResponse();
        int count = 0;
        ErpProductInfo info = new ErpProductInfo();
        info.setBrandName(req.getBrandName());
        info.setColor(req.getColor());
        info.setDiscount(req.getDiscount());
        info.setProductImg(req.getProductImg());
        info.setProductName(req.getProductName());
        info.setProductSn(req.getProductSn());
        info.setProductThums(req.getProductThums());
        info.setRealPrice(req.getRealPrice());
        info.setRemark(req.getRemark());
        info.setSize(req.getSize());
        info.setTagPrice(req.getTagPrice());
        info.setGmtCreate(new Date());
        info.setGmtModified(new Date());
        try {
            count = erpProductInfoManager.create(info);
        } catch (ErpException e) {
            resp.setCode(e.getErrorCode());
            resp.setMessage(e.getErrorMsg());
        }
        if (count == 0) {
            resp.setCode(EnumRespCode.SYSTEM_ERROR.getCode());
            resp.setMessage("新增产品信息失败，详情咨询管理员");
        } else {
            resp.setCode(EnumRespCode.SUCCESS.getCode());
            resp.setMessage("新增产品信息成功");
        }
        return resp;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse update(@RequestBody @Valid ProductUpdateRequest req, final BindingResult result) {
        checkError(result);
        BaseResponse resp = new BaseResponse();
        int count = 0;
        ErpProductInfo info = new ErpProductInfo();
        info.setId(req.getId());
        info.setBrandName(req.getBrandName());
        info.setColor(req.getColor());
        info.setDiscount(req.getDiscount());
        info.setProductImg(req.getProductImg());
        info.setProductName(req.getProductName());
        info.setProductSn(req.getProductSn());
        info.setProductThums(req.getProductThums());
        info.setRealPrice(req.getRealPrice());
        info.setRemark(req.getRemark());
        info.setSize(req.getSize());
        info.setTagPrice(req.getTagPrice());
        info.setGmtModified(new Date());
        try {
            count = erpProductInfoManager.update(info);
        } catch (ErpException e) {
            resp.setCode(e.getErrorCode());
            resp.setMessage(e.getErrorMsg());
        }
        if (count == 0) {
            resp.setCode(EnumRespCode.SYSTEM_ERROR.getCode());
            resp.setMessage("修改商品信息失败，详情咨询管理员");
        } else {
            resp.setCode(EnumRespCode.SUCCESS.getCode());
            resp.setMessage("修改商品信息成功");
        }
        return resp;
    }

}
