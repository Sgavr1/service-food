package com.delivery.food.service.demo.repository;

import com.delivery.food.service.demo.model.entity.DayOfWeek;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.delivery.food.service.demo.model.entity.Restaurant;

import java.beans.Transient;
import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}