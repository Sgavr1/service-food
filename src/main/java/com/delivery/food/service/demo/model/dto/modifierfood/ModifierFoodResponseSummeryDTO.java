package com.delivery.food.service.demo.model.dto.modifierfood;

import com.delivery.food.service.demo.model.entity.Food;
import com.delivery.food.service.demo.model.entity.Modifier;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ModifierFoodResponseSummeryDTO {
    private long id;
    private Food food;
    private Modifier modifier;
}