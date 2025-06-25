package com.delivery.food.service.demo.model.dto.food;

import com.delivery.food.service.demo.model.dto.foodingredient.FoodIngredientDTO;
import com.delivery.food.service.demo.model.dto.modifierfood.ModifierFoodResponseSummeryDTO;
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
public class FoodUpdateDTO {
    private long id;
    private String name;
    private long restaurantId;
    private BigDecimal price;
    private String description;
    private boolean isAvailable;
    private List<FoodIngredientDTO> ingredients;
    private List<ModifierFoodResponseSummeryDTO> modifiers;
}