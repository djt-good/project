package com.example.test.controller;

import com.example.test.common.ResultVo;
import com.example.test.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;

@Controller

@RequestMapping("/student")
public class StudentController {

    @Resource
    StudentService studentService;
    @RequestMapping("/selectbycondiction")
     @ResponseBody
    public ResultVo findAllbycondiction(String name,Integer age,Integer page,Integer size){
        ResultVo resultVo = studentService.finaAllByCondiction(name,age,page,size);
        return  resultVo;
    }

    @RequestMapping("/select")
    @ResponseBody
    public ResultVo findAll(Integer page,Integer size){
        ResultVo resultVo = studentService.finaAll(page,size);
        return  resultVo;
    }
}
