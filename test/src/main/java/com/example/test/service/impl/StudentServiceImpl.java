package com.example.test.service.impl;

import com.example.test.common.PageHelper;
import com.example.test.common.ResultVo;
import com.example.test.domain.Student;
import com.example.test.mapper.StudentMapper;
import com.example.test.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;
    @Override
    public ResultVo finaAllByCondiction(String name,Integer age,Integer page,Integer size) {
        int total = studentMapper.selectCount2();

//        List<Student> students = studentMapper.selectAll();
        int start = (page -1) * size;
        List<Student> students = studentMapper.selectAllByPage(name,age,page,size);
        int pageCount = total % size==0 ? total/size:total/size+1;

     ResultVo resultVo= new ResultVo(1,"success",new PageHelper<Student>(total,pageCount,students));
        System.out.println(resultVo);
        return resultVo;
    }

    @Override
    public ResultVo finaAll(Integer page, Integer size) {
        int total = studentMapper.selectCount2();

//        List<Student> students = studentMapper.selectAll();
        int start = (page -1) * size;
        List<Student> students = studentMapper.selectAll2(start,size);
        int pageCount = total % size==0 ? total/size:total/size+1;

        ResultVo resultVo= new ResultVo(1,"success",new PageHelper<Student>(total,pageCount,students));
        System.out.println(resultVo);
        return resultVo;
    }
}
