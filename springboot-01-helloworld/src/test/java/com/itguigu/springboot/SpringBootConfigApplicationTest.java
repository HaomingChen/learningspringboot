package com.itguigu.springboot;

import com.itguigu.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

    @Test
    public void contextLoads(){
        System.out.println(person);
    }
}
