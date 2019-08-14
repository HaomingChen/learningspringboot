package com.itguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @author Haoming Chen
 * @Springboot Application 来标注一个主程序类,说明这是一个springboot应用
 * @ImportResource Import configuration files of Spring
 */
@SpringBootApplication
//@ImportResource(locations = {"classpath:beans.xml"})
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }

    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    private static class MyViewResolver implements ViewResolver{
        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
}
