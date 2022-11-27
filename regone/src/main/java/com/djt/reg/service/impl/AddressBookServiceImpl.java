package com.djt.reg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djt.reg.domain.AddressBook;
import com.djt.reg.service.AddressBookService;
import com.djt.reg.mapper.AddressBookMapper;
import org.springframework.stereotype.Service;

/**
* @author Sadness
* @description 针对表【address_book(地址管理)】的数据库操作Service实现
* @createDate 2022-11-25 16:29:06
*/
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook>
    implements AddressBookService{

}




