package com.djt.reg.service;

import com.djt.reg.domain.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Sadness
* @description 针对表【orders(订单表)】的数据库操作Service
* @createDate 2022-11-25 16:29:51
*/
public interface OrdersService extends IService<Orders> {
    public void submit(Orders orders);

}
