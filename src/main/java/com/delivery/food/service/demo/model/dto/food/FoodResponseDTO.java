package com.delivery.food.service.demo.model.dto.food;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FoodResponseDTO {
    private long id;
    private String name;
    private float price;
    private RestaurantResponseDTO restaurace;
}