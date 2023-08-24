package com.codershere.productservice.mapper;

import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;
import com.codershere.productservice.model.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductEntityDTOMapper {
    //@Mapping(target = "id", ignore = true)
    Product productRequestToProduct(ProductRequestDTO productRequestDTO);
    ProductResponseDTO productToProductResponse(Product product);
}
