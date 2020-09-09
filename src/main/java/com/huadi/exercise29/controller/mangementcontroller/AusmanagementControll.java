package com.huadi.exercise29.controller.mangementcontroller;

import com.huadi.exercise29.entity.Authentication;
import com.huadi.exercise29.repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AusmanagementControll {
    @Autowired
    private AuthenticationRepository au;

    @RequestMapping("/ausmanage")
    public String listAu(@RequestParam("userID")String ID, Model model){
        if(ID.isEmpty()) {
            List<Authentication> authenticationList = au.selectAll();
            model.addAttribute("aus", authenticationList);
            return "/manage/admin-table";
        }else{
            List<Authentication> authenticationList = au.selectByCustomer(ID);
            model.addAttribute("aus",authenticationList);
            return "/manage/admin-table";
        }
    }
}
