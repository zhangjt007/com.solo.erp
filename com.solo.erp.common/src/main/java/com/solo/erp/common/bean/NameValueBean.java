package com.solo.erp.common.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class NameValueBean implements Serializable {
    private String name;
    private String value;
}
