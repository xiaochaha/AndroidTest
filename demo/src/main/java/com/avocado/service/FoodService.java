package com.avocado.service;

import com.avocado.entity.Food;
import com.avocado.entity.Order;

import java.util.List;

public interface FoodService {

    //显示所有菜品
    public List<Food> allFoodList();
    //根据类别显示菜品
    public List<Food> categoryFoodList(int categoryId);
    //添加菜品
    public int addFood(Food food);
    //修改菜品
    public int updateFood(Food food);
    //删除菜品
    public int deleteFood(int fId);


}
