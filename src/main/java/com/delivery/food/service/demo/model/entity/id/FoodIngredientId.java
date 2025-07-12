package com.delivery.food.service.demo.model.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class FoodIngredientId {
    @Column(name = "food_id")
    private long foodId;
    @Column(name = "ingredient_id")
    private long ingredientId;

    public FoodIngredientId() {
    }

    public FoodIngredientId(long foodId, long ingredientId) {
        this.foodId = foodId;
        this.ingredientId = ingredientId;
    }

    public long getFoodId() {
        return foodId;
    }

    public void setFoodId(long foodId) {
        this.foodId = foodId;
    }

    public long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(long ingredientId) {
        this.ingredientId = ingredientId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FoodIngredientId that = (FoodIngredientId) o;
        return foodId == that.foodId && ingredientId == that.ingredientId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodId, ingredientId);
    }
}