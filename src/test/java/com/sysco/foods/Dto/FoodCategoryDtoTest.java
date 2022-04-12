package com.sysco.foods.Dto;

import com.sysco.foods.model.Food;
import com.sysco.foods.model.FoodCategory;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FoodCategoryDtoTest {
    private ModelMapper modelMapper = new ModelMapper();

    @Test
    public void whenConvertFoodCategoryEntityToFoodCategoryDtoDto_thenCorrect() {
        BigDecimal price = new BigDecimal(400);
        FoodCategory foodCategory = new FoodCategory();
        foodCategory.setName("Meat");

        FoodCategoryDto foodCategoeyDto = modelMapper.map(foodCategory, FoodCategoryDto.class);
        assertEquals(foodCategory.getName(), foodCategoeyDto.getName());
    }


}