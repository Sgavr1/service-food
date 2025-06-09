package com.delivery.food.service.demo.model.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    @Column(name="street")
    private String street;
    @Column(name="city")
    private String city;
    @Column(name="postal_code")
    private String postalCode;
    @Column(name="country")
    private String country;
    @OneToMany(mappedBy="restaurant")
    private List<Food> foods;
}