package com.thesis.vrbackend.repository;

import com.thesis.vrbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
  Optional<User> findByEmail(String email);
}
