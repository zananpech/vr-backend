package com.thesis.vrbackend.util;

import com.thesis.vrbackend.dto.CreateProductDto;
import com.thesis.vrbackend.dto.CreateUserDto;
import com.thesis.vrbackend.model.Product;
import com.thesis.vrbackend.model.User;
import org.springframework.security.core.parameters.P;

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

  public static Product createProductDtoToProduct(CreateProductDto createProductDto) {
    Product product = new Product();
    product.setName(createProductDto.getName());
    product.setPrice(createProductDto.getPrice());
    product.setDescription(createProductDto.getDescription());
    product.setImageSrc(createProductDto.getImageSrc());
    return product;
  }

}
