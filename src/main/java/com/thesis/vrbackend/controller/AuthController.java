package com.thesis.vrbackend.controller;

import com.thesis.vrbackend.dto.LoginRequestDto;
import com.thesis.vrbackend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.thesis.vrbackend.service.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @Autowired
  UserService userService;

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody final LoginRequestDto loginRequestDto) {

    Optional<User> user = userService.findUserByEmail(loginRequestDto.getEmail());
    if (user.isPresent() && user.get().getPassword().equals(loginRequestDto.getPassword())) {
      return ResponseEntity.status(HttpStatus.OK).body(user.get());
    }
    return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
  }

  @PostMapping("/register")
  public ResponseEntity<?> register(@RequestBody final User user) {
//    System.out.println(dto);
    User createdUser = userService.createUser(user);
    return ResponseEntity.status(HttpStatus.OK).body(createdUser);
  }
}
