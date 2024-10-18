package com.college.project.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.project.demo.domain.Response;
import com.college.project.demo.domain.UserRequest;
import com.college.project.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/v1.0/save")
    public ResponseEntity<Response> saveUser(@RequestBody UserRequest request){
        Response response=userService.save(request);
        int statusCode=response.getStatus().equalsIgnoreCase("SUCCESS")?200:400;
        return new ResponseEntity<>(response,HttpStatus.valueOf(statusCode));
    }
}
