package com.delivery.food.service.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.food.service.demo.model.dto.food.FoodResponseDTO;


@RestController
public class FoodController {

    @GetMapping("foods")
    public FoodResponseDTO[] getAllFood() {
        return null;
    }
    
}