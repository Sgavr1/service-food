package com.delivery.food.service.demo.model.mapper;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseSummaryDTO;
import jakarta.persistence.Column;
import org.mapstruct.Mapper;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantCreateDTO;
import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseDetailedDTO;
import com.delivery.food.service.demo.model.dto.restaurant.RestaurantUpdateDTO;
import com.delivery.food.service.demo.model.entity.Restaurant;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {
    @Mapping(target = "active", expression = "java(false)")
    @Mapping(target = "work", expression = "java(false)")
    Restaurant getEntity(RestaurantCreateDTO dto);

    Restaurant getEntity(RestaurantUpdateDTO dto);

    RestaurantResponseDetailedDTO getDetailedDTO(Restaurant entity);

    RestaurantResponseSummaryDTO getSummaryDTO(Restaurant entity);
}
