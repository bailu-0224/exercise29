package com.huadi.exercise29.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private int id; //部门编号
    private String name; //部门名称
    private String leader; //负责人姓名
    private String phone; //负责人电话
    private Long time; //部门建立时间
}
