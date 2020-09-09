package com.huadi.exercise29.controller.firecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping({"/","/fire/login","/login.html"})
    public String login()
    {
        return "fire/login";
    }
    @RequestMapping({"/register.html","/user/register.html"})
    public String register()
    {

        return "fire/register";
    }
    @RequestMapping({"/user/form.html"})
    public String form()
    {

        return "fire/form";
    }
    @RequestMapping({"/index.html","/user/index.html"})
    public String index()
    {

        return "fire/index";
    }
    @RequestMapping({"/introduction.html","/user/introduction.html"})
    public String introduction()
    {

        return "fire/introduction";
    }
    @RequestMapping({"/about.html","/user/about.html"})
    public String about()
    {

        return "fire/about";
    }
    @RequestMapping({"/user/myspace.html"})
    public String myspace()
    {

        return "fire/myspace";
    }
    @RequestMapping({"/user/process.html","process.html"})
    public String process()
    {

        return "fire/process";
    }
    @RequestMapping({"/form.html","/error"})
    public String error()
    {
        return "fire/limit";
    }
    @RequestMapping("/friendly.html")
    public String friendly()
    {
        return "fire/friendly";
    }
    @RequestMapping("/announce.html")
    public String announce()
    {
        return "fire/announce";
    }
    @RequestMapping("/laws.html")
    public String laws()
    {
        return "fire/laws";
    }

//    以下是后台管理界面的视图映射
    @RequestMapping("/admin")
    public String management()
{
    return  "manage/index";
}
    @RequestMapping("/admin-index.html")
    public String managementIndex(){return "manage/admin-index";}
    @RequestMapping("/admin-table.html")
    public String managementTable(){return  "manage/admin-table";}
    @RequestMapping("/admin-404.html")
    public String management404(){return "manage/admin-404";}
    @RequestMapping("/admin-employee.html")
    public String managementEmployee(){return "manage/admin-employee";}
    @RequestMapping("/admin-log.html")
    public String managementLog(){return "manage/admin-log";}
    @RequestMapping("/admin-user.html")
    public String managementUser(){return "manage/admin-user";}
}
