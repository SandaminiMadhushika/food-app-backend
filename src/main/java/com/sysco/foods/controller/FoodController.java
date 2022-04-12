package com.sysco.foods.controller;

import com.sysco.foods.Dto.FoodDto;
import com.sysco.foods.error.ControllerException;
import com.sysco.foods.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(path = "food")
public class FoodController {
    @Autowired
    FoodService foodService;

    @GetMapping(path = "/get-food-all")
    public ResponseEntity<?> getAllFood() {
        try {
            return ResponseEntity.ok(foodService.getAllFood());
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ControllerException(103, "foods not found :", "/get-food-all/"));
        }
    }

//    @GetMapping("/get-food-by-name/{foodName}")
//    public ResponseEntity<?> getFoodByName (@PathVariable String foodName) {
////    @GetMapping(path="/get-food-by-name/{foodName}")
////    public @ResponseBody FoodByNameDto getFoodByName (@PathVariable String foodName) {
//       //try {
//        FoodByNameDto response = foodService.getFoodByName(foodName);
//        //if (response != null) {
//            return new ResponseEntity<>(response, HttpStatus.OK);
////        } else {
////            return new ResponseEntity<String>("Food not found", HttpStatus.NOT_FOUND);
////        }
////            FoodByNameDto food = foodService.getFoodByName(foodName);
////            return food;
////        }catch (Exception e){
////            throw new RecordNotFoundException(e.getMessage());
////        }
////        if(food == null) {
////            System.out.println("Null error");
////            throw new RecordNotFoundException("Invalid food name : " + foodName);
////            //return ;
////
////        }
//    }

    @GetMapping(path = "/get-food-by-name/{foodName}")
    public ResponseEntity<?> getFoodByName(@PathVariable String foodName) {
        try {
            return ResponseEntity.ok(foodService.getFoodByName(foodName));
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ControllerException(101, "food not found :" +
                            foodName, "/food/get-food-by-name/"));
        }
    }


    @GetMapping(path = "/get-food-by-name-like/{foodNameString}")
    public ResponseEntity<?> getFoodByNameLike(@PathVariable String foodNameString) {
        try {
            return ResponseEntity.ok(foodService.getFoodByNameLike(foodNameString));
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ControllerException(102, "foods not found :" +
                            foodNameString, "/get-food-by-name-like/"));
        }
    }
}

