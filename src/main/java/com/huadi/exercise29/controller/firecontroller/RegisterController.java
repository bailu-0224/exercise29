package com.huadi.exercise29.controller.firecontroller;

import com.huadi.exercise29.entity.Customer;
import com.huadi.exercise29.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Map;
@Controller
public class RegisterController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(value="/user/register")
    public String register(@RequestParam("name") String username,
                        @RequestParam("password") String password,
                        @RequestParam("number") String number,
                        @RequestParam("registerType") Integer registerType,
                        Map<String,Object> map)
    {
        String Type;
        if(customerRepository.selectByAccount(number)!=null) {
            System.out.println("ok!");
            map.put("msg1", "用户名已存在，请登录！");
            return "fire/register";
        }
       if(registerType==0)
       {
            Type="消防";
       }
       else if(registerType==1)
       {
            Type="司法";
       }
       else{
            Type="技术服务";
       }
       customerRepository.insert(new Customer(number,password,Type,username,1));
       return "fire/login";
    }
}
