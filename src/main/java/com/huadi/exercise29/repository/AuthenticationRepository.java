package com.huadi.exercise29.repository;

import com.huadi.exercise29.entity.Authentication;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AuthenticationRepository {
    // 添加一条鉴定申请
    int insert(Authentication au);

    //通过鉴定id查找一条鉴定申请，如果id不存在，返回null
    Authentication selectById(int id);

    //返回所有鉴定申请数据的List
    List<Authentication> selectAll();

    //返回一个用户申请的所有鉴定的List
    List<Authentication> selectByCustomer(String customerId);

    //将id为id的鉴定的状态更新为status，成功返回1，否则返回0
    int setStatus(@Param("id")int id, @Param("status")int status);

    //将id为id的鉴定的费用更新为cost，成功返回1，否则返回0
    int setCost(@Param("id")int id, @Param("cost")int cost);

    //将id为id的鉴定的物证路径更新为item，成功返回1，否则返回0
    int setItem(@Param("id")int id, @Param("item")String item);

    //将id为id的鉴定的报告地址更新为report，成功返回1，否则返回0
    int setReport(@Param("id")int id, @Param("report")String report);

    //将id为id的鉴定的快递单号更新为expressNum，成功返回1，否则返回0
    int setExpress(@Param("id")int id, @Param("expressNum")String expressNum);


}
