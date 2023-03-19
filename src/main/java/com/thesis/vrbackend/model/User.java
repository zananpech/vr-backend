package com.thesis.vrbackend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "user_")
@NoArgsConstructor
public class User extends BaseEntity{

  @NotNull
  @Email
  @Column(name = "email", unique = true, nullable = false)
  private String email;

  @NotNull
  private String password;

  @NotNull
  private String firstName;

  @NotNull
  private String lastName;

  @NotNull
  private String address;
}
