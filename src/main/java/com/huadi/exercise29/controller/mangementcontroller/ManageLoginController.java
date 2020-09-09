package com.huadi.exercise29.controller.mangementcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

@Controller
public class ManageLoginController {

    @PostMapping(value="/manage/login")
    public String login(@RequestParam("adminname") String name,
                        @RequestParam("adminpassword") String password,
                        Map<String,Object> map)
    {

        if(name.equals("123@xidian.com") && password.equals("123456"))
            return "manage/admin-index";
        else {
            map.put("msg", "用户名密码错误");
            return "manage/index";
        }
    }
}