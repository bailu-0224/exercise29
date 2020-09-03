package com.huadi.exercise29.Service;

import com.huadi.exercise29.entity.Authentication;
import com.huadi.exercise29.repository.AuthenticationRepository;
import com.huadi.exercise29.repository.CustomerRepository;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthService {

    @Autowired
    private static AuthenticationRepository authenticationRepository;

    // 添加一条鉴定申请
    public static int insert(Authentication au) {
        return authenticationRepository.insert(au);
    }

    //通过鉴定id查找一条鉴定申请，如果id不存在，返回null
    static Authentication selectById(int id) {
        return authenticationRepository.selectById(id);
    }

    //返回所有鉴定申请数据的List
    static List<Authentication> selectAll() {
        return authenticationRepository.selectAll();
    }

    //返回一个用户申请的所有鉴定的List
    static List<Authentication> selectByCustomer(String customerId) {
        return authenticationRepository.selectByCustomer(customerId);
    }

    //将id为id的鉴定的状态更新为status，成功返回1，否则返回0
    static int setStatus(@Param("id") int id, @Param("status") int status) {
        return authenticationRepository.setStatus(id, status);
    }

    //将id为id的鉴定的费用更新为cost，成功返回1，否则返回0
    static int setCost(@Param("id") int id, @Param("cost") int cost) {
        return authenticationRepository.setCost(id, cost);
    }

    //将id为id的鉴定的物证路径更新为item，成功返回1，否则返回0
    static int setItem(@Param("id") int id, @Param("item") String item) {
        return authenticationRepository.setItem(id, item);
    }

    //将id为id的鉴定的报告地址更新为report，成功返回1，否则返回0
    static int setReport(@Param("id") int id, @Param("report") String report) {
        return authenticationRepository.setReport(id, report);
    }

    //将id为id的鉴定的快递单号更新为expressNum，成功返回1，否则返回0
    static int setExpress(@Param("id") int id, @Param("expressNum") String expressNum) {
        return authenticationRepository.setExpress(id, expressNum);
    }

}
