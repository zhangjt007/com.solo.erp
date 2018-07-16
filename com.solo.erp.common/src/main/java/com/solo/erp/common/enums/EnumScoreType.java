package com.solo.erp.common.enums;

public enum EnumScoreType {

    ORDER("0", "订单奖励"),
    REFERRER("1", "推荐奖励"),
    PAY("2", "积分消费"),
    REVERSE("3", "积分冲正");

    final private String code;
    final private String msg;

    EnumScoreType(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
