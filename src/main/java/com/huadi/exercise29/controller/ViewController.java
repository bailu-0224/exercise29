package com.huadi.exercise29.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping({"/","/fire/login"})
    public String login()
    {
        return "fire/login";
    }
    @RequestMapping({"/fire/register.html"})
    public String register()
    {
        return "fire/register";
    }
    @RequestMapping("/fire/index.html")
    public String index()
    {
        return "fire/index";
    }

}
