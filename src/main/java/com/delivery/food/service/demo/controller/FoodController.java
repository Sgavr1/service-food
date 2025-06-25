package com.delivery.food.service.demo.controller;

import com.delivery.food.service.demo.model.dto.food.FoodCreateDTO;
import com.delivery.food.service.demo.model.dto.food.FoodResponseDetailedDTO;
import com.delivery.food.service.demo.model.dto.food.FoodResponseSummeryDTO;
import com.delivery.food.service.demo.model.dto.food.FoodUpdateDTO;
import com.delivery.food.service.demo.service.FoodService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class FoodController {
    private final FoodService service;

    @GetMapping("/foods")
    public List<FoodResponseDetailedDTO> getAllFood() {
        return service.getAll();
    }

    @PostMapping("/food")
    public FoodResponseSummeryDTO create(@RequestBody FoodCreateDTO dto) {
        return service.create(dto);
    }

    @PatchMapping("/food")
    public FoodResponseDetailedDTO update(@RequestBody FoodUpdateDTO dto) {
        return service.update(dto);
    }
}