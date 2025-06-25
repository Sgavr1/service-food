package com.delivery.food.service.demo.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "modifier_food")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
}
