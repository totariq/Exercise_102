package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar", "Say hello to people.");
        model.addAttribute("myvar2", "Have a Good Day.");
        return "hometemplate";
    }
}