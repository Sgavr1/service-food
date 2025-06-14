package com.delivery.food.service.demo.model.dto.restaurant;

import java.util.List;

import com.delivery.food.service.demo.model.entity.Food;

import com.delivery.food.service.demo.model.entity.Restaurant;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RestaurantCreateDTO {
    private String name;
    private String street;
    private String city;
    private String postalCode;
    private String country;
    private String phoneNumber;
    private String description;
    private byte timeBeginWork;
    private byte timeEndWork;
    private double latitude;
    private double longitude;
    private List<Restaurant.DayOfWeek> workDays;
}