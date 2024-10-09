package com.amazingcode.in.example.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final Logger logger = Logger.getLogger(UserController.class.getName());
    
    private WebClient.Builder webClientBuilder;

    public UserController(WebClient.Builder webClientBuilder){
        this.webClientBuilder = webClientBuilder;
    }

    @GetMapping
    public String addToCart(){
        
        logger.info("Request recieved to add product in cart.");

        String url = "http://localhost:8082/api/products";

        return "Response from User service: " + webClientBuilder.build()
        .get()
        .uri(url)
        .retrieve()
        .bodyToMono(String.class)
        .block();
    }
}
