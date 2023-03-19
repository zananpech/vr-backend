package com.thesis.vrbackend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class PurchaseInfoDto {

  @NotNull
  Long productId;

  @NotNull
  Long userId;

}

