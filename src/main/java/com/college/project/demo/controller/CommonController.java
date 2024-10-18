package com.college.project.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CommonController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome first API";
    }
}
