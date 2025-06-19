package com.delivery.food.service.demo.service;

import com.delivery.food.service.demo.model.dto.food.FoodCreateDTO;
import com.delivery.food.service.demo.model.dto.food.FoodResponseDetailedDTO;
import com.delivery.food.service.demo.model.dto.food.FoodResponseSummeryDTO;
import com.delivery.food.service.demo.model.dto.food.FoodUpdateDTO;
import com.delivery.food.service.demo.model.entity.Food;
import com.delivery.food.service.demo.model.mapper.FoodMapper;
import com.delivery.food.service.demo.repository.FoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FoodService {
    private final FoodRepository repository;
    private final FoodMapper mapper;

    public List<FoodResponseDetailedDTO> getAll(){
        return repository.findAll().stream().map(mapper::getDetailedDTO).toList();
    }

    public FoodResponseSummeryDTO create(FoodCreateDTO dto){
        Food food = mapper.getEntity(dto);

        System.out.println(food.getRestaurant().getId());
        food = repository.save(food);

        return mapper.getSummeryDTO(food);
    }

    public FoodResponseSummeryDTO update(FoodUpdateDTO dto){
        Food food = repository.save(mapper.getEntity(dto));

        return mapper.getSummeryDTO(food);
    }
}