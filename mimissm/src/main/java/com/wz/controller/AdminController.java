package com.wz.controller;

import com.wz.domain.Admin;
import com.wz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/login")

    public String login(String name, String pwd, HttpServletRequest request){
        Admin admin = adminService.login(name, pwd);

        if (admin !=null){
            request.setAttribute("admin",admin);
            return "main";
        }else {
            request.setAttribute("errmsg","不对，重新输入");
            return "login";
        }

    }
}
