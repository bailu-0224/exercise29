package com.huadi.exercise29.reopsitory;

import com.huadi.exercise29.domain.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CustomerRepository {
    int insert(Customer customer);

}
