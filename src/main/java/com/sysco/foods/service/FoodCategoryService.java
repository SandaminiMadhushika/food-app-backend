package com.sysco.foods.service;

import com.sysco.foods.Dto.FoodCategoryDto;
import org.modelmapper.ModelMapper;
import com.sysco.foods.model.FoodCategory;
import com.sysco.foods.repository.FoodCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class FoodCategoryService {

    ModelMapper mapper = new ModelMapper();

    @Autowired
    private FoodCategoryRepository foodCategoryRepository;

    public List<FoodCategoryDto> getAllFoodCategory(){

        List<FoodCategory> foodCategorylist=foodCategoryRepository.findAll();
        List<FoodCategoryDto> foodCategoryDto = foodCategorylist
                .stream()
                .map(x -> mapper.map(x, FoodCategoryDto.class))
                .collect(Collectors.toList());
        return foodCategoryDto;
    }
}