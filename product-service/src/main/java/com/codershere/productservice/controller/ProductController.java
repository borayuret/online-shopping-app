package com.codershere.productservice.controller;

import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;
import com.codershere.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequestDTO productRequest)
    {
        productService.createProduct(productRequest);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponseDTO> getAllProducts()
    {
        return productService.getAllProducts();
    }

}
