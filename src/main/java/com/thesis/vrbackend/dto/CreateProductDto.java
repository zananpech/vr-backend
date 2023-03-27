package com.thesis.vrbackend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
public class CreateProductDto {

  @NotNull
  private String name;

  @NotNull
  private String price;

  @NotNull
  private String description;

  @NotNull
  private String imageSrc;
}
