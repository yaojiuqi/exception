package com.yjq.exception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        int a=1,b=0;
        int c=a/b;
        return "hello";
    }
}
