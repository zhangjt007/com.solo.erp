package com.solo.erp.common.enums;

public enum EnumRespCode {

    SUCCESS(10000, "交易成功"),
    SYSTEM_ERROR(99999, "系统错误，请联系管理员"),
    SYSTEM_TIMEOUT(99998, "系统网络异常，请联系管理员"),
    INSERT_ERROR(99989, "新增数据失败，请联系管理员"),
    UPDATE_ERROR(99988, "更新数据失败，请联系管理员"),
    DELETE_ERROR(99987, "删除数据失败，请联系管理员"),
    DATA_ERROR(99987, "数据查询异常，请联系管理员"),

    LOGIN_FAILED(20000, "用户名或密码错误"),
    NOT_ACCESS(20001, "无相关访问权限"),
    SCORE_NOT_ENOUGH(20002, "积分余额不足");


    final private int code;
    final private String msg;

    EnumRespCode(int code, String msg) {
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
