 package com.college.project.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.college.project.demo.domain.Response;
import com.college.project.demo.domain.UserRequest;

@Service
 public class UserServiceImpl implements UserService{

    @Override
    public Response save(UserRequest request) {
        Response response=new Response();
        // Request validation
        if(request.getName()==null||request.getName().equals("")){
            response.setStatus("FAILURE");
            response.setMessage("Name is null or empty.");
            return response;
        }
        else if(request.getMobile()==null||request.getMobile().equals("")){
            response.setStatus("FAILURE");
            response.setMessage("Invalid mobile nubmer provided by user.");
            return response;
        }
        // Save Logic
       
        response.setStatus("SUCCESS");
        response.setMessage("User saved successfully in the system. User details : "+request.toString());
     return response;   
    }

    
}