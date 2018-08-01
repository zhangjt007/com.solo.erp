package com.solo.erp.controller;

import com.solo.erp.common.dto.request.StaffInfoCreateRequest;
import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.dto.response.LoginUserInfoResponse;
import com.solo.erp.common.dto.response.StaffRegisterResponse;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.common.dto.request.JwtAuthenticationRequest;
import com.solo.erp.common.dto.response.JwtAuthenticationResponse;
import com.solo.erp.dao.model.ErpStaffInfo;
import com.solo.erp.manager.IErpStaffManager;
import com.solo.erp.manager.ISecurityAuthManager;
import com.solo.erp.manager.bo.LoginUserBO;
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

    @Autowired
    IErpStaffManager staffManager;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    ISecurityAuthManager securityAuthManager;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public StaffRegisterResponse register(@RequestBody @Valid StaffInfoCreateRequest req, final BindingResult result) {
        checkError(result);
        StaffRegisterResponse resp = new StaffRegisterResponse();
        ErpStaffInfo registerStaff = new ErpStaffInfo();
        registerStaff.setLoginName(req.getLoginName());
        registerStaff.setLoginPwd(bCryptPasswordEncoder.encode(req.getLoginPwd()));
        registerStaff.setMobile(req.getMobile());
        registerStaff.setStaffName(req.getStaffName());
        registerStaff.setStaffPhoto(req.getStaffPhoto());
        registerStaff.setAddress(req.getAddress());
        registerStaff.setShopId(Integer.parseInt(req.getShopId()));
        registerStaff.setIsEnable(true);
        registerStaff.setGmtCreate(new Date());
        registerStaff.setGmtModified(new Date());
        //生成编号
        String staffNo = staffManager.genStaffNo();
        registerStaff.setStaffNo(staffNo);
        staffManager.insertStaff(registerStaff);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("注册成功");
        resp.setStaffNo(staffNo);
        return resp;
    }

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
}
