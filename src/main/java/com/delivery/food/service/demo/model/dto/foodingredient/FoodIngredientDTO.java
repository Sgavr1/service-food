package com.delivery.food.service.demo.model.dto.foodingredient;

import com.delivery.food.service.demo.model.dto.food.FoodResponseSummeryDTO;
import com.delivery.food.service.demo.model.dto.ingredient.IngredientResponseSummeryDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FoodIngredientDTO {
    private FoodResponseSummeryDTO food;
    private IngredientResponseSummeryDTO ingredient;
    private boolean necessarily;
}