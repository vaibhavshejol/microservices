package com.amazingcode.in.example.external.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.amazingcode.in.example.external.entity.UserDetails;

@FeignClient(name = "user-microservice", url = "http://localhost:8081")
public interface UserService {
    @GetMapping("/api/users/{userId}")
    UserDetails getUser(@PathVariable Long userId);
}
