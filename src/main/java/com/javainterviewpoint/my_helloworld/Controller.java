package com.javainterviewpoint.my_helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/rest/auth")
public class Controller{
    @GetMapping("/rest/auth")
    public String greeting(){
        return "WELCOME TO SPRING SECURITY EXAMPLE";
    }
}
