package com.avocado.dao;

import com.avocado.entity.Food;
import com.avocado.entity.FoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMapper {
    long countByExample(FoodExample example);

    int deleteByExample(FoodExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(Food record);

    int insertSelective(Food record);

    List<Food> selectByExample(FoodExample example);

    Food selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByExample(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);

    List<Food> allFoodList();

    List<Food> categoryFoodList(@Param("categoryId")int categoryId);

    List<Food> discountFoodList();

    List<Food> recommendFoodList();

    int updateFoodImg(@Param("fId") int fId, @Param("fPicture") String s);
}