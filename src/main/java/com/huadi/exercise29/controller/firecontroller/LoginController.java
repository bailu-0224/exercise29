package com.huadi.exercise29.controller.firecontroller;

import com.huadi.exercise29.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(value="/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map)
    {
        String password12 = customerRepository.checkPasswd(username);
        if(customerRepository.selectByAccount(username)==null)
        {
            map.put("msg3","账户不存在，请注册");
            return "fire/login";
        }

        if(!StringUtils.isEmpty(username) && password12.equals(password))
            return "fire/index";
        else {
            map.put("msg", "用户名密码错误");
            return "fire/login";
        }
    }
}
