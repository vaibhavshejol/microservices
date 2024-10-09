package com.amazingcode.in.example.controller;

import com.amazingcode.in.example.entity.UserDetails;
import com.amazingcode.in.example.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDetails> createUser(@RequestBody UserDetails user){
        return ResponseEntity.ok(userService.addUser(user));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<UserDetails> getUser(@PathVariable Long id){
        return ResponseEntity.ok(userService.getUser(id));
    }
}
