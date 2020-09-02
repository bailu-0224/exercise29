package com.huadi.exercise29.controller;

import com.huadi.exercise29.entity.Authentication;
import com.huadi.exercise29.entity.FireCase;
import com.huadi.exercise29.repository.CustomerRepository;
import com.huadi.exercise29.repository.FireCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class FormController {
    @Autowired
    private FireCaseRepository AuthenticaRepository;

    @PostMapping(value = "/form")
    public String submit(@RequestParam("username") String username,
                         @RequestParam("id") String caseid,
                         @RequestParam("number") String phone_number,
                         @RequestParam("description") String description,
                         Map<String,Object> map)    //前端没给名字
    {

        int form_return = AuthenticaRepository.insert(new Authentication(caseid, username, description, phone_number));
        if (form_return == 1)
            map.put("msg", "提交成功");
        else
            map.put("msg", "提交失败，请重新提交");
        return "fire/form";
    }

}
