package com.thesis.vrbackend.repository;

import com.thesis.vrbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product, Long> { }
