package com.djt.reg.service;

import com.djt.reg.domain.Dish;
import com.baomidou.mybatisplus.extension.service.IService;
import com.djt.reg.dto.DishDto;

/**
* @author Sadness
* @description 针对表【dish(菜品管理)】的数据库操作Service
* @createDate 2022-11-25 16:29:35
*/
public interface DishService extends IService<Dish> {

    public boolean saveWithFlavor(DishDto dishDto);

    public DishDto getByIdWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto) ;
}
