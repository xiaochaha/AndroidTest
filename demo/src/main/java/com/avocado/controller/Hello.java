package com.avocado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Hello {
    @RequestMapping("/hello.html")
    public @ResponseBody String say(){
        return "hello world";
    }
}
