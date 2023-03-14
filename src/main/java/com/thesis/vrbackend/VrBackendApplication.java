package com.thesis.vrbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class VrBackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(VrBackendApplication.class, args);
  }

  @GetMapping
  public String hello() {
    return "hello";
  }

}
