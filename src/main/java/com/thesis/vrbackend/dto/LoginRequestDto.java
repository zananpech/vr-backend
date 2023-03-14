package com.thesis.vrbackend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class LoginRequestDto {
  @NotNull
  @Email
  @Size(max = 50)
  private String email;

  @NotBlank
  private String password;

}
