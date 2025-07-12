package com.delivery.food.service.demo.model.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "ingredient_name")
    private String name;
    @OneToMany(mappedBy = "ingredient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FoodIngredient> foods;

    public Ingredient() {
    }

    public Ingredient(long id, String name, List<FoodIngredient> foods) {
        this.id = id;
        this.name = name;
        this.foods = foods;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FoodIngredient> getFoods() {
        return foods;
    }

    public void setFoods(List<FoodIngredient> foods) {
        this.foods = foods;
    }
}