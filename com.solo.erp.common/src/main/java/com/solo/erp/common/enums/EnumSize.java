package com.solo.erp.common.enums;

public enum EnumSize {
    S(1, "S"),
    M(2, "M"),
    L(3, "L"),
    XL(4, "XL"),
    XXL(5, "XXL"),
    XXXL(6, "XXXL"),
    F(9, "XXL");

    final private int code;
    final private String msg;

    EnumSize(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static EnumSize getEnumByCode(int code) {
        for (EnumSize type : values()) {
            if (type.getCode() == code)
                return type;
        }
        return null;
    }

    public static EnumSize getEnumByMsg(String msg) {
        if (msg == null) return null;
        for (EnumSize type : values()) {
            if (type.getMsg().equals(msg.trim()))
                return type;
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
