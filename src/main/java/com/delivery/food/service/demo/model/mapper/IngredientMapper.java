package com.delivery.food.service.demo.model.mapper;

import com.delivery.food.service.demo.model.dto.ingredient.IngredientCreateDTO;
import com.delivery.food.service.demo.model.dto.ingredient.IngredientResponseDetailedDTO;
import com.delivery.food.service.demo.model.dto.ingredient.IngredientResponseSummeryDTO;
import com.delivery.food.service.demo.model.dto.ingredient.IngredientUpdateDTO;
import com.delivery.food.service.demo.model.entity.Ingredient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IngredientMapper {
    Ingredient getEntity(IngredientCreateDTO dto);
    Ingredient getEntity(IngredientUpdateDTO dto);

    IngredientResponseDetailedDTO getDetailedDTO(Ingredient entity);
    IngredientResponseSummeryDTO getSummeryDTO(Ingredient entity);
}
