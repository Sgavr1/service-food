package com.delivery.food.service.demo.service;

import com.delivery.food.service.demo.repository.FoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FoodService {
    private final FoodRepository repository;

    
}