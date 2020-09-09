package com.huadi.exercise29.controller.firecontroller;

import com.huadi.exercise29.entity.Authentication;
import com.huadi.exercise29.repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@Controller
public class MyspaceController {

    @Autowired
    private AuthenticationRepository au;

    @RequestMapping(value="/myspace")
    public String myspace(@RequestParam("userID")String ID, Model model){

            List<Authentication> authentications = au.selectByCustomer(ID);
            model.addAttribute("aus",authentications);


        return "/fire/myspace";
    }

}
