package com.solo.erp.common.enums;

public enum EnumProductType {
    W("W", "外套"),
    L("L", "连衣裙"),
    K("K", "裤子"),
    Q("Q", "裙子"),
    F("F", "风衣"),
    T("T", "T恤"),
    M("M", "毛衣"),
    C("C", "衬衫"),
    Y("Y", "羽绒服"),;
    final private String code;
    final private String msg;

    EnumProductType(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static EnumProductType getEnumByCode(String code) {
        for (EnumProductType type : values()) {
            if (type.getCode().equals(code))
                return type;
        }
        return null;
    }

    public static EnumProductType getEnumByMsg(String msg) {
        if (msg == null) return null;
        for (EnumProductType type : values()) {
            if (type.getMsg().equals(msg.trim()))
                return type;
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
