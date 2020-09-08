package com.huadi.exercise29.repository;

import com.huadi.exercise29.entity.FireCase;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FireCaseRepository {
    //插入一条案件记录，成功返回1，失败返回0
    int insert(FireCase c);

    //根据案件id删除一个案件，成功返回1，否则返回0
    int deleteById(int id);

    //返回所有的案件List
    List<FireCase> selectAll();
}
