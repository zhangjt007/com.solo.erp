package com.solo.erp.controller;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.*;
import com.solo.erp.common.dto.response.*;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.RandomUtils;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.dao.model.ErpShopInfo;
import com.solo.erp.dao.model.ErpStaffInfo;
import com.solo.erp.manager.IErpShopInfoManager;
import com.solo.erp.manager.IErpStaffManager;
import com.solo.erp.manager.ISecurityAuthManager;
import com.solo.erp.manager.bo.LoginUserBO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static com.solo.erp.common.constant.SecurityConstants.TOKEN_PREFIX;

@RestController
@RequestMapping("/user")
public class ErpStaffController extends BaseController {

    private static final String STAFF_PHOTE = "images/avatar/default_avatar.gif";

    @Autowired
    IErpStaffManager staffManager;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    ISecurityAuthManager securityAuthManager;
    @Autowired
    IErpShopInfoManager shopInfoManager;

    /**
     * 用户登录
     *
     * @return 操作结果
     * @throws AuthenticationException 错误信息
     */
    @PostMapping(value = "/login")
    public JwtAuthenticationResponse login(@RequestBody JwtAuthenticationRequest authenticationRequest) throws AuthenticationException {
        String token = securityAuthManager.login(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        JwtAuthenticationResponse response = new JwtAuthenticationResponse();
        response.setToken(TOKEN_PREFIX + token);
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage(EnumRespCode.SUCCESS.getMsg());
        return response;
    }

    @GetMapping(value = "/logout")
    public BaseResponse logout() throws AuthenticationException {
        BaseResponse respDTO = new BaseResponse();
        respDTO.setCode(EnumRespCode.SUCCESS.getCode());
        respDTO.setMessage(EnumRespCode.SUCCESS.getMsg());
        return respDTO;
    }

    /**
     * 刷新密钥
     *
     * @return 新密钥
     * @throws AuthenticationException 错误信息
     */
    @GetMapping(value = "/refresh_token")
    public String refreshToken(@RequestHeader String authorization) throws AuthenticationException {
        return securityAuthManager.refreshToken(authorization);
    }

    @GetMapping("/info")
    public LoginUserInfoResponse fetchUserInfo() {
        LoginUserBO bo = this.getSessionLoginUser();
        LoginUserInfoResponse response = new LoginUserInfoResponse();
        response.setName(bo.getName());
        Set roles = new HashSet();
        roles.add(bo.getRole());
        response.setRoles(roles);
        response.setAvatar(bo.getStaffPhoto());
        response.setShopName(bo.getShopName());
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage(EnumRespCode.SUCCESS.getMsg());
        return response;
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public BaseQueryPageResponse query(@RequestBody @Valid StaffQueryRequest req, final BindingResult result) {
        checkError(result);
        BaseQueryPageResponse resp = new BaseQueryPageResponse();
        PageInfo page = staffManager.selectPage(req);
        BeanUtils.copyProperties(page, resp);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("查询成功");
        return resp;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse create(@RequestBody @Valid StaffCreateRequest req, final BindingResult result) {
        checkError(result);
        BaseResponse resp = new BaseResponse();
        ErpStaffInfo staff = new ErpStaffInfo();
        String staffNo = staffManager.genStaffNo();
        staff.setStaffNo(staffNo);
        staff.setStaffName(req.getStaffName());
        staff.setStaffPhoto(STAFF_PHOTE);
        staff.setAddress(req.getAddress());
        staff.setMobile(req.getMobile());
        staff.setSex(req.getSex());
        staff.setIsEnable(true);
        staff.setBrithday(req.getBrithday());
        staff.setLoginName(staff.getStaffNo());
        String pwd = RandomUtils.genRandomPwd(6);
        staff.setLoginPwd(bCryptPasswordEncoder.encode(pwd));
        staff.setGmtModified(new Date());
        staff.setGmtCreate(new Date());
        ErpShopInfo shop = shopInfoManager.selectById(req.getShopId());
        staff.setShopName(shop.getShopName());
        staff.setShopId(shop.getId());
        if (req.getRoles().isEmpty()) {
            throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "用户角色不能为空");
        } else {
            this.staffManager.register(staff, req.getRoles());
        }
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("新职员注册成功，工号：" + staffNo + ";密码：" + pwd);
        return resp;
    }

    @RequestMapping(value = "/resetPwd", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse resetPwd(@RequestBody @Valid StaffResetPwdRequest req, final BindingResult result) {
        checkError(result);
        BaseResponse resp = new BaseResponse();
        String newPwd = bCryptPasswordEncoder.encode(req.getNewPwd());
        LoginUserBO bo = this.getSessionLoginUser();
        if (!bCryptPasswordEncoder.matches(req.getOldPwd(),bo.getPassword())){
            throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(),"原密码不正确，重置密码失败");
        }
        ErpStaffInfo staff = new ErpStaffInfo();
        staff.setId(bo.getId());
        staff.setLoginPwd(newPwd);
        this.staffManager.update(staff);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("密码重置成功");
        return resp;
    }
}
