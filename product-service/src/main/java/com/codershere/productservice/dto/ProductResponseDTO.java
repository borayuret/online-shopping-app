package com.codershere.productservice.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ProductResponseDTO implements Serializable {



    private String id;
    private String name;
    private String description;
    private BigDecimal price;

}
