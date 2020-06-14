package com.avocado.controller;

import com.avocado.entity.Food;
import com.avocado.serviceImpl.FoodServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @ApiOperation(value = "显示类别菜品",notes = "显示类别菜品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "categoryId", value = "类别ID", required = false, dataType = "int"),
    })
    @RequestMapping(value = "/categoryFoodList",method = RequestMethod.GET)
    public  List<Food> categoryFoodList(@RequestParam int categoryId) {
        return foodService.categoryFoodList(categoryId);
    }

    @ApiOperation(value = "显示折扣菜品",notes = "显示所有菜品")
    @RequestMapping(value = "/discountFoodList",method = RequestMethod.GET)
    public  List<Food> discountFoodList() {
        return foodService.discountFoodList();
    }

    @ApiOperation(value = "显示推荐菜品",notes = "显示所有菜品")
    @RequestMapping(value = "/recommendFoodList",method = RequestMethod.GET)
    public  List<Food> recommendFoodList() {
        return foodService.recommendFoodList();
    }

    @ApiOperation(value = "添加菜品",notes = "用户添加订单")
    @RequestMapping(value = "/addFood",method = RequestMethod.POST)
    public int addFood(@ApiParam Food food) {
        return foodService.addFood(food);
    }

    @ApiOperation(value = "修改一个菜品",notes = "修改一个菜品")
    @RequestMapping(value = "/updateFood",method = RequestMethod.POST)
    public int updateFood(@ApiParam Food food) {
        return foodService.updateFood(food);
    }

    @ApiOperation(value = "删除一个菜品",notes = "删除一个菜品")
    @RequestMapping(value = "/deleteFood",method = RequestMethod.DELETE)
    public int deleteFood(@RequestParam int fId) {
        return foodService.deleteFood(fId);
    }

}

