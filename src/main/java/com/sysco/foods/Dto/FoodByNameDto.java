package com.sysco.foods.Dto;

import com.sysco.foods.model.FoodCategory;
import com.sysco.foods.model.Producer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FoodByNameDto {

    public String name;
    public int qty;
    public BigDecimal price;
    public String imageUrl;
    public FoodCategory category;
    public Producer producer;

}