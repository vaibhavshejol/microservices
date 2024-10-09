package com.amazingcode.in.example.service;

import com.amazingcode.in.example.entity.UserDetails;

public interface UserService {
    UserDetails getUser(Long id);

    UserDetails addUser(UserDetails user);
}
