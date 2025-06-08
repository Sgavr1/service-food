package com.delivery.food.service.demo.model.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ingredients")
@AllArgsConstructor
@Getter
@Setter
public class Ingredient {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="ingredient_name")
    private String name;
    @ManyToMany
    @JoinTable(name="food_ingredient",
        joinColumns=@JoinColumn(name="ingredient_id"),
        inverseJoinColumns=@JoinColumn(name="food_id"))
    private List<Food> foods;
}