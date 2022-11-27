package com.wz.service.impl;

import com.wz.domain.Admin;
import com.wz.domain.AdminExample;
import com.wz.mapper.AdminMapper;
import com.wz.service.AdminService;
import com.wz.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public Admin login(String name, String pwd) {
        Admin admin;
        AdminExample example = new AdminExample();
        example.createCriteria().andANameEqualTo(name);
        List<Admin> admins = adminMapper.selectByExample(example);
        if (admins.size() > 0){
          admin = admins.get(0);
            String md5 = MD5Util.getMD5(pwd);

            if (md5.equals(admin.getaPass())){
                return admin;
            }
        }
        return null;
    }
}
