package com.huadi.exercise29.repository;

import com.huadi.exercise29.entity.Equipment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface EquipmentRepository {
    //添加一个仪器，成功返回1，失败返回0
    int insert(Equipment equipment);

}
