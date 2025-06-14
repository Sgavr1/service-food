package com.delivery.food.service.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseDTO;
import com.delivery.food.service.demo.model.entity.Restaurant;
import com.delivery.food.service.demo.model.mapper.RestaurantMapper;
import com.delivery.food.service.demo.service.RestaurantService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class RestaurantController {
    private final RestaurantService service;
    private final RestaurantMapper mapper;

    @GetMapping("restaurants")
    public RestaurantResponseDTO[] getAllRestaurant() {
        service.getAll();

        Restaurant restaurant = new Restaurant(0L, "Seylor Jak", "Elisaventynska", "Odesa",
                "10", "UA", null);
        RestaurantResponseDTO dto = mapper.getDTO(restaurant);

        System.out.println(dto.toString());
        return null;
    }

}