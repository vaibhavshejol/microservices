package com.amazingcode.in.example.repository;

import com.amazingcode.in.example.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails, Long> {
}
