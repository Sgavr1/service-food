package com.delivery.food.service.demo.controller;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantCreateDTO;
import com.delivery.food.service.demo.model.dto.restaurant.RestaurantUpdateDTO;
import org.springframework.web.bind.annotation.*;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseDTO;
import com.delivery.food.service.demo.model.entity.Restaurant;
import com.delivery.food.service.demo.model.mapper.RestaurantMapper;
import com.delivery.food.service.demo.service.RestaurantService;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class RestaurantController {
    private final RestaurantService service;

    @GetMapping("restaurants")
    public List<RestaurantResponseDTO> getAllRestaurant() {
        return service.getAll();
    }

    @PostMapping("/restaurant")
    public RestaurantResponseDTO create(@RequestBody RestaurantCreateDTO dto){
        return service.create(dto);
    }

    @PatchMapping("/restaurant")
    public RestaurantResponseDTO update(@RequestBody RestaurantUpdateDTO dto){
        return service.update(dto);
    }
}