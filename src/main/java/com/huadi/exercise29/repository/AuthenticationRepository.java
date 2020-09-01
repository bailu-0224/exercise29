package com.huadi.exercise29.repository;

import com.huadi.exercise29.entity.Authentication;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AuthenticationRepository {
    int insert(Authentication au);
}
