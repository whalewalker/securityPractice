package com.securitypractice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

    @GetMapping("/user")
    public String user(){
        return "Hello World user";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Hello World Admin";
    }
}
