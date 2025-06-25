package com.delivery.food.service.demo.service;

import com.delivery.food.service.demo.repository.ModifierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModifierService {
    private final ModifierRepository repository;
}
