package com.itguigu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@EnableWebMvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry)
        //浏览器发送 /atguigu请求来到success页面
        registry.addViewController("/atguigu").setViewName("success");
    }
}
//全面接管SpringMvc配置
//public class MyMvcConfig extends WebMvcConfigurationSupport{
//
//}