package com.delivery.food.service.demo.service;

import com.delivery.food.service.demo.model.dto.modifier.ModifierCreateDTO;
import com.delivery.food.service.demo.model.dto.modifier.ModifierDTO;
import com.delivery.food.service.demo.model.dto.modifier.ModifierUpdateDTO;
import com.delivery.food.service.demo.model.entity.Modifier;
import com.delivery.food.service.demo.model.mapper.ModifierMapper;
import com.delivery.food.service.demo.repository.ModifierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModifierService {
    private final ModifierRepository repository;
    private final ModifierMapper mapper;

    public ModifierDTO create(ModifierCreateDTO dto) {
        Modifier modifier = mapper.getEntity(dto);

        modifier = repository.save(modifier);

        return mapper.getDto(modifier);
    }

    public ModifierDTO update(ModifierUpdateDTO dto) {
        Modifier modifier = mapper.getEntity(dto);

        modifier = repository.save(modifier);

        return mapper.getDto(modifier);
    }
}
