package com.itguigu.controller;

import com.itguigu.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 58212
 * @date 2019-08-31 15:34
 */
@ControllerAdvice
public class MyExceptionHandler {

    //    @ResponseBody
//    @ExceptionHandler(UserNotExistException.class)
//    public Map<String, Object> handleException(Exception e) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("code", "user.notexist");
//        map.put("message", e.getMessage());
//        return map;
//    }
    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        //传入我们自己的错误状态码 4xx 5xx
        /**
         * Integer statusCode = (Integer) request
         * getAttribute(" javax.servlet.error.status_code")
         */
        request.setAttribute("javax.servlet.error.status_code", 500);
        Map<String, Object> map = new HashMap<>();
        map.put("code", "user.notexist");
        map.put("message", "用户出错了");
        request.setAttribute("ext", map);
        //转发到/error
        return "forward:/error";
    }
}
