package com.huadi.exercise29.controller.mangementcontroller;

import com.huadi.exercise29.entity.Authentication;
import com.huadi.exercise29.repository.AuthenticationRepository;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AusmanagementControll {
    @Autowired
    private AuthenticationRepository au;

    @GetMapping("/ausmanage")
    public  String ausmanage(Model model){
        List<Authentication> authenticationList = au.selectAll();
        model.addAttribute("aus",authenticationList);
        return "/manage/admin-table";
    }

    @RequestMapping("/ausmanage/search")
    public String ausSearch(@RequestParam("userID") String ID, Model model){
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

    @DeleteMapping("/ausmanage/delete")
    public String ausdelete(@RequestParam("deleteID") String ID){
        au.deleteById(Integer.parseInt(ID));
        return "redirect:/manage/admin-table";
    }
}
