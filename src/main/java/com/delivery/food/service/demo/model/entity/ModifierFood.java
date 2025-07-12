package com.delivery.food.service.demo.model.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "modifier_food")
public class ModifierFood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;
    @ManyToOne
    @JoinColumn(name = "modifier_id")
    private Modifier modifier;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "weight")
    private String weight;

    public ModifierFood() {
    }

    public ModifierFood(long id, Food food, Modifier modifier, BigDecimal price, String weight) {
        this.id = id;
        this.food = food;
        this.modifier = modifier;
        this.price = price;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Modifier getModifier() {
        return modifier;
    }

    public void setModifier(Modifier modifier) {
        this.modifier = modifier;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
