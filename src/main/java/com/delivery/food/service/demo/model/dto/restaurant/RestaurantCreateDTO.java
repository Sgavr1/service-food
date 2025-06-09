package com.delivery.food.service.demo.model.dto.restaurant;

import java.util.List;

import com.delivery.food.service.demo.model.entity.Food;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RestaurantCreateDTO {
    private String name;
    private String street;
    private String city;
    private String postalCode;
    private String country;
    private List<Food> foods;
}
