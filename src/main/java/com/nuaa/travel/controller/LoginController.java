package com.nuaa.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/llogin")
    public String login(){
        return "login";
    }
}
