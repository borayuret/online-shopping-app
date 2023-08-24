package com.codershere.productservice.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ProductRequestDTO implements Serializable {

    private String name;
    private String description;
    private BigDecimal price;

}
