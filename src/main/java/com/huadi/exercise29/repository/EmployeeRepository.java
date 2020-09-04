package com.huadi.exercise29.repository;

import com.huadi.exercise29.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface EmployeeRepository {
    //插入一个员工，成功返回1，失败返回0
    int insert(Employee employee);
}
