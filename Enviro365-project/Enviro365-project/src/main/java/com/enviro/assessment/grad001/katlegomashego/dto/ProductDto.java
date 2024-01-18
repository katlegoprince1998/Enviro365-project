package com.enviro.assessment.grad001.katlegomashego.dto;

import com.enviro.assessment.grad001.katlegomashego.entity.Investor;
import com.enviro.assessment.grad001.katlegomashego.entity.WithdrawalNotice;
import com.enviro.assessment.grad001.katlegomashego.entity.productType.ProductType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto {
    private Long id;
    private String name;
    private double currentBalance;
    private ProductType type;
    private Investor investor;

    public ProductDto(String name, ProductType type, double currentBalance) {
    }
}
