package com.djt.reg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djt.reg.domain.OrderDetail;
import com.djt.reg.service.OrderDetailService;
import com.djt.reg.mapper.OrderDetailMapper;
import org.springframework.stereotype.Service;

/**
* @author Sadness
* @description 针对表【order_detail(订单明细表)】的数据库操作Service实现
* @createDate 2022-11-25 16:29:47
*/
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail>
    implements OrderDetailService{

}




