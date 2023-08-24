package com.codershere.productservice.service;

import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequestDTO productRequest);

    List<ProductResponseDTO> getAllProducts();
}
