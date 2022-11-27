package com.wz.service;

import com.wz.domain.Admin;

public interface AdminService {

    Admin login(String name, String pwd);
}
