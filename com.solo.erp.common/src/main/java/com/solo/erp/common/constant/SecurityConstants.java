package com.solo.erp.common.constant;

/**
 * 常量
 */
public class SecurityConstants {

    public static final String SECRET = "XiaoChengYinXiangJWT";
    /**
     * 1 days
     */
    public static final long EXPIRATION_TIME = 864_000_00;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}
