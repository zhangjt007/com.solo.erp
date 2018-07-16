package com.solo.erp.common.enums;

public enum EnumEnable {

    SUCCESS("0", "失败"),
    SYS_ERROR("1", "成功");


    final private String code;
    final private String msg;

    EnumEnable(String code, String msg) {
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
