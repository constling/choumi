package com.yisui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChoumiController {

    @RequestMapping("/toHI")
    public String SayHi() {
        return "sayHi";
    }
}
