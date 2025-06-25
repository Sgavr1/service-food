package com.delivery.food.service.demo.service;

import com.delivery.food.service.demo.repository.ModifierFoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModifierFoodService {
    private final ModifierFoodRepository repository;
}
