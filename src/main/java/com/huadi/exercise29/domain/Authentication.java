package com.huadi.exercise29.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authentication {
    private int id; //鉴定id
    private int customerId; //申请鉴定的用户id
    private String type; //类型（消防/司法/技术）
    private short status; //鉴定的状态（1.受理委托、2.签订协议、3.收到物证/现场勘验、4.检查分析、5.撰写报告、6.邮寄报告)
    private int cost; //鉴定申请的费用
    private String item; //物证存放路径
    private String report; //报告存放路径
    private String expressId; //邮寄单号
}
