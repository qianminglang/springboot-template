package com.clear.config;

import com.clear.exception.ClearArgumentException;
import com.clear.param.Response;
import com.mysql.cj.exceptions.CJException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * ClassName ControllerAdvice
 * 异常处理信息类
 *
 * @author qml
 * Date 2020/8/14 10:59
 * Version 1.0
 **/
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {



    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Response<String> handleException(NoHandlerFoundException e){
        log.error("NoHandlerFoundException异常:{}",e.getMessage());
        return new Response<>(false,e.getMessage());
    }

    /**
     * 主动V抛出的异常
     *
     * @param e
     * @return com.clear.param.Response<java.lang.String>
     * @author 3Clear1
     * @date 2020/8/23 13:26
     **/
    @ExceptionHandler(value = ClearArgumentException.class)
    @ResponseBody
    public Response<String> exceptionHandler(ClearArgumentException e) {
        log.error("发生异常：{}", e.getMessage());
        return new Response(false, e.getMessage());
    }

    /**
     * 操作数据或库出现异常
     */
    @ExceptionHandler(value = CJException.class)
    @ResponseBody
    public Response<String> handleException(CJException e) {
        log.error("操作数据库出现异常:", e);
        return new Response(false, e.getMessage());
    }

    /**
     * 捕获所有异常
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response<String> handleException(Exception e) {
        log.error("Exception异常:{}",e.getMessage());
        return new Response(false, e.getMessage());
    }

}