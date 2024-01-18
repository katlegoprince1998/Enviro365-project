package com.enviro.assessment.grad001.katlegomashego.repository;

import com.enviro.assessment.grad001.katlegomashego.dto.ProductDto;
import com.enviro.assessment.grad001.katlegomashego.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByInvestorId(Long investorId);
}


