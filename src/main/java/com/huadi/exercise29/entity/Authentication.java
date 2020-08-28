package com.huadi.exercise29.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authentication {
    private int id; //鉴定id（报告编号）
    private String type; //类型（消防/司法/技术）
    private int status; //鉴定的状态（1.受理委托、2.签订协议、3.收到物证/现场勘验、4.检查分析、5.撰写报告、6.邮寄报告)
    private String customerId; //申请鉴定的用户id
    private int caseId; //鉴定对应的案件id
    private int cost; //鉴定申请的费用
    private String item; //物证存放路径
    private String report; //报告存放路径
    private String expressNum; //邮寄单号
}
