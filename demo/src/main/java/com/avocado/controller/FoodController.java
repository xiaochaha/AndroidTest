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

}

