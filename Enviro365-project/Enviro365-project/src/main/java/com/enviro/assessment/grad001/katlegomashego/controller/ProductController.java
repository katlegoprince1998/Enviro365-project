package com.enviro.assessment.grad001.katlegomashego.controller;

import com.enviro.assessment.grad001.katlegomashego.dto.ProductDto;
import com.enviro.assessment.grad001.katlegomashego.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/create/{id}")
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto,
                                                    @PathVariable("id") Long id){
        productService.createProduct(productDto, id);
        return ResponseEntity.ok(productDto);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<List<ProductDto>> getProducts(@PathVariable("id") Long id){
        return ResponseEntity.ok(productService.getAllProducts(id));
    }

}
