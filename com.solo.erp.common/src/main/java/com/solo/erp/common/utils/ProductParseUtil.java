package com.solo.erp.common.utils;

import com.solo.erp.common.enums.EnumSize;

import java.util.Calendar;

/**
 * 品牌（1）-年份（1）-季节（1）-波段（1）-品类（1）-序列号（2）-颜色（2）-尺码（1）
 */
public class ProductParseUtil {


    public static String parseBrandName(String productSn) {
        return productSn.substring(0, 1);
    }

    public static int parseYear(String productSn) {
        int parseYear = Integer.parseInt(productSn.substring(1, 2));
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int result = year;
        while (true) {
            result = result - result % 10 + parseYear;
            if (result >= year) {
                break;
            } else {
                result = result + 10;
            }
        }
        return result;
    }

    public static int parseSession(String productSn) {
        return Integer.parseInt(productSn.substring(2, 3));
    }

    public static int parseWaveBand(String productSn) {
        return Integer.parseInt(productSn.substring(3, 4));
    }

    public static String parseType(String productSn) {
        return productSn.substring(4, 5);
    }

    public static String parseColor(String productSn) {
        return productSn.substring(7, 9);
    }

    public static int parseSize(String productSn) {
        return EnumSize.getEnumByMsg(productSn.substring(9)).getCode();
    }

    public static String parseProductNo(String productSn) {
        return productSn.substring(0, 7);
    }
}
