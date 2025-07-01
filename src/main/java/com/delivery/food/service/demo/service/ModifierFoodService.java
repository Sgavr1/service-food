package com.delivery.food.service.demo.service;

import com.delivery.food.service.demo.model.dto.modifierfood.ModifierFoodCreateDTO;
import com.delivery.food.service.demo.model.dto.modifierfood.ModifierFoodResponseDetailedDTO;
import com.delivery.food.service.demo.model.dto.modifierfood.ModifierFoodUpdateDTO;
import com.delivery.food.service.demo.model.entity.ModifierFood;
import com.delivery.food.service.demo.model.mapper.ModifierFoodMapper;
import com.delivery.food.service.demo.repository.ModifierFoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModifierFoodService {
    private final ModifierFoodRepository repository;
    private final ModifierFoodMapper mapper;

    public ModifierFoodResponseDetailedDTO create(ModifierFoodCreateDTO dto) {
        ModifierFood modifierFood = mapper.getEntity(dto);

        modifierFood = repository.save(modifierFood);

        return mapper.getDetailedDto(modifierFood);
    }

    public ModifierFoodResponseDetailedDTO update(ModifierFoodUpdateDTO dto) {
        ModifierFood modifierFood = mapper.getEntity(dto);

        modifierFood = repository.save(modifierFood);

        return mapper.getDetailedDto(modifierFood);
    }
}