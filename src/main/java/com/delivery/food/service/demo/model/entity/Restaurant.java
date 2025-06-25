package com.delivery.food.service.demo.model.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="restaurants")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Restaurant {
    public enum DayOfWeek { Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="restaurant_name")
    private String name;
    @Column(name="street")
    private String street;
    @Column(name="city")
    private String city;
    @Column(name="postal_code")
    private String postalCode;
    @Column(name="country")
    private String country;
    @Column(name = "phone")
    private String phoneNumber;
    @Column(name = "description")
    private String description;
    @Column(name = "time_begin_work")
    private byte timeBeginWork;
    @Column(name = "time_end_work")
    private byte timeEndWork;
    @Column(name = "latitude")
    private double latitude;
    @Column(name = "longitude")
    private double longitude;
    @OneToMany(mappedBy="restaurant")
    private List<Food> foods;
    @ElementCollection(targetClass = Restaurant.DayOfWeek.class)
    @CollectionTable(
            name = "restaurant_work_days",
            joinColumns = @JoinColumn(name = "restaurant_id")
    )
    @Enumerated(EnumType.STRING)
    @Column(name = "work_day")
    private List<DayOfWeek> workDays;
    @Column(name = "active")
    private boolean isActive;
}