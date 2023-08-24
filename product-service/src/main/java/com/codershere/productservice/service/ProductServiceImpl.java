package com.codershere.productservice.service;

import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;
import com.codershere.productservice.mapper.ProductMapper;
import com.codershere.productservice.model.Product;
import com.codershere.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;


    @Override
    @Caching(evict = {@CacheEvict(cacheNames = "productList", allEntries = true)})
    public void createProduct(ProductRequestDTO productRequest) {

//        Product product = Product.builder()
//                .name(productRequest.getName())
//                .description(productRequest.getDescription())
//                .price(productRequest.getPrice())
//                .build();

        Product product =
                productMapper.productRequestToProduct(productRequest);

        productRepository.save(product);
        log.info("Product {} is saved", product.getId());

    }

    @Override
    @Cacheable(value = "productList")
    public List<ProductResponseDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();

        //return products.stream().map(product -> mapEntityToDTO(product)).toList();
        //return products.stream().map(this::mapEntityToDTO).toList();

        return productMapper.productListToProductResponseDTOList(products);

    }

//    private ProductResponseDTO mapEntityToDTO(Product product) {
//
//        return ProductResponseDTO.builder()
//                .id(product.getId())
//                .name(product.getName())
//                .description(product.getDescription())
//                .price(product.getPrice())
//                .build();
//
//    }


}
