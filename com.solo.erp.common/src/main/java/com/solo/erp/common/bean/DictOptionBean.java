package com.solo.erp.common.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class DictOptionBean<T> implements Serializable {
    private String label;
    private T value;
    private List<DictOptionBean> children;
}
