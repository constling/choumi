package com.yisui.controller;

import com.yisui.model.Student;
import com.yisui.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    private LoginService loginService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping("/index")
    public String HomePage() {
        return "index";
    }

    @RequestMapping("/login")
    public String Login() {
        System.out.println("kdjf");
        List<Student> students = loginService.QueryStudent();
        return "sayhi";
    }
}
