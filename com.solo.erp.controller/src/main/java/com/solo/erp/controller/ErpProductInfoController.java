package com.solo.erp.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.ProductCreateRequest;
import com.solo.erp.common.dto.request.ProductImportRequest;
import com.solo.erp.common.dto.request.ProductQueryRequest;
import com.solo.erp.common.dto.request.ProductUpdateRequest;
import com.solo.erp.common.dto.response.BaseDetailViewResponse;
import com.solo.erp.common.dto.response.BaseQueryPageResponse;
import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.ProductParseUtil;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.dao.model.ErpProductInfo;
import com.solo.erp.manager.IErpProductInfoManager;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        String productNo = req.getProductNo();
        info.setProductNo(productNo);
        info.setColor(req.getColor());
        info.setProductImg(req.getProductImg());
        info.setProductName(req.getProductName());
        info.setProductThums(req.getProductThums());
        info.setBrandName(ProductParseUtil.parseBrandName(productNo));
        info.setYear(ProductParseUtil.parseYear(productNo));
        info.setProductType(ProductParseUtil.parseType(productNo));
        info.setSeason(ProductParseUtil.parseSession(productNo));
        info.setWaveBand(ProductParseUtil.parseWaveBand(productNo));
        info.setRemark(req.getRemark());
        info.setSize(req.getSize());
        info.setRealPrice(req.getRealPrice());
        info.setTagPrice(req.getTagPrice());
        info.setCostPrice(req.getCostPrice());
        info.setDiscount(info.getRealPrice().divide(info.getTagPrice(),2,BigDecimal.ROUND_DOWN).multiply(new BigDecimal(100)).intValue());
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

    @RequestMapping(value = "/import", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse batchImport(@RequestBody @Valid ProductImportRequest req, final BindingResult result) {
        checkError(result);
        BaseResponse resp = new BaseResponse();
        List<ErpProductInfo> list = new ArrayList<>();
        for (String bean : req.getList()) {
            JSONObject object = (JSONObject) JSONObject.parse(bean);
            String productNo = object.getString("款号");
            String productImg = object.getString("图片");
            String productName = object.getString("品名");
            String color = object.getString("颜色");
            String size = object.getString("尺码");
            BigDecimal tagPrice = object.getBigDecimal("吊牌价");
            BigDecimal costPrice = object.getBigDecimal("成本");
            String remark = object.getString("备注");

            ErpProductInfo info = new ErpProductInfo();
            info.setBrandName(ProductParseUtil.parseBrandName(productNo));
            info.setProductNo(productNo);
            info.setProductName(productName);
            info.setProductImg(productImg);
            info.setProductThums(productImg);
            info.setYear(ProductParseUtil.parseYear(productNo));
            info.setProductType(ProductParseUtil.parseType(productNo));
            info.setSeason(ProductParseUtil.parseSession(productNo));
            info.setWaveBand(ProductParseUtil.parseWaveBand(productNo));
            info.setRealPrice(tagPrice);
            info.setRemark(remark);
            info.setSize(size);
            info.setColor(color);
            info.setTagPrice(tagPrice);
            info.setRealPrice(tagPrice);
            info.setCostPrice(costPrice);
            info.setDiscount(info.getRealPrice().divide(info.getTagPrice(),2,BigDecimal.ROUND_DOWN).multiply(new BigDecimal(100)).intValue());
            info.setGmtCreate(new Date());
            info.setGmtModified(new Date());
            list.add(info);
        }
        try {
            erpProductInfoManager.batchInsert(list);
        } catch (ErpException e) {
            resp.setCode(e.getErrorCode());
            resp.setMessage(e.getErrorMsg());
        }

        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("导入产品信息成功，共计" + list.size() + "条");
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
        info.setColor(req.getColor());
        info.setSize(req.getSize());
        info.setProductImg(req.getProductImg());
        info.setProductName(req.getProductName());
        info.setProductThums(req.getProductThums());
        info.setRealPrice(req.getRealPrice());
        info.setTagPrice(req.getTagPrice());
        info.setCostPrice(req.getCostPrice());
        info.setDiscount(info.getRealPrice().divide(info.getTagPrice(),2,BigDecimal.ROUND_DOWN).multiply(new BigDecimal(100)).intValue());
        info.setRemark(req.getRemark());
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
