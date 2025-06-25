package com.delivery.food.service.demo.repository;

import com.delivery.food.service.demo.model.entity.Modifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModifierRepository extends JpaRepository<Modifier, Long> {
}
