package com.delivery.food.service.demo.model.dto.restaurant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RestaurantUpdateDTO {
    private long id;
    private String name;
    private String street;
    private String city;
    private String postalCode;
    private String country;
}