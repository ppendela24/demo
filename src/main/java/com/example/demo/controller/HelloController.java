package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/greet")
    public String sayHello(){
        return "Welcome to Spring Boot frame work";
    }
    @GetMapping("/greet/{name}")
    public String sayHelloWithName(@PathVariable("name") String localName){
        return "hi "+ localName+", Welcome to Spring Boot frame work";
    }
}
