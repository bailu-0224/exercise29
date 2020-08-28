package com.huadi.exercise29.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipment {
    private int id; //仪器编号
    private String name; //仪器名称
    private String comment; //备注
    private String serve; //借用员工编号（仪器空闲时为0）
}
