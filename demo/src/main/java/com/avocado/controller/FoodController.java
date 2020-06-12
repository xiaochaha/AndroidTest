package com.avocado.controller;

import com.avocado.entity.Customer;
import com.avocado.entity.Food;
import com.avocado.serviceImpl.FoodServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: ash
 * @create: 2020/06/12 17:58
 */
@RestController
@Api(tags = {"菜品管理"})
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodServiceImpl foodService;

    @ApiOperation(value = "显示所有菜品",notes = "显示所有菜品")
    @RequestMapping(value = "/allFoodList",method = RequestMethod.GET)
    public  List<Food> allFoodList() {
        return foodService.allFoodList();
    }

}

