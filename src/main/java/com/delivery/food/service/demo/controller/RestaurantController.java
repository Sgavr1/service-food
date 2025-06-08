package com.delivery.food.service.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseDTO;
import com.delivery.food.service.demo.service.RestaurantService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class RestaurantController {
    private final RestaurantService service;

    @GetMapping("restaurants")
    public RestaurantResponseDTO[] getAllRestaurant() {
        service.getAll();
        return null;
    }

}