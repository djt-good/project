package com.djt.reg.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * ClassName: GlobalExceptional
 * Package: com.djt.reg.common
 * Description:
 *
 * @Author ????
 * @Create 2022/11/25 21:17
 * @Version 1.0
 */
@Slf4j
@ResponseBody
@ControllerAdvice(basePackages = "com.djt.reg.controller")
public class GlobalExceptional {

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public R<String> returnException(SQLIntegrityConstraintViolationException ex){
        log.error(ex.getMessage());
        if(ex.getMessage().contains("Duplicate entry")){
            String[] s = ex.getMessage().split(" ");
            return R.error(s[2]+"已存在！！！");
        }
        return R.error("未知异常！！！");
    }

    @ExceptionHandler(CustomException.class)
    public R<String> customException(CustomException ex){
        log.error(ex.getMessage());
        return R.error(ex.getMessage());
    }
}
