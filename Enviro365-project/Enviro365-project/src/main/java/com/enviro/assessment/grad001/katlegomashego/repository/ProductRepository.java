package com.enviro.assessment.grad001.katlegomashego.repository;

import com.enviro.assessment.grad001.katlegomashego.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
