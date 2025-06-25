package com.delivery.food.service.demo.model.mapper;

import com.delivery.food.service.demo.model.dto.modifierfood.ModifierFoodCreateDTO;
import com.delivery.food.service.demo.model.dto.modifierfood.ModifierFoodResponseDetailedDTO;
import com.delivery.food.service.demo.model.dto.modifierfood.ModifierFoodResponseSummeryDTO;
import com.delivery.food.service.demo.model.dto.modifierfood.ModifierFoodUpdateDTO;
import com.delivery.food.service.demo.model.entity.ModifierFood;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ModifierFoodMapper {
    ModifierFood getEntity(ModifierFoodCreateDTO dto);

    ModifierFood getEntity(ModifierFoodUpdateDTO dto);

    ModifierFood getEntity(ModifierFoodResponseDetailedDTO dto);

    ModifierFood getEntity(ModifierFoodResponseSummeryDTO dto);

    ModifierFoodResponseDetailedDTO getDetailedDto(ModifierFood entity);

    ModifierFoodResponseSummeryDTO getSummaryDto(ModifierFood entity);
}
