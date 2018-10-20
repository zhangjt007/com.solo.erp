package com.solo.erp.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Unit test for simple App.
 */
public class BCryptPasswordTest {
    public static void main(String[] args) {
        String password = "111111";
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode(password));
    }
}
