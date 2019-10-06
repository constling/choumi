package com.yisui.controller;

import com.yisui.model.Student;
import com.yisui.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

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

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public
    ModelAndView  Login(HttpServletRequest request) {
        String name = request.getParameter("name");
        String pwd = request.getParameter("password");
        
        ModelAndView model  = new ModelAndView();
        model.setViewName("student");
        model.addObject("name", "222");
        model.addObject("id", "df");
        return  model;
    }
}
