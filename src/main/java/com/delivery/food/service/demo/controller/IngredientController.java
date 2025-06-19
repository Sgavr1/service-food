package com.delivery.food.service.demo.controller;

import com.delivery.food.service.demo.model.dto.ingredient.IngredientCreateDTO;
import com.delivery.food.service.demo.model.dto.ingredient.IngredientResponseDetailedDTO;
import com.delivery.food.service.demo.model.dto.ingredient.IngredientUpdateDTO;
import com.delivery.food.service.demo.service.IngredientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class IngredientController {
    private final IngredientService service;

    @GetMapping("/ingredients")
    public List<IngredientResponseDetailedDTO> getAll() {
        return service.getAll();
    }

    @PostMapping("/ingredient")
    public IngredientResponseDetailedDTO create(@RequestBody IngredientCreateDTO dto) {
        return service.create(dto);
    }

    @PatchMapping("/ingredient")
    public IngredientResponseDetailedDTO update(@RequestBody IngredientUpdateDTO dto) {
        return service.update(dto);
    }
}
