package com.delivery.food.service.demo.model.dto.food;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FoodResponseSummeryDTO {
    private long id;
    private String name;
    private BigDecimal price;
    private String description;
}
