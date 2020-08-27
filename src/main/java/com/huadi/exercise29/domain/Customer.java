package com.huadi.exercise29.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String account; //账户
    private String password; //密码
    private String type; //类型（消防/司法/技术）
    private String name; //名字
    private int auth; //权限（1正常/0封禁）
}
