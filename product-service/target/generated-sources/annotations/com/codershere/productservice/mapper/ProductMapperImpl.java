package com.codershere.productservice.mapper;

import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;
import com.codershere.productservice.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-24T15:56:15+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productRequestToProduct(ProductRequestDTO productRequestDTO) {
        if ( productRequestDTO == null ) {
            return null;
        }

        Product.ProductBuilder product = Product.builder();

        product.name( productRequestDTO.getName() );
        product.description( productRequestDTO.getDescription() );
        product.price( productRequestDTO.getPrice() );

        return product.build();
    }

    @Override
    public ProductResponseDTO productToProductResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponseDTO.ProductResponseDTOBuilder productResponseDTO = ProductResponseDTO.builder();

        productResponseDTO.id( product.getId() );
        productResponseDTO.name( product.getName() );
        productResponseDTO.description( product.getDescription() );
        productResponseDTO.price( product.getPrice() );

        return productResponseDTO.build();
    }

    @Override
    public List<ProductResponseDTO> productListToProductResponseDTOList(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductResponseDTO> list = new ArrayList<ProductResponseDTO>( products.size() );
        for ( Product product : products ) {
            list.add( productToProductResponse( product ) );
        }

        return list;
    }
}
