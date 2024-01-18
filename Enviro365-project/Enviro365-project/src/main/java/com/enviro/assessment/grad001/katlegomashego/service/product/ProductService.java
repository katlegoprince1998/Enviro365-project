package com.enviro.assessment.grad001.katlegomashego.service.product;

import com.enviro.assessment.grad001.katlegomashego.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto, Long id);
    List<ProductDto> getAllProducts(Long id);
}
