package com.solo.erp.common.enums;

public enum EnumBool {

    FALSE(0, "假"),
    TRUE(1, "真");


    final private int code;
    final private String msg;

    EnumBool(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
