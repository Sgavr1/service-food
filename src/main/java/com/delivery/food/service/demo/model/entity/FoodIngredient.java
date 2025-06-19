package com.delivery.food.service.demo.model.entity;

import com.delivery.food.service.demo.model.entity.id.FoodIngredientId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "food_ingredient")
public class FoodIngredient {
    @EmbeddedId
    private FoodIngredientId id = new FoodIngredientId();

    @ManyToOne
    @MapsId("foodId")
    @JoinColumn(name = "food_id")
    private Food food;

    @ManyToOne
    @MapsId("ingredientId")
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    @Column(name = "necessarily")
    private boolean necessarily;
}
