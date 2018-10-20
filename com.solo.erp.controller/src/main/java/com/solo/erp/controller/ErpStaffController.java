package com.solo.erp.controller;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.JwtAuthenticationRequest;
import com.solo.erp.common.dto.request.StaffCreateRequest;
import com.solo.erp.common.dto.request.StaffQueryRequest;
import com.solo.erp.common.dto.request.StaffResetPwdRequest;
import com.solo.erp.common.dto.response.BaseQueryPageResponse;
import com.solo.erp.common.dto.response.BaseResponse;
import com.solo.erp.common.dto.response.JwtAuthenticationResponse;
import com.solo.erp.common.dto.response.LoginUserInfoResponse;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;
import com.solo.erp.common.utils.RandomUtils;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.dao.model.ErpShopInfo;
import com.solo.erp.dao.model.ErpStaffInfo;
import com.solo.erp.manager.business.IErpShopInfoManager;
import com.solo.erp.manager.business.IErpStaffManager;
import com.solo.erp.manager.business.ISecurityAuthManager;
import com.solo.erp.manager.bo.LoginUserBO;
import com.solo.erp.manager.facade.IStaffLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import static com.solo.erp.common.constant.SecurityConstants.TOKEN_PREFIX;

@RestController
@RequestMapping("/api/user")
public class ErpStaffController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(ErpStaffController.class);

    private static final String STAFF_PHOTE = "images/avatar/default_avatar.gif";

    @Autowired
    private IErpStaffManager staffManager;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private ISecurityAuthManager securityAuthManager;
    @Autowired
    private IErpShopInfoManager shopInfoManager;
    @Autowired
    private IStaffLoginService staffLoginService;

    /**
     * 用户登录
     *
     * @return 操作结果
     * @throws AuthenticationException 错误信息
     */
    @PostMapping(value = "/login")
    public JwtAuthenticationResponse login(@RequestBody JwtAuthenticationRequest authenticationRequest) throws AuthenticationException {
        long start = System.currentTimeMillis();
        String token = securityAuthManager.login(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        JwtAuthenticationResponse response = new JwtAuthenticationResponse();
        response.setToken(TOKEN_PREFIX + token);
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage(EnumRespCode.SUCCESS.getMsg());
        log.info("/api/user/login，耗时{}ms", System.currentTimeMillis() - start);
        return response;
    }

    @GetMapping(value = "/logout")
    public BaseResponse logout() throws AuthenticationException {
        long start = System.currentTimeMillis();
        BaseResponse respDTO = new BaseResponse();
        respDTO.setCode(EnumRespCode.SUCCESS.getCode());
        respDTO.setMessage(EnumRespCode.SUCCESS.getMsg());
        log.info("/api/user/logout，耗时{}ms", System.currentTimeMillis() - start);
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
        long start = System.currentTimeMillis();
        String token=  securityAuthManager.refreshToken(authorization);
        log.info("/api/user/refresh_token，耗时{}ms", System.currentTimeMillis() - start);
        return token;
    }

    @GetMapping("/info")
    public LoginUserInfoResponse fetchUserInfo() {
        long start = System.currentTimeMillis();
        LoginUserBO bo = this.getSessionLoginUser();
        LoginUserInfoResponse response = new LoginUserInfoResponse();
        response.setName(bo.getName());
        response.setRoles(bo.getRoles());
        response.setAvatar(bo.getStaffPhoto());
        response.setShopName(bo.getShopName());
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage(EnumRespCode.SUCCESS.getMsg());
        log.info("/api/user/info，耗时{}ms", System.currentTimeMillis() - start);
        return response;
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public BaseQueryPageResponse query(@RequestBody @Valid StaffQueryRequest req, final BindingResult result) {
        long start = System.currentTimeMillis();
        checkError(result);
        BaseQueryPageResponse resp = new BaseQueryPageResponse();
        PageInfo page = staffManager.selectPage(req);
        BeanUtils.copyProperties(page, resp);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("查询成功");
        log.info("/api/user/query，耗时{}ms", System.currentTimeMillis() - start);
        return resp;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse create(@RequestBody @Valid StaffCreateRequest req, final BindingResult result) {
        long start = System.currentTimeMillis();
        checkError(result);
        BaseResponse resp = new BaseResponse();
        ErpStaffInfo staff = new ErpStaffInfo();
        String staffNo = staffManager.genStaffNo();
        staff.setStaffNo(staffNo);
        staff.setStaffName(req.getStaffName());
        staff.setStaffPhoto(STAFF_PHOTE);
        staff.setAddress(req.getAddress());
        staff.setMobile(req.getMobile());
        staff.setCertNo(req.getCertNo());
        staff.setSex(req.getSex());
        staff.setIsEnable(true);
        staff.setBrithday(req.getBrithday());
        staff.setLoginName(staff.getStaffNo());
        String pwd = RandomUtils.genRandomPwd(6);
        staff.setLoginPwd(bCryptPasswordEncoder.encode(pwd));
        staff.setGmtModified(LocalDateTime.now());
        staff.setGmtCreate(LocalDateTime.now());
        ErpShopInfo shop = shopInfoManager.selectById(req.getShopId());
        staff.setShopName(shop.getShopName());
        staff.setShopId(shop.getId());
        if (req.getRoles().isEmpty()) {
            throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "用户角色不能为空");
        } else {
            this.staffLoginService.register(staff, req.getRoles());
        }
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("新职员注册成功，工号：" + staffNo + ";密码：" + pwd);
        log.info("/api/user/create，耗时{}ms", System.currentTimeMillis() - start);
        return resp;
    }

    @RequestMapping(value = "/resetPwd", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse resetPwd(@RequestBody @Valid StaffResetPwdRequest req, final BindingResult result) {
        long start = System.currentTimeMillis();
        checkError(result);
        BaseResponse resp = new BaseResponse();
        String newPwd = bCryptPasswordEncoder.encode(req.getNewPwd());
        LoginUserBO bo = this.getSessionLoginUser();
        if (!bCryptPasswordEncoder.matches(req.getOldPwd(), bo.getPassword())) {
            throw new ErpException(EnumRespCode.SYSTEM_ERROR.getCode(), "原密码不正确，重置密码失败");
        }
        ErpStaffInfo staff = new ErpStaffInfo();
        staff.setId(bo.getId());
        staff.setLoginPwd(newPwd);
        this.staffManager.update(staff);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("密码重置成功");
        log.info("/api/user/resetPwd，耗时{}ms", System.currentTimeMillis() - start);
        return resp;
    }
}
