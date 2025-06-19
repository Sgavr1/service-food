package com.delivery.food.service.demo.model.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class FoodIngredientId {
    @Column(name = "food_id")
    private long foodId;
    @Column(name = "ingredient_id")
    private long ingredientId;
}
