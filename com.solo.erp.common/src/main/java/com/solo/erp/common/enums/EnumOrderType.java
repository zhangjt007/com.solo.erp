package com.solo.erp.common.enums;

public enum EnumOrderType {

    PAY("0", "支付订单"),
    REFUND("1", "退款订单");

    final private String code;
    final private String msg;

    EnumOrderType(String code, String msg) {
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
