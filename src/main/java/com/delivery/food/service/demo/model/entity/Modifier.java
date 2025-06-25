package com.delivery.food.service.demo.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "modifier")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Modifier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "modifier_name")
    private String name;
}
