package com.delivery.food.service.demo.service;

import com.delivery.food.service.demo.model.dto.ingredient.IngredientCreateDTO;
import com.delivery.food.service.demo.model.dto.ingredient.IngredientResponseDetailedDTO;
import com.delivery.food.service.demo.model.dto.ingredient.IngredientUpdateDTO;
import com.delivery.food.service.demo.model.entity.Ingredient;
import com.delivery.food.service.demo.model.mapper.IngredientMapper;
import com.delivery.food.service.demo.repository.IngredientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class IngredientService {
    private final IngredientRepository repository;
    private final IngredientMapper mapper;

    public List<IngredientResponseDetailedDTO> getAll(){
        return repository.findAll().stream().map(mapper::getDetailedDTO).toList();
    }

    public IngredientResponseDetailedDTO create(IngredientCreateDTO dto) {
        Ingredient ingredient = mapper.getEntity(dto);

        ingredient = repository.save(ingredient);

        return mapper.getDetailedDTO(ingredient);
    }

    public IngredientResponseDetailedDTO update(IngredientUpdateDTO dto) {
        Ingredient ingredient = mapper.getEntity(dto);

        ingredient = repository.save(ingredient);

        return mapper.getDetailedDTO(ingredient);
    }

    public List<Ingredient> create(List<IngredientCreateDTO> ingredientsDto){
        Iterable<Ingredient> ingredients = ingredientsDto.stream().map(mapper::getEntity).toList();
        return repository.saveAll(ingredients);
    }
}