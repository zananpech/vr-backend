package com.thesis.vrbackend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class PurchaseInfo extends BaseEntity{

  @NotNull
  private Long userId;

  @NotNull
  private Long productId;

  @NotNull
  private int price;

  @NotNull
  private String productName;

  @NotNull
  private int quantity;
}
