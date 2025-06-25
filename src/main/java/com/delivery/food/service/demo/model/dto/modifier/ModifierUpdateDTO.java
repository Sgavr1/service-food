package com.delivery.food.service.demo.model.dto.modifier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ModifierUpdateDTO {
    private long id;
    private String name;
}
