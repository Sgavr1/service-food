package com.delivery.food.service.demo.model.dto.food;

import com.delivery.food.service.demo.model.dto.ingredient.IngredientResponseDTO;
import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseDTO;

import com.delivery.food.service.demo.model.entity.Ingredient;
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
public class FoodResponseDTO {
    private long id;
    private String name;
    private BigDecimal price;
    private String description;
    private RestaurantResponseDTO restaurant;
    private List<IngredientResponseDTO> ingredients;
}