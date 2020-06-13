package com.avocado.service;

import com.avocado.entity.Food;

import java.util.List;

public interface FoodService {

    //显示所有菜品
    public List<Food> allFoodList();
    //根据类别显示菜品
    public List<Food> categoryFoodList(int categoryId);
    //添加菜品

    //修改菜品

    //删除菜品

}
