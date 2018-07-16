package com.solo.erp.common.enums;

public enum EnumOrderStatus {

    WAITING_PAY("0", "待支付"),
    PAYED("1", "已支付");

    final private String code;
    final private String msg;

    EnumOrderStatus(String code, String msg) {
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
