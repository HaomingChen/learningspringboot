package com.itguigu.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Haoming Chen
 * Created on 2019/6/3
 */
//这个类的所有方法返回的数据直接写给浏览器(如果是对象直接转为json格式
@Controller
@Component
public class HelloController {


    String lastWonder;

    //ConfigurationProperties实际上是根据set方法的方法名来设定该类的value, 只要LastName匹配配置文件中的lastName,
    //就可以进行属性的注入
    public String getLastTrash() {
        return lastWonder;
    }

    public void setLastName(String lastName) {
        this.lastWonder = lastName;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World " + lastWonder;
    }

    //查出一些数据，在页面展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        return "success";
    }

}
