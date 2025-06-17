package com.delivery.food.service.demo.model.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
    @ManyToMany
    @JoinTable(name="food_ingredient", 
        joinColumns = @JoinColumn(name = "food_id"), 
        inverseJoinColumns = @JoinColumn(name="ingredient_id"))
    private List<Ingredient> ingredients;
}