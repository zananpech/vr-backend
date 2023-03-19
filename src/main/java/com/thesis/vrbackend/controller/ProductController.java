package com.thesis.vrbackend.controller;

import com.thesis.vrbackend.dto.PurchaseInfoDto;
import com.thesis.vrbackend.model.Product;
import com.thesis.vrbackend.model.PurchaseInfo;
import com.thesis.vrbackend.service.ProductService;
import com.thesis.vrbackend.service.PurchaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

  @Autowired
  ProductService productService;

  @Autowired
  PurchaseInfoService purchaseInfoService;

  @GetMapping
  public ResponseEntity<List<Product>> getAllProducts() {
    return ResponseEntity.ok(productService.getAllProducts());
  }

  @PostMapping("/purchase")
  public ResponseEntity<PurchaseInfo> purchaseProduct(@RequestBody PurchaseInfoDto purchaseInfoDto) {
    Optional<PurchaseInfo> purchaseInfo = purchaseInfoService.purchaseProduct(purchaseInfoDto);
    if (purchaseInfo.isEmpty()) return ResponseEntity.notFound().build();
    return ResponseEntity.ok(purchaseInfo.get());
  }

}
