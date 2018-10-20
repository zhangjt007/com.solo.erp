package com.solo.erp.common.enums;

public enum EnumPayType {

    CASH("0", "现金支付"),
    ALI_PAY("1", "支付宝支付"),
    WECHAT_PAY("2", "微信支付"),
    SCORE_PAY("3", "积分支付"),
    CREDIT_PAY("4", "信用卡支付");

    final private String code;
    final private String msg;

    EnumPayType(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static EnumPayType getEnumByCode(String code) {
        for (EnumPayType type : values()) {
            if (type.getCode().equals(code))
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
