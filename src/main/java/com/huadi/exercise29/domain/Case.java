package com.huadi.exercise29.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Case {
    private int id; //案件编号
    private Long time; //案件添加时间
    private String name; //案件名称
}
