package com.delivery.food.service.demo.model.dto.restaurant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RestaurantResponseSummaryDTO {
    private long id;
    private String name;
}