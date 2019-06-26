package com.itguigu.config;

import com.itguigu.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Haoming Chen
 * Created on 2019/6/25
 * @Configuration 告诉Springboot该类为配置类, 就是来替代当前的Spring配置文件
 * 配置类 = 配置文件.xml, yml, etc..
 * <bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {
    /**
     * 将方法的返回值添加到容器中,容器中该Component的id就是方法名
     */
    @Bean
    public HelloService helloServiceYes() {
        return new HelloService();
    }
}
