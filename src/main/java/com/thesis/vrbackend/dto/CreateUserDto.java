package com.thesis.vrbackend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class CreateUserDto {

  @NotNull
  @Email
  @Column(name = "email", unique = true, nullable = false)
  private String email;

  @NotNull
  @Column(name = "password")
  private String password;

  @NotNull
  @Column(name = "first_name")
  private String firstName;

  @NotNull
  @Column(name = "last_name")
  private String lastName;

  @NotNull
  @Column(name = "address")
  private String address;

}
