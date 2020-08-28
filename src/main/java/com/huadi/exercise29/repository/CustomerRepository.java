package com.huadi.exercise29.repository;

import com.huadi.exercise29.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CustomerRepository {

    //插入一个用户
    int insert(Customer customer);

    //删除一个用户
    int delete(String account);

    //通过账户名查找一个用户,如果用户不存在，返回 null
    Customer selectByAccount(String account);

    //通过账户名查看一个用户的密码
    String checkPasswd(String account);

    //将一个用户的权限改为0（封禁）
    int ban(String account);

    //将一个用户的权限改为1
    int unban(String account);
}
