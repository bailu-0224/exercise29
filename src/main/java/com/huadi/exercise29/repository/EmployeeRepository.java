package com.huadi.exercise29.repository;

import com.huadi.exercise29.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
@Mapper
public interface EmployeeRepository {
    //插入一个员工，成功返回1，失败返回0
    int insert(Employee employee);

    //根据id删除一个员工，成功返回1，失败返回0
    int deleteById(String id);

    //返回所有员工列表
    List<Employee> getall();
}
