package com.solo.erp.common.utils;

import java.util.Random;

public class RandomUtils {

    public static String genRandomPwd(int length) {
        Random random = new Random();
        String[] array = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < length; i++) {
            result.append(array[random.nextInt(10)]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.print(genRandomPwd(6));
    }
}
