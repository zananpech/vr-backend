package com.thesis.vrbackend.service;

import com.thesis.vrbackend.dto.PurchaseInfoDto;
import com.thesis.vrbackend.model.Product;
import com.thesis.vrbackend.model.PurchaseInfo;
import com.thesis.vrbackend.repository.PurchaseInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class PurchaseInfoService {

  @Autowired
  ProductService productService;

  @Autowired
  PurchaseInfoRepo purchaseInfoRepo;

  @Transactional
  public Optional<PurchaseInfo> purchaseProduct(PurchaseInfoDto purchaseInfoDto) {
    Optional<Product> product = productService.findProductById(purchaseInfoDto.getProductId());
    if (product.isEmpty()) return Optional.empty();
    PurchaseInfo purchaseInfo = new PurchaseInfo();
    purchaseInfo.setProductId(product.get().getId());
    purchaseInfo.setProductName(product.get().getName());
    purchaseInfo.setPrice(product.get().getPrice());
    purchaseInfo.setUserId(purchaseInfoDto.getUserId());
    purchaseInfo.setQuantity(purchaseInfoDto.getQuantity());

    return Optional.of(purchaseInfoRepo.save(purchaseInfo));
  }

}


