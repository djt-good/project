package com.djt.reg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djt.reg.domain.DishFlavor;
import com.djt.reg.service.DishFlavorService;
import com.djt.reg.mapper.DishFlavorMapper;
import org.springframework.stereotype.Service;

/**
* @author Sadness
* @description 针对表【dish_flavor(菜品口味关系表)】的数据库操作Service实现
* @createDate 2022-11-25 16:29:39
*/
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor>
    implements DishFlavorService{

}




