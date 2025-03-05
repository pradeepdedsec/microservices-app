package com.example.demo.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AppController {
    
    @GetMapping("/")
    public String getMethodName1() {
        return "Hello World";
    }

    @GetMapping("/test")
    public String getMethodName2() {
        return "Hello Test";
    }
    
}
