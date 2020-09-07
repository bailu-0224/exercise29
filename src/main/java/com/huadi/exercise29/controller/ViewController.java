package com.huadi.exercise29.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

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
    @RequestMapping("/admin")
    public String management()
    {
        return  "manage/admin-index";
    }
    @RequestMapping("/form.html")
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
}
