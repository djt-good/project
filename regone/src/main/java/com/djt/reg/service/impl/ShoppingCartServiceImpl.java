package com.djt.reg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djt.reg.domain.ShoppingCart;
import com.djt.reg.service.ShoppingCartService;
import com.djt.reg.mapper.ShoppingCartMapper;
import org.springframework.stereotype.Service;

/**
* @author Sadness
* @description 针对表【shopping_cart(购物车)】的数据库操作Service实现
* @createDate 2022-11-25 16:30:10
*/
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>
    implements ShoppingCartService{

}




