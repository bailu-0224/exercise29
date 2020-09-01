package com.huadi.exercise29.repository;

import com.huadi.exercise29.entity.FireCase;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface FireCaseRepository {
    int insert(FireCase c);
}
