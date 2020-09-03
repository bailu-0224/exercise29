package com.huadi.exercise29.controller;

import com.huadi.exercise29.Service.AuthService;
import com.huadi.exercise29.entity.Authentication;
import com.huadi.exercise29.entity.FireCase;
import com.huadi.exercise29.repository.CustomerRepository;
import com.huadi.exercise29.repository.FireCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class FormController {

    @PostMapping(value = "/form")
    public String submit(@RequestParam("username") String username,
                         @RequestParam("id") int caseid,
                         @RequestParam("number") String phone_number,
                         @RequestParam("description") String description,
                         Model model)
    {

        int num_Auth = AuthService.insert(new Authentication(0,"消防","头盔","哈哈哈。",1,"asfds",1,200,"asd","dasd","123456"));
        if (num_Auth == 1)
            model.addAttribute("msg", "提交成功");
        else
            model.addAttribute("msg", "提交失败，请重新提交");
        return "fire/form";
    }

}
