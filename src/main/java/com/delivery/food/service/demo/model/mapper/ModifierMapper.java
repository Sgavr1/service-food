package com.delivery.food.service.demo.model.mapper;

import com.delivery.food.service.demo.model.dto.modifier.ModifierCreateDTO;
import com.delivery.food.service.demo.model.dto.modifier.ModifierDTO;
import com.delivery.food.service.demo.model.dto.modifier.ModifierUpdateDTO;
import com.delivery.food.service.demo.model.entity.Modifier;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ModifierMapper {
    Modifier getEntity(ModifierCreateDTO dto);
    Modifier getEntity(ModifierUpdateDTO dto);
    Modifier getEntity(ModifierDTO dto);

    ModifierDTO getDto(Modifier entity);
}
