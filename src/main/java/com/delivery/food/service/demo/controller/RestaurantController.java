package com.delivery.food.service.demo.controller;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantCreateDTO;
import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseDetailedDTO;
import com.delivery.food.service.demo.model.dto.restaurant.RestaurantUpdateDTO;
import org.springframework.web.bind.annotation.*;

import com.delivery.food.service.demo.service.RestaurantService;

import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@AllArgsConstructor
public class RestaurantController {
    private final RestaurantService service;

    @GetMapping("/restaurants")
    public List<RestaurantResponseDetailedDTO> getAllRestaurant() {
        return service.getAll();
    }

    @PostMapping("/restaurant")
    public RestaurantResponseDetailedDTO create(@RequestBody RestaurantCreateDTO dto){
        return service.create(dto);
    }

    @PatchMapping("/restaurant")
    public RestaurantResponseDetailedDTO update(@RequestBody RestaurantUpdateDTO dto){
        return service.update(dto);
    }
}