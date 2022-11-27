package com.djt.reg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djt.reg.domain.Employee;
import com.djt.reg.service.EmployeeService;
import com.djt.reg.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author Sadness
* @description 针对表【employee(员工信息)】的数据库操作Service实现
* @createDate 2022-11-25 16:29:43
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

}




