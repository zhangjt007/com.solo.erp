package com.solo.erp.controller;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.BaseQueryRequest;
import com.solo.erp.common.dto.request.VipInfoCreateRequest;
import com.solo.erp.common.dto.request.VipInfoQueryRequest;
import com.solo.erp.common.dto.request.VipInfoUpdateRequest;
import com.solo.erp.common.dto.response.BaseDetailViewResponse;
import com.solo.erp.common.dto.response.BaseQueryPageResponse;
import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.DateUtils;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.dao.model.ErpVipInfo;
import com.solo.erp.manager.IErpVipInfoManager;
import com.solo.erp.manager.bo.LoginUserBO;
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
@RequestMapping("/vip")
public class ErpVipInfoController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(ErpVipInfoController.class);
    @Autowired
    IErpVipInfoManager erpVipInfoManager;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public BaseDetailViewResponse getByID(@PathVariable("id") Integer id) {
        BaseDetailViewResponse resp = new BaseDetailViewResponse();
        ErpVipInfo info = erpVipInfoManager.selectById(id);
        resp.setData(info);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("获取信息成功");
        return resp;
    }

    @RequestMapping(value = "/mobile/{mobile}", method = RequestMethod.GET)
    @ResponseBody
    public BaseDetailViewResponse getByMobile(@PathVariable("mobile") String mobile) {
        BaseDetailViewResponse resp = new BaseDetailViewResponse();
        ErpVipInfo info = erpVipInfoManager.selectByMobile(mobile);
        resp.setData(info);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("获取信息成功");
        return resp;
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public BaseQueryPageResponse query(@RequestBody @Valid VipInfoQueryRequest req, final BindingResult result) {
        checkError(result);
        BaseQueryPageResponse resp = new BaseQueryPageResponse();
        PageInfo page = erpVipInfoManager.selectPage(req);
        BeanUtils.copyProperties(page, resp);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("查询成功");
        return resp;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public BaseDetailViewResponse<ErpVipInfo> create(@RequestBody @Valid VipInfoCreateRequest req, final BindingResult result) {
        checkError(result);
        BaseDetailViewResponse resp = new BaseDetailViewResponse();
        LoginUserBO bo = getSessionLoginUser();
        int count = 0;
        ErpVipInfo info = new ErpVipInfo();
        info.setAddress(req.getAddress());
        info.setBrithday(req.getBrithday());
        info.setEmail(req.getEmail());
        info.setGmtCreate(new Date());
        info.setHistoryScore(BigDecimal.ZERO);
        info.setIsEnable(true);
        info.setMobile(req.getMobile());
        info.setRemark(req.getRemark());
        info.setScore(BigDecimal.ZERO);
        info.setSex(req.getSex());
        info.setCreateDate(new Date());
        info.setGmtModified(new Date());
        info.setStaffId(bo.getId());
        info.setStaffName(bo.getName());
        info.setUserName(req.getUserName());
        info.setVipRefereeMobile(req.getVipRefereeMobile());
        try {
            count = erpVipInfoManager.create(info);
        } catch (ErpException e) {
            resp.setCode(e.getErrorCode());
            resp.setMessage(e.getErrorMsg());
        }
        if (count == 0) {
            resp.setCode(EnumRespCode.SYSTEM_ERROR.getCode());
            resp.setMessage("新增VIP用户失败，详情咨询管理员");
        } else {
            resp.setCode(EnumRespCode.SUCCESS.getCode());
            resp.setMessage("新增VIP用户成功");
        }
        return resp;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse update(@RequestBody @Valid VipInfoUpdateRequest req, final BindingResult result) {
        checkError(result);
        BaseResponse resp = new BaseResponse();
        int count = 0;
        ErpVipInfo info = new ErpVipInfo();
        info.setAddress(req.getAddress());
        info.setBrithday(req.getBrithday());
        info.setId(req.getId());
        info.setEmail(req.getEmail());
        info.setIsEnable(true);
        info.setMobile(req.getMobile());
        info.setRemark(req.getRemark());
        info.setSex(req.getSex());
        info.setGmtModified(new Date());
        info.setUserName(req.getUserName());
        info.setVipRefereeMobile(req.getVipRefereeMobile());
        try {
            count = erpVipInfoManager.update(info);
        } catch (ErpException e) {
            resp.setCode(e.getErrorCode());
            resp.setMessage(e.getErrorMsg());
        }
        if (count == 0) {
            resp.setCode(EnumRespCode.SYSTEM_ERROR.getCode());
            resp.setMessage("修改VIP用户失败，详情咨询管理员");
        } else {
            resp.setCode(EnumRespCode.SUCCESS.getCode());
            resp.setMessage("修改VIP用户成功");
        }
        return resp;
    }

}
