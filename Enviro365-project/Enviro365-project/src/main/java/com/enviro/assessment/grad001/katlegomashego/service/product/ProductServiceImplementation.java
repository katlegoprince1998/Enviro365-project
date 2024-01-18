package com.enviro.assessment.grad001.katlegomashego.service.product;

import com.enviro.assessment.grad001.katlegomashego.dto.InvestorDto;
import com.enviro.assessment.grad001.katlegomashego.dto.ProductDto;
import com.enviro.assessment.grad001.katlegomashego.entity.Investor;
import com.enviro.assessment.grad001.katlegomashego.entity.Product;
import com.enviro.assessment.grad001.katlegomashego.repository.InvestorRepository;
import com.enviro.assessment.grad001.katlegomashego.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ProductServiceImplementation implements ProductService{
    private final ProductRepository productRepository;
    private final InvestorRepository investorRepository;
    @Override
    public ProductDto createProduct(ProductDto productDto, Long id) {
        Optional<Investor> investorOptional = investorRepository.findById(id);

        if (investorOptional.isPresent()) {
            Investor investor = investorOptional.get();

            Product product = new Product();
            BeanUtils.copyProperties(productDto, product);

            product.setInvestor(investor);

            productRepository.save(product);
            productDto.setId(product.getId());
        } else {
           return null;
        }

        return productDto;
    }


    @Override
    public List<ProductDto> getAllProducts(Long investorId) {
        List<Product> products = productRepository.findByInvestorId(investorId);

        // Using Java streams to map Product entities to ProductDto objects
        List<ProductDto> productDtos = products.stream()
                .map(this::convertToProductDto)
                .collect(Collectors.toList());

        return productDtos;
    }



}
