package com.sysco.foods.controller;

import com.sysco.foods.Dto.FoodCategoryDto;
import com.sysco.foods.error.ControllerException;
import com.sysco.foods.model.Food;
import com.sysco.foods.model.FoodCategory;
import com.sysco.foods.service.FoodCategoryService;
import com.sysco.foods.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@Controller
@RequestMapping(path="food")
public class FoodCategoryController {
    @Autowired
    FoodCategoryService foodCategoryService;

    @GetMapping(path="/get-foodcategory-all")
    public ResponseEntity<?> getAllFoodCategory () {
        try {
            return ResponseEntity.ok(foodCategoryService.getAllFoodCategory());
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ControllerException(104, "foods categories not found :", "/get-foodcategory-all/"));
        }
    }
}
