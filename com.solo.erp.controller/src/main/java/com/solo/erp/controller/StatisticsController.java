package com.solo.erp.controller;

import com.solo.erp.common.dto.response.PanelDataResponse;
import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.controller.base.BaseController;
import com.solo.erp.manager.IStatisticsManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/stat")
public class StatisticsController extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(StatisticsController.class);
    @Autowired
    private IStatisticsManager statisticsManager;

    @RequestMapping(value = "/panel_data", method = RequestMethod.GET)
    @ResponseBody
    public PanelDataResponse panelGroup() {
        long start = System.currentTimeMillis();
        //初始化容器
        List<String> xAxis = new ArrayList<>();
        List<String> amountSum = new ArrayList<>();
        List<String> productCount = new ArrayList<>();
        List<String> orderCount = new ArrayList<>();
        List<String> openVipCount = new ArrayList<>();
        for (int i = 6; i >= 0; i--) {
            LocalDate date = LocalDate.now().plusDays(i * (-1));
            String dateStr = date.toString();
            String week = date.getDayOfWeek().toString();
            xAxis.add(week);
            boolean isCashe = i == 0 ? false : true;
            HashMap orderSumMap = statisticsManager.selectTodaySaleOrderInfo(dateStr, isCashe);
            String amount = orderSumMap.get("sum_amount") != null ? orderSumMap.get("sum_amount").toString() : "0";
            amountSum.add(amount);
            orderCount.add(orderSumMap.get("order_count").toString());
            HashMap productCountMap = statisticsManager.selectTodaySaleProductCount(dateStr, isCashe);
            String count = productCountMap != null && productCountMap.get("sum_product_num") != null ? productCountMap.get("sum_product_num").toString() : "0";
            productCount.add(count);
            HashMap openVipCountMap = statisticsManager.selectTodayOpenVipCount(dateStr, isCashe);
            openVipCount.add(openVipCountMap.get("vip_count").toString());
        }
        PanelDataResponse resp = new PanelDataResponse();
        resp.setAmountSumList(amountSum);
        resp.setOpenVipCountList(openVipCount);
        resp.setOrderCountList(orderCount);
        resp.setProductCountList(productCount);
        resp.setXAxisList(xAxis);
        resp.setCode(EnumRespCode.SUCCESS.getCode());
        resp.setMessage("获取信息成功");
        log.info("panelGroup-统计结束，耗时{}ms", System.currentTimeMillis() - start);
        return resp;
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.now().plusDays(-6);
        System.out.println(start);
    }
}
