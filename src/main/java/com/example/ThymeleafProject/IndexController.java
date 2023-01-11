package com.example.ThymeleafProject;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {
    @RequestMapping("/")
    public String indexController(){
        return "index";
    }
}
