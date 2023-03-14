package com.thesis.vrbackend.service;

import com.thesis.vrbackend.model.User;
import com.thesis.vrbackend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {

  @Autowired
  UserRepo userRepo;

  @Transactional
  public User createUser(User user) {
    return userRepo.save(user);
  }
  public Optional<User> getUser(Long id) {
    return userRepo.findById(id);
  }

  public Optional<User> findUserByEmail(String email) {
    return userRepo.findByEmail(email);
  }

}
