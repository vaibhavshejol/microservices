package com.amazingcode.in.example.service.impl;

import com.amazingcode.in.example.entity.UserDetails;
import com.amazingcode.in.example.repository.UserRepository;
import com.amazingcode.in.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public UserDetails addUser(UserDetails user) {
        return userRepository.save(user);
    }
}
