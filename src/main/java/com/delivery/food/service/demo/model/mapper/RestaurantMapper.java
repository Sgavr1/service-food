package com.delivery.food.service.demo.model.mapper;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseSummaryDTO;
import org.mapstruct.Mapper;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantCreateDTO;
import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseDetailedDTO;
import com.delivery.food.service.demo.model.dto.restaurant.RestaurantUpdateDTO;
import com.delivery.food.service.demo.model.entity.Restaurant;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {
    Restaurant getEntity(RestaurantCreateDTO dto);

    Restaurant getEntity(RestaurantUpdateDTO dto);

    RestaurantResponseDetailedDTO getDetailedDTO(Restaurant entity);

    RestaurantResponseSummaryDTO getSummaryDTO(Restaurant entity);
}
