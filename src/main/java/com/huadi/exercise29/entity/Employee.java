package com.huadi.exercise29.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String id; //员工工号
    private String name; //员工姓名
    private int deptId; //所属部门编号
    private String deptName;//所属部门名称
    private String duty; //职位
    private String addTime;//加入时间
}
