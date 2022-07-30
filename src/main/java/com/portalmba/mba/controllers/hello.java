package com.portalmba.mba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("texto", "Hello World!");
        return "hello";
    }
}
