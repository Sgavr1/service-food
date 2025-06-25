package com.delivery.food.service.demo.model.dto.modifierfood;

import com.delivery.food.service.demo.model.dto.food.FoodResponseSummeryDTO;
import com.delivery.food.service.demo.model.dto.modifier.ModifierDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ModifierFoodUpdateDTO {
    private long id;
    private FoodResponseSummeryDTO food;
    private ModifierDTO modifier;
    private BigDecimal price;
    private String weight;
}
