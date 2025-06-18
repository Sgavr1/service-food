package com.delivery.food.service.demo.model.dto.ingredient;

import com.delivery.food.service.demo.model.entity.Food;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IngredientResponseDTO {
    private long id;
    private String name;
    private List<Food> foods;
}