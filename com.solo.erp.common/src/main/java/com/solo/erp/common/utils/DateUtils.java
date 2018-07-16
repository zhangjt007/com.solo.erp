package com.solo.erp.common.utils;

import com.solo.erp.common.enums.EnumRespCode;
import com.solo.erp.common.exception.ErpException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    /**
     * 从字符串转换为Date
     *
     * @param date
     * @return
     */
    public static Date parse(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date result = sdf.parse(date);
        return result;
    }

    public static Date parseToStart(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date result = sdf.parse(date + "00:00:00");
        return result;
    }

    public static Date parseToEnd(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date result = sdf.parse(date + "23:59:59");
        return result;
    }

    public static String getCurrentDateTime() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(new Date());
    }

    public static void main(String[] args) {
        System.out.println(new Date());
    }
}
