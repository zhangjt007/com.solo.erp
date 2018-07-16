package com.solo.erp.manager.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
public class UrlRoleRelBO implements Serializable {
    private String url;
    private Set<String> roles;
}
