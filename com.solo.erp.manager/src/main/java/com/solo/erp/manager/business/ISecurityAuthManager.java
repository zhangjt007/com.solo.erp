package com.solo.erp.manager.business;

public interface ISecurityAuthManager {
    /**
     * 密码登录
     *
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);

    /**
     * 更新缓存
     *
     * @param oldToken
     * @return
     */
    String refreshToken(String oldToken);

}
