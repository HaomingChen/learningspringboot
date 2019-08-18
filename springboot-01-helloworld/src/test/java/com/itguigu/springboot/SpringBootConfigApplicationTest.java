package com.itguigu.springboot;

import com.itguigu.bean.Person;
import com.itguigu.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

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
    public void textToBinary() {
        System.out.println(new BigInteger(1, "Kathryn".getBytes()).toString(2));
    }

    @Test
    public void rotate() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        for (int i = nums.length - k; i < nums.length; i++) {

            int head = 0;
            int tail = 0;
            for (int j = 0; j < nums.length; j++) {
                head = j == 0 ? nums[j] : tail;
                tail = nums[(j + 1) % nums.length];
                nums[(j + 1) % nums.length] = head;
            }
        }
    }

    @Test
    public void rotateArray() {
        int[] array = {-1};
        int start = 2;
        start = start % array.length;
        array = rotateArray(array, 0, array.length);
        array = rotateArray(array, 0, start);
        array = rotateArray(array, start, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("SSSSSS:" + (9 + Integer.parseInt(String.valueOf('9'))));

    }

    public int[] rotateArray(int[] array, int head, int tail) {
        //flipTime means how many times this loop gonna run
        int flipTime = (tail - head) / 2;
        for (int i = 0; i < flipTime; i++) {
            //value to be changed from the tail to the head
            int temp = array[tail - 1];
            array[tail - 1] = array[head];
            //the value to be changed at the head
            array[head] = temp;
            head++;
            tail--;
        }
        return array;
    }

    @Test
    public void findCombinedArray() {
        String[] words = {"hello", "world", "leetcode"};
        String chars = "welldonehoneyr";

        Integer count = 0;
        HashMap<Character, Integer> charMap = stringToHashMap(chars);
        for (int i = 0; i < words.length; i++) {
            HashMap<Character, Integer> wordMap = stringToHashMap(words[i]);
            boolean flag = true;
            for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
                if (charMap.containsKey(entry.getKey())) {
                    if (charMap.get(entry.getKey()) >= entry.getValue()) {
                        continue;
                    }
                }
                flag = false;
                break;
            }
            if (flag == true) {
                count = count + words[i].length();
            }
        }
        System.out.println(count);
    }

    public HashMap<Character, Integer> stringToHashMap(String string) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charMap.containsKey(charArray[i])) {
                charMap.put(charArray[i], charMap.get(charArray[i]) + 1);
            } else {
                charMap.put(charArray[i], 1);
            }
        }
        return charMap;
    }
}

