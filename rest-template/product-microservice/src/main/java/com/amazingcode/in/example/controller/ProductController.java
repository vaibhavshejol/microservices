package com.amazingcode.in.example.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    private final Logger logger = Logger.getLogger(ProductController.class.getName());

    @GetMapping
    public String checkProductAvailability() throws InterruptedException{
        logger.info("Request recieved to check availability of product.");
        Thread.sleep(5000);
        return "Requested product is avilable.";
    }
}
