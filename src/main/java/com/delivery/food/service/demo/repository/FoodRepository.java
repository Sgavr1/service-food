package com.delivery.food.service.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delivery.food.service.demo.model.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

}
