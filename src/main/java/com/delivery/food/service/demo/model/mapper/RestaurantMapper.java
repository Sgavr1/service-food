package com.delivery.food.service.demo.model.mapper;

import org.mapstruct.Mapper;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantCreateDTO;
import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseDTO;
import com.delivery.food.service.demo.model.dto.restaurant.RestaurantUpdateDTO;
import com.delivery.food.service.demo.model.entity.Restaurant;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface RestaurantMapper {
    Restaurant getEntity(RestaurantCreateDTO dto);
    Restaurant getEntity(RestaurantUpdateDTO dto);
    
    RestaurantResponseDTO getDTO(Restaurant entity);
}
