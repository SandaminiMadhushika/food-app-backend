package com.sysco.foods.Dto;

import com.sysco.foods.model.Food;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FoodByNameDtoTest {
    private ModelMapper modelMapper = new ModelMapper();

    @Test
    public void whenConvertFoodByNameEntityToFoodByNameDto_thenCorrect() {
        BigDecimal price = new BigDecimal(400);
        Food food = new Food();
        food.setQty(4);
        food.setImageUrl("https://www.wellplated.com/1/Cisquash-recipe.jpg");
        food.setName("butter");
        food.setPrice(price);

        FoodByNameDto foodByNameDto = modelMapper.map(food, FoodByNameDto.class);
        assertEquals(food.getQty(), foodByNameDto.getQty());
        assertEquals(food.getImageUrl(), foodByNameDto.getImageUrl());
        assertEquals(food.getName(), foodByNameDto.getName());
        assertEquals(price,foodByNameDto.getPrice());
    }

}