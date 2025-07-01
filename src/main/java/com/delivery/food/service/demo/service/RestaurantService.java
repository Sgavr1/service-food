package com.delivery.food.service.demo.service;

import java.util.List;

import com.delivery.food.service.demo.model.dto.restaurant.RestaurantCreateDTO;
import com.delivery.food.service.demo.model.dto.restaurant.RestaurantResponseDetailedDTO;
import com.delivery.food.service.demo.model.dto.restaurant.RestaurantUpdateDTO;
import com.delivery.food.service.demo.model.mapper.RestaurantMapper;
import org.springframework.stereotype.Service;

import com.delivery.food.service.demo.model.entity.Restaurant;
import com.delivery.food.service.demo.repository.RestaurantRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RestaurantService {
    private final RestaurantRepository repository;
    private final RestaurantMapper mapper;

    public List<RestaurantResponseDetailedDTO> getAll() {
        return repository.findAll().stream().map(mapper::getDetailedDTO).toList();
    }

    public RestaurantResponseDetailedDTO create(RestaurantCreateDTO dto) {
        Restaurant restaurant = mapper.getEntity(dto);
        restaurant.setActive(true);
        restaurant.setWork(true);

        restaurant = repository.save(restaurant);

        return mapper.getDetailedDTO(restaurant);
    }

    public RestaurantResponseDetailedDTO update(RestaurantUpdateDTO dto) {
        Restaurant restaurant = mapper.getEntity(dto);

        restaurant = repository.save(restaurant);

        return mapper.getDetailedDTO(restaurant);
    }
}