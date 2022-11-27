package com.example.test.service;

import com.example.test.common.ResultVo;

public interface StudentService {
    public ResultVo finaAllByCondiction(String name,Integer age,Integer page,Integer size);
    public ResultVo finaAll(Integer page,Integer size);
}
