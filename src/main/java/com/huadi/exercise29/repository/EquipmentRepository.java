package com.huadi.exercise29.repository;

import com.huadi.exercise29.entity.Equipment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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

    //查找id为id的设备借用者的工号，如果设备空闲，则返回“空闲”
    String selectEmpId(int id);

    //将id为id的设备的借用者工号设置为employeeId（登记设备借用），登记设备归还则传入参数serve的值为“空闲”即可，成功返回1，否则返回0
    int setEmpId(@Param("id")int id, @Param("serve")String serve);

}
