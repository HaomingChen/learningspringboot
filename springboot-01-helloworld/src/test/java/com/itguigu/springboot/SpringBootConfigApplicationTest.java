package com.itguigu.springboot;

import com.itguigu.bean.Person;
import com.itguigu.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

/**
 * SpringBoot 单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 *
 * @author Haoming Chen
 * Created on 2019/6/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigApplicationTest {
    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService() {
        Boolean ifHasHelloService = ioc.containsBean("helloServiceYes");
        Boolean ifHasHiService = ioc.containsBean("hiServiceNo");
        System.out.println("ifHasHelloService " + ifHasHelloService);
        System.out.println("ifHasHiService " + ifHasHiService);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void textToBinary(){
        System.out.println(new BigInteger(1, "Kathryn".getBytes()).toString(2));
    }
}
