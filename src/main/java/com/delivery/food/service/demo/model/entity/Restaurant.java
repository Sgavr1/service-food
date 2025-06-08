package com.delivery.food.service.demo.model.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="restaurants")
@AllArgsConstructor
@Getter
@Setter
public class Restaurant {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="restaurant_name")
    private String name;
    @OneToOne()
    @JoinColumn(name="addreass_id", referencedColumnName="id")
    private Addreass addreass;
    @OneToMany(mappedBy="restaurant")
    private List<Food> foods;
}