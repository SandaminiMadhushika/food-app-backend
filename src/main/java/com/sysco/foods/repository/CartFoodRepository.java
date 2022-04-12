package com.sysco.foods.repository;

import com.sysco.foods.model.CartFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartFoodRepository extends JpaRepository<CartFood, Long> {

}