package com.huadi.exercise29.repository;

import com.huadi.exercise29.entity.Equipment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EquipmentRepository {
    //添加一个仪器，成功返回1，失败返回0
    int insert(Equipment equipment);

    //删除一个仪器，成功返回1，失败返回0
    int deleteById(int id);

    //返回所有仪器的List
    List<Equipment> selectAll();

}
