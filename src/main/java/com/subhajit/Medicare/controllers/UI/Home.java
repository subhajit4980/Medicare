package com.subhajit.Medicare.controllers.UI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
    @RequestMapping("/")
    public String Home(){
        return "home";
    }
}
