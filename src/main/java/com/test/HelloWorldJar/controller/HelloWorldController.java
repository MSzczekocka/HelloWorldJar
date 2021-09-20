package com.test.HelloWorldJar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    @ResponseBody
    public String getBudgetTypes(){
        return "Hello World!";
    }

}
