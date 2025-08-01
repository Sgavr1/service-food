package com.delivery.food.service.demo.model.dto.restaurant;

import java.util.List;

import com.delivery.food.service.demo.model.dto.food.FoodResponseDetailedDTO;

import com.delivery.food.service.demo.model.entity.DayOfWeek;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RestaurantResponseDetailedDTO {
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
    private boolean active;
    private boolean work;
    private List<FoodResponseDetailedDTO> foods;
    private List<DayOfWeek> workDays;
}
