package com.delivery.food.service.demo.model.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="foods")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Food {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="food_name")
    private String name;
    @ManyToOne()
    @JoinColumn(name="restaurant_id")
    private Restaurant restaurant;
    @Column(name="price")
    private BigDecimal price;
    @Column(name="food_description")
    private String description;
    @Column(name = "available")
    private boolean isAvailable;
    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FoodIngredient> ingredients;
}