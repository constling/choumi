package com.yisui.controller;

import com.yisui.model.Student;
import com.yisui.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


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

    @RequestMapping("/user/action")
    public void DoAction(HttpServletRequest request, HttpServletResponse response) {
        String data = "使用PrintWriter流输出中文";
        //设置将字符以"UTF-8"编码输出到客户端浏览器
        response.setCharacterEncoding("UTF-8");
        //获取PrintWriter输出流
        try {
            PrintWriter out = response.getWriter();
            response.setHeader("content-type", "text/html;charset=UTF-8");
            //使用PrintWriter流向客户端输出字符
            out.write(data);
        } catch (IOException exp)
        {

        }

    }
}
