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
public class Product extends BaseEntity{

  @NotNull
  private String name;

  @NotNull
  private String price;

  @NotNull
  private String description;
}
