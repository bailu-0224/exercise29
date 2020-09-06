package com.huadi.exercise29.repository;

import com.huadi.exercise29.entity.FireCase;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface FireCaseRepository {
    //插入一条案件记录，成功返回1，失败返回0
    int insert(FireCase c);
}
