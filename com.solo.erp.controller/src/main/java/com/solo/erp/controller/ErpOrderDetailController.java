package com.solo.erp.controller;

import com.github.pagehelper.PageInfo;
import com.solo.erp.common.dto.request.OrderDetailQueryRequest;
import com.solo.erp.common.dto.request.OrderInfoQueryRequest;
import com.solo.erp.common.dto.response.BaseQueryPageResponse;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.dao.model.ErpOrderDetail;
import com.solo.erp.dao.model.ErpOrderInfo;
import com.solo.erp.manager.business.IErpOrderDetailManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/order_detail")
public class ErpOrderDetailController extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(ErpOrderDetailController.class);
    @Autowired
    private IErpOrderDetailManager orderDetailManager;

    /**
     * 根据查询条件分页查询订单信息
     *
     * @param req
     * @param result
     * @return
     */
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public BaseQueryPageResponse<ErpOrderDetail> query(@RequestBody @Valid OrderDetailQueryRequest req, final BindingResult result) {
        long start = System.currentTimeMillis();
        checkError(result);
        BaseQueryPageResponse resp = new BaseQueryPageResponse();
        PageInfo<ErpOrderDetail> page = orderDetailManager.selectPage(req);
        BeanUtils.copyProperties(page, resp);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("查询成功");
        log.info("/api/order/query，耗时{}ms", System.currentTimeMillis() - start);
        return resp;
    }
}
