package com.djt.reg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djt.reg.domain.User;
import com.djt.reg.service.UserService;
import com.djt.reg.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Sadness
* @description 针对表【user(用户信息)】的数据库操作Service实现
* @createDate 2022-11-25 16:30:14
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




