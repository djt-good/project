package com.djt.exception;

import com.djt.util.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectException {
    @ExceptionHandler(Exception.class)

    public Result doOther(Exception ex){
        ex.printStackTrace();
        return new Result(false,null,"系统错误，请稍后再试！！");
    }
}
