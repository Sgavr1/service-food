package com.delivery.food.service.demo.model.mapper;

import com.delivery.food.service.demo.model.dto.food.FoodCreateDTO;
import com.delivery.food.service.demo.model.dto.food.FoodResponseDetailedDTO;
import com.delivery.food.service.demo.model.dto.food.FoodResponseSummeryDTO;
import com.delivery.food.service.demo.model.dto.food.FoodUpdateDTO;
import com.delivery.food.service.demo.model.entity.Food;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FoodMapper {
    @Mapping(source = "restaurantId", target = "restaurant.id")
    @Mapping(target = "available", expression = "java(false)")
    Food getEntity(FoodCreateDTO dto);

    @Mapping(source = "restaurantId", target = "restaurant.id")
    Food getEntity(FoodUpdateDTO dto);

    FoodResponseDetailedDTO getDetailedDTO(Food entity);

    FoodResponseSummeryDTO getSummeryDTO(Food entity);
}