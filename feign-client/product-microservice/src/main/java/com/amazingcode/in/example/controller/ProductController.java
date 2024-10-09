package com.amazingcode.in.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazingcode.in.example.external.entity.UserDetails;
import com.amazingcode.in.example.external.service.UserService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final UserService userService;

    public ProductController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/{userId}")
    public String addProduct(@PathVariable Long userId){
        UserDetails userDetails = userService.getUser(userId);
        return "Product added for user: " + userDetails;
    }
}
