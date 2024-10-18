package com.college.project.demo.service;

import com.college.project.demo.domain.Response;
import com.college.project.demo.domain.UserRequest;

public interface UserService {
    public Response save(UserRequest request);
}
