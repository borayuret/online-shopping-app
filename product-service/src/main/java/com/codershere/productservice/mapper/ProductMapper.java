package com.codershere.productservice.mapper;

import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;
import com.codershere.productservice.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    //@Mapping(target = "id", ignore = true)
    Product productRequestToProduct(ProductRequestDTO productRequestDTO);

    ProductResponseDTO productToProductResponse(Product product);

    List<ProductResponseDTO> productListToProductResponseDTOList(List<Product> products);
}
