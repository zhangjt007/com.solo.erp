package com.solo.erp.controller;

import com.solo.erp.common.bean.NameValueBean;
import com.solo.erp.common.dto.request.BaseQueryRequest;
import com.solo.erp.common.dto.response.BaseDetailViewResponse;
import com.solo.erp.common.dto.response.ChartResponse;
import com.solo.erp.common.dto.response.PanelDataResponse;
import com.solo.erp.common.dto.response.StatisticsCommonResp;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.manager.bo.LoginUserBO;
import com.solo.erp.manager.business.IStatisticsManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/stat")
public class StatisticsController extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(StatisticsController.class);
    @Autowired
    private IStatisticsManager statisticsManager;
    /**
     * 统计日期范围
     */
    private final int PERIOD_DAYS = 7;

    @RequestMapping(value = "/panel_data", method = RequestMethod.GET)
    @ResponseBody
    public PanelDataResponse panelData() {
        long start = System.currentTimeMillis();
        PanelDataResponse response = new PanelDataResponse();
        String startDate = LocalDate.now().minusDays(1).minusDays(PERIOD_DAYS).toString();
        String endDate = LocalDate.now().minusDays(1).toString();
        LoginUserBO bo = this.getSessionLoginUser();

        List<NameValueBean> amountSumList = new ArrayList<>();
        List<NameValueBean> productCountList = new ArrayList<>();
        List<NameValueBean> orderCountList = new ArrayList<>();
        List<NameValueBean> openVipCountList = new ArrayList<>();

        List<HashMap> orderList = statisticsManager.statisticsPeriodSale(startDate, endDate, bo);

        for (HashMap map : orderList) {
            NameValueBean amountSumBean = new NameValueBean();
            NameValueBean productCountBean = new NameValueBean();
            NameValueBean orderCountBean = new NameValueBean();
            amountSumBean.setName(map.get("order_date").toString());
            amountSumBean.setValue(map.get("sum_amount").toString());
            productCountBean.setName(map.get("order_date").toString());
            productCountBean.setValue(map.get("product_num").toString());
            orderCountBean.setName(map.get("order_date").toString());
            orderCountBean.setValue(map.get("order_count").toString());
            amountSumList.add(amountSumBean);
            productCountList.add(productCountBean);
            orderCountList.add(orderCountBean);
        }
        List<HashMap> vipList = statisticsManager.selectOpenVIPCountByPeriod(startDate, endDate, bo);
        for (HashMap map : vipList) {
            NameValueBean openVipCountBean = new NameValueBean();
            openVipCountBean.setName(map.get("create_date").toString());
            openVipCountBean.setValue(map.get("vip_count").toString());
            openVipCountList.add(openVipCountBean);
        }
        response.setAmountSumList(amountSumList);
        response.setOpenVipCountList(openVipCountList);
        response.setOrderCountList(orderCountList);
        response.setProductCountList(productCountList);
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage("获取信息成功");
        log.info("api/stat/panel_data-统计结束，耗时{}ms", System.currentTimeMillis() - start);

        return response;
    }

    @RequestMapping(value = "/rank/product", method = RequestMethod.GET)
    @ResponseBody
    public ChartResponse rankProduct() {
        long start = System.currentTimeMillis();
        ChartResponse response = new ChartResponse();
        String startDate = LocalDate.now().minusDays(1).minusDays(PERIOD_DAYS).toString();
        String endDate = LocalDate.now().minusDays(1).toString();
        LoginUserBO bo = this.getSessionLoginUser();
        /**TOP 10**/
        List<NameValueBean> result = this.statisticsManager.statisticTopSaleProduct(startDate, endDate, this.getSessionLoginUser(), 10);
        response.setData(result);
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage("获取信息成功");
        log.info("api/stat/rank/product-统计结束，耗时{}ms", System.currentTimeMillis() - start);

        return response;
    }

    @RequestMapping(value = "/group/product_type", method = RequestMethod.GET)
    @ResponseBody
    public ChartResponse groupProductType() {
        long start = System.currentTimeMillis();
        ChartResponse response = new ChartResponse();
        String startDate = LocalDate.now().minusDays(1).minusDays(PERIOD_DAYS).toString();
        String endDate = LocalDate.now().minusDays(1).toString();

        List<NameValueBean> result = this.statisticsManager.statisticsByProductType(startDate, endDate, this.getSessionLoginUser());
        response.setData(result);
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage("获取信息成功");
        log.info("api/stat/group/product_type-统计结束，耗时{}ms", System.currentTimeMillis() - start);
        return response;
    }

    @RequestMapping(value = "/order/time", method = RequestMethod.GET)
    @ResponseBody
    public BaseDetailViewResponse orderTime() {
        long start = System.currentTimeMillis();
        BaseDetailViewResponse response = new BaseDetailViewResponse();
        String startDate = LocalDate.now().minusDays(1).minusDays(PERIOD_DAYS).toString();
        String endDate = LocalDate.now().minusDays(1).toString();

        List<HashMap> result = this.statisticsManager.statisticsOrderTime(startDate, endDate, this.getSessionLoginUser());
        response.setData(result);
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage("获取信息成功");
        log.info("api/stat/order/time-统计结束，耗时{}ms", System.currentTimeMillis() - start);
        return response;
    }


    @RequestMapping(value = "/sale_report", method = RequestMethod.POST)
    @ResponseBody
    public StatisticsCommonResp saleReport(@RequestBody @Valid BaseQueryRequest req, final BindingResult result) {
        long start = System.currentTimeMillis();
        StatisticsCommonResp<List> response = new StatisticsCommonResp();

        List<HashMap> results = this.statisticsManager.statisticsSaleInfo(req.getStartDate().toString(), req.getEndDate().toString(), this.getSessionLoginUser());
        response.setData(results);
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage("获取信息成功");
        log.info("sale_report-统计结束，耗时{}ms", System.currentTimeMillis() - start);

        return response;
    }


    @RequestMapping(value = "/sale_vip_report", method = RequestMethod.POST)
    @ResponseBody
    public StatisticsCommonResp saleVipReport(@RequestBody @Valid BaseQueryRequest req, final BindingResult result) {
        long start = System.currentTimeMillis();
        StatisticsCommonResp<List> response = new StatisticsCommonResp();

        List<HashMap> results = this.statisticsManager.statisticsVIPSaleInfo(req.getStartDate().toString(), req.getEndDate().toString(), this.getSessionLoginUser());
        response.setData(results);
        response.setCode(EnumRespCode.SUCCESS.getCode());
        response.setMessage("获取信息成功");
        log.info("sale_vip_report-统计结束，耗时{}ms", System.currentTimeMillis() - start);

        return response;
    }
}
