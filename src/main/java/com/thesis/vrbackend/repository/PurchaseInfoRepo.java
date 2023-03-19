package com.thesis.vrbackend.repository;

import com.thesis.vrbackend.model.PurchaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseInfoRepo extends JpaRepository<PurchaseInfo, Long> {
}
