package com.djt.reg.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djt.reg.common.CustomException;
import com.djt.reg.domain.Setmeal;
import com.djt.reg.domain.SetmealDish;
import com.djt.reg.dto.SetmealDto;
import com.djt.reg.mapper.DishFlavorMapper;
import com.djt.reg.mapper.DishMapper;
import com.djt.reg.mapper.SetmealDishMapper;
import com.djt.reg.service.SetmealDishService;
import com.djt.reg.service.SetmealService;
import com.djt.reg.mapper.SetmealMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
* @author Sadness
* @description 针对表【setmeal(套餐)】的数据库操作Service实现
* @createDate 2022-11-25 16:30:00
*/
@Service
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal>
    implements SetmealService{


    @Autowired
    SetmealDishService setmealDishService;
    @Override
    public void saveWithDish(SetmealDto setmealDto) {
        this.save(setmealDto);
        Long id = setmealDto.getId();
        List<SetmealDish> setmealDishes = setmealDto.getSetmealDishes();
        setmealDishes= setmealDishes.stream().map((item)->{
         item.setSetmealId(id);
         return item;
        }).collect(Collectors.toList());
        setmealDishService.saveBatch(setmealDishes);
    }

    @Override
    public void removeWithDish(List<Long> ids) {
        LambdaQueryWrapper<Setmeal> lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.in(Setmeal::getId,ids);
        lambdaQueryWrapper.eq(Setmeal::getStatus,1);
        int count = this.count(lambdaQueryWrapper);
         if(count >0){
             throw new CustomException("套餐售卖中，不能删除！！");
         }

         this.removeByIds(ids);
         LambdaQueryWrapper<SetmealDish> lambdaQueryWrapper1 = new LambdaQueryWrapper();
        lambdaQueryWrapper1.in(SetmealDish::getSetmealId,ids);
        setmealDishService.remove(lambdaQueryWrapper1);
    }
}




