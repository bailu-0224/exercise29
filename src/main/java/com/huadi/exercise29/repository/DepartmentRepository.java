package com.huadi.exercise29.repository;

import com.huadi.exercise29.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DepartmentRepository {
    //插入一个部门，成功返回1，失败返回0
    int insert(Department department);

    //通过部门id删除一个部门，成功返回1，失败返回0
    int deleteById(int id);

    //返回所有部门的List
    List<Department> selectAll();

}
