package com.avocado.serviceImpl;


import com.avocado.dao.FoodMapper;
import com.avocado.entity.Food;
import com.avocado.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: ash
 * @create: 2020/06/12 17:53
 */
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<Food> allFoodList() {
        return foodMapper.allFoodList();
    }

    @Override
    public List<Food> categoryFoodList(int categoryId) { return foodMapper.categoryFoodList(categoryId); }

    @Override
    public List<Food> discountFoodList() {
        return foodMapper.discountFoodList();
    }

    @Override
    public List<Food> recommendFoodList() {
        return foodMapper.recommendFoodList();
    }

    @Override
    public int addFood(Food food) { return foodMapper.insert(food); }

    @Override
    public int updateFood(Food food) {
        return foodMapper.updateByPrimaryKeySelective(food);
    }

    @Override
    public int deleteFood(int fId) {
        return foodMapper.deleteByPrimaryKey(fId);
    }

    @Override
    public int updateFoodImg(int fId, String s) {
        return foodMapper.updateFoodImg(fId,s);
    }


}
