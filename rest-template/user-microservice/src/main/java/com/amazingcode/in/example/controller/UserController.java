package com.amazingcode.in.example.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final Logger logger = Logger.getLogger(UserController.class.getName());
    
    private final RestTemplate restTemplate;

    public UserController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public String addToCart(){
        logger.info("Request recieved to add product in cart.");
        String response = restTemplate.getForObject("http://localhost:8082/api/products", String.class);
        logger.info("Response recieved from product service about product availability.");
        return "Response from User service: " + response;
    }
}
