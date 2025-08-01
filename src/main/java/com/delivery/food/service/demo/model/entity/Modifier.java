package com.delivery.food.service.demo.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "modifier")
public class Modifier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "modifier_name")
    private String name;

    public Modifier() {
    }

    public Modifier(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
