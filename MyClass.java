package com.springDemo.Journal.App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// For testing the API

@RestController
public class MyClass {

    @GetMapping("nazim")
    public String sayHello(){
        return "Hello Nazim";
    }
}