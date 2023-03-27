package com.thesis.vrbackend.service;

import com.thesis.vrbackend.dto.CreateProductDto;
import com.thesis.vrbackend.model.Product;
import com.thesis.vrbackend.repository.ProductRepo;
import com.thesis.vrbackend.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

  @Autowired
  ProductRepo productRepo;

  public List<Product> getAllProducts() {
    return productRepo.findAll();
  }

  public Optional<Product> findProductById(Long id) {
    return productRepo.findById(id);
  }

  @Transactional
  public Product addProduct(CreateProductDto createProductDto) {
    return productRepo.save(Mapper.createProductDtoToProduct(createProductDto));
  }

}
