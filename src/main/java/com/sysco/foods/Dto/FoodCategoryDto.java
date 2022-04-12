package com.sysco.foods.Dto;

import com.sysco.foods.model.Food;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FoodCategoryDto {

    public String name;
    private List<Food> foods;

}