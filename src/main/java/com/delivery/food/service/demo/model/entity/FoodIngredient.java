package com.delivery.food.service.demo.model.entity;

import com.delivery.food.service.demo.model.entity.id.FoodIngredientId;
import jakarta.persistence.*;

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

    public FoodIngredient() {
    }

    public FoodIngredient(FoodIngredientId id, Food food, Ingredient ingredient, boolean necessarily) {
        this.id = id;
        this.food = food;
        this.ingredient = ingredient;
        this.necessarily = necessarily;
    }

    public FoodIngredientId getId() {
        return id;
    }

    public void setId(FoodIngredientId id) {
        this.id = id;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public boolean isNecessarily() {
        return necessarily;
    }

    public void setNecessarily(boolean necessarily) {
        this.necessarily = necessarily;
    }
}
