package com.sysco.foods.repository;

import com.sysco.foods.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    public Food findByName(String foodName);
    public List<Food> findByNameStartsWith(String foodNameString);
}