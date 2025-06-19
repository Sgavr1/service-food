package com.delivery.food.service.demo.model.dto.foodingredient;

import com.delivery.food.service.demo.model.dto.food.FoodResponseDTO;
import com.delivery.food.service.demo.model.dto.ingredient.IngredientResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FoodIngredientDTO {
    private FoodResponseDTO food;
    private IngredientResponseDTO ingredient;
    private boolean necessarily; 
}
