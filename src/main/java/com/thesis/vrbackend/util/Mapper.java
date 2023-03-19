package com.thesis.vrbackend.util;

import com.thesis.vrbackend.dto.CreateUserDto;
import com.thesis.vrbackend.model.User;

public class Mapper {

  public static User createUserDtoToUser(CreateUserDto createUserDto) {
    User user = new User();
    user.setAddress(createUserDto.getAddress());
    user.setEmail(createUserDto.getEmail());
    user.setFirstName(createUserDto.getFirstName());
    user.setLastName(createUserDto.getLastName());
    user.setPassword(createUserDto.getPassword());
    return user;
  }

}
