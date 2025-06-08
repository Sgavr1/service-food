package com.delivery.food.service.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.delivery.food.service.demo.model.entity.Restaurant;
import com.delivery.food.service.demo.repository.RestaurantRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RestaurantService {
    private final RestaurantRepository repository;

    public List<Restaurant> getAll(){
        return repository.findAll();
    }
}
