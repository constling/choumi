package com.yisui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/index")
    public String HomePage() {
        return "index";
    }

    @RequestMapping("/login")
    public String Login() {
        System.out.println("kdjf");
        return "";
    }
}
