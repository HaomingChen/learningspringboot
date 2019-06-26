package com.itguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

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
}
