package com.sysco.foods.Dto;

import com.sysco.foods.model.Food;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FoodDtoTest {
    private ModelMapper modelMapper = new ModelMapper();

    @Test
    public void whenConvertFoodEntityToFoodDto_thenCorrect() {
        BigDecimal price = new BigDecimal(400);
        Food food = new Food();
        food.setQty(4);
        food.setImageUrl("https://www.wellplated.com/1/Cisquash-recipe.jpg");
        food.setName("butter");
        food.setPrice(price);

        FoodDto foodDto = modelMapper.map(food, FoodDto.class);
        assertEquals(food.getQty(), foodDto.getQty());
        assertEquals(food.getImageUrl(), foodDto.getImageUrl());
        assertEquals(food.getName(), foodDto.getName());
        assertEquals(price,foodDto.getPrice());
    }

}