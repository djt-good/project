package com.djt.reg.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djt.reg.common.CustomException;
import com.djt.reg.domain.Category;
import com.djt.reg.domain.Dish;
import com.djt.reg.domain.Setmeal;
import com.djt.reg.mapper.DishMapper;
import com.djt.reg.mapper.SetmealMapper;
import com.djt.reg.service.CategoryService;
import com.djt.reg.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sadness
 * @description 针对表【category(菜品及套餐分类)】的数据库操作Service实现
 * @createDate 2022-11-25 16:29:30
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
        implements CategoryService {
    @Autowired
    DishMapper dishMapper;

    @Autowired
    SetmealMapper setmealMapper;
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId, id);
        Integer count1 = dishMapper.selectCount(dishLambdaQueryWrapper);
        if(count1 > 0){
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, id);
        Integer count2 = setmealMapper.selectCount(setmealLambdaQueryWrapper);
        if(count2 > 0){
            //已经关联套餐，抛出一个业务异常
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }
                super.removeById(id);

    }
}




