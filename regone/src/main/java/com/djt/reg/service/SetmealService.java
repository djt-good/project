package com.djt.reg.service;

import com.djt.reg.domain.Setmeal;
import com.baomidou.mybatisplus.extension.service.IService;
import com.djt.reg.dto.SetmealDto;

import java.util.List;

/**
* @author Sadness
* @description 针对表【setmeal(套餐)】的数据库操作Service
* @createDate 2022-11-25 16:30:00
*/
public interface SetmealService extends IService<Setmeal> {

    public void saveWithDish(SetmealDto setmealDto);
    public void  removeWithDish(List<Long> ids);

}
