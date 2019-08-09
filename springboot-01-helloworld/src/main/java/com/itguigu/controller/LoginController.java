package com.itguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

/**
 * @author Haoming Chen
 * Created on 2019/8/9
 */
@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
//    @RequestMapping(value = "/user/login",method= RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map) {
        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            return "dashboard";
        }else{
            map.put("msg","用户名密码错误");
            return "login";
        }
    }

}
