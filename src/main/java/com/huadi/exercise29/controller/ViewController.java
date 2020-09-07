package com.huadi.exercise29.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping({"/","/fire/login","/login.html"})
    public String login()
    {
        return "fire/login";
    }
    @RequestMapping({"/register.html"})
    public String register()
    {

        return "fire/register";
    }
    @RequestMapping({"/form.html","/form"})
    public String form()
    {

        return "fire/form";
    }
    @RequestMapping("/index.html")
    public String index()
    {

        return "fire/index";
    }
    @RequestMapping("/introduction.html")
    public String introduction()
    {

        return "fire/introduction";
    }
    @RequestMapping("/about.html")
    public String about()
    {

        return "fire/about";
    }
    @RequestMapping("/myspace.html")
    public String myspace()
    {

        return "fire/myspace";
    }
}
