package com.delivery.food.service.demo.model.dto.restaurant;

import com.delivery.food.service.demo.model.entity.Restaurant;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RestaurantUpdateDTO {
    private long id;
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
    private boolean isActive;
    private boolean isWork;
    private List<Restaurant.DayOfWeek> workDays;
}