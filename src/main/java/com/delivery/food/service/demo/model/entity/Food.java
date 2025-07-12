package com.delivery.food.service.demo.model.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "foods")
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "food_name")
    private String name;
    @ManyToOne()
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "food_description")
    private String description;
    @Column(name = "available")
    private boolean available;
    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FoodIngredient> ingredients;
    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ModifierFood> modifiers;

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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public List<FoodIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<FoodIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<ModifierFood> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<ModifierFood> modifiers) {
        this.modifiers = modifiers;
    }
}