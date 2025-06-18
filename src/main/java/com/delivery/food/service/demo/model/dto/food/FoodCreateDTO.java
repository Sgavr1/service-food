package com.delivery.food.service.demo.model.dto.food;

import com.delivery.food.service.demo.model.dto.ingredient.IngredientResponseDTO;
import com.delivery.food.service.demo.model.entity.Ingredient;
import com.delivery.food.service.demo.model.entity.Restaurant;
import jakarta.persistence.*;
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
public class FoodCreateDTO {
    private String name;
    private long restaurantId;
    private BigDecimal price;
    private String description;
    private List<IngredientResponseDTO> ingredients;
}