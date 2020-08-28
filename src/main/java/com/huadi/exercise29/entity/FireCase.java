package com.huadi.exercise29.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FireCase {
    private int id; //案件编号
    private long time; //案件添加时间
    private String name; //案件名称(火场名称)
}
