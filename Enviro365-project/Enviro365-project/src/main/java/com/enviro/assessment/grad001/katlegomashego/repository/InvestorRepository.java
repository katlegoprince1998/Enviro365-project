package com.enviro.assessment.grad001.katlegomashego.repository;

import com.enviro.assessment.grad001.katlegomashego.entity.Investor;
import com.enviro.assessment.grad001.katlegomashego.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestorRepository extends JpaRepository<Investor, Long> {

}

