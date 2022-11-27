package com.example.test.mapper;


import com.example.test.domain.Student;
import com.example.test.general.GeneralDAO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper extends GeneralDAO<Student> {
    public List<Student> selectAllByPage(
            @Param("name")String name,
            @Param("age") int age ,
            @Param("start") int start,
            @Param("limit") int limit);
    public int selectCount2();
    public List<Student> selectAll2(

        @Param("start") int start,@Param("limit") int limit);
}