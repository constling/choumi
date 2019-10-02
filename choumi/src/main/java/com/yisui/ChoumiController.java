package com.yisui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChoumiController {

    @RequestMapping("/toHI")
    public String SayHi() {
        System.out.println("say hiiii");
        return "sayHi";
    }

    @RequestMapping("/index")
    public String HomePage() {
        System.out.println("1111111111");
        return "index";
    }
}
