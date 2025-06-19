package com.delivery.food.service.demo.model.dto.food;

import com.delivery.food.service.demo.model.dto.foodingredient.FoodIngredientDTO;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseSummaryDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FoodResponseDetailedDTO {
    private long id;
    private String name;
    private BigDecimal price;
    private String description;
    private RestaurantResponseSummaryDTO restaurant;
    private List<FoodIngredientDTO> ingredients;
}