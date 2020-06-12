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
}
