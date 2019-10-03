package com.yisui.controller;

import com.yisui.model.Student;
import com.yisui.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class LoginController {

    private LoginService loginService_;

    @RequestMapping("/index")
    public String HomePage() {
        return "index";
    }

    @RequestMapping("/login")
    public String Login() {
        System.out.println("kdjf");
        ArrayList<Student> students = loginService_.QueryStudent();
        return "sayHi";
    }
}
