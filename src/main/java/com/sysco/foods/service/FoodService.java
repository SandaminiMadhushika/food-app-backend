package com.sysco.foods.service;

import com.sysco.foods.Dto.FoodByNameDto;
import com.sysco.foods.Dto.FoodDto;
import com.sysco.foods.error.ControllerException;
import com.sysco.foods.model.Food;
import com.sysco.foods.repository.FoodRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class FoodService {

    ModelMapper mapper = new ModelMapper();

    @Autowired
    private FoodRepository foodRepository;

    public List<FoodDto> getAllFood(){
        List<Food> foodlist=foodRepository.findAll();
        List<FoodDto> foodDtos = foodlist
                .stream()
                .map(x -> mapper.map(x, FoodDto.class))
                .collect(Collectors.toList());
        return foodDtos;
    }

    public FoodByNameDto getFoodByName(String foodName){
        System.out.println("came");
            Food food = foodRepository.findByName(foodName);
            FoodByNameDto foodByNameDto = mapper.map(food, FoodByNameDto.class);
            return foodByNameDto;
    }

    public List<FoodDto> getFoodByNameLike(String foodNameString){
            List<Food> foodlist=foodRepository.findByNameStartsWith(foodNameString);
            List<FoodDto> foodDtos = foodlist
                    .stream()
                    .map(x -> mapper.map(x, FoodDto.class))
                    .collect(Collectors.toList());
            return foodDtos;
    }


}