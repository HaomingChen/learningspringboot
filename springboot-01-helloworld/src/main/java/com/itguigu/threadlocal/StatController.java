package com.itguigu.threadlocal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 58212
 * @date 2020-01-26 23:46
 */
@RestController
public class StatController {

    //    synchronized void _add() throws InterruptedException {
//        Thread.sleep(100l);
//        c++;
//    }
    static ThreadLocal<Integer> c = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

//    @RequestMapping("/clear")
//    public Integer clear() {
//        c = 0;
//        return 1;
//    }

    @RequestMapping("/stat")
    public Integer stat() {
        return c.get();
    }

    @RequestMapping("/add")
    public Integer add() throws InterruptedException {
//        Thread.sleep(100l);
//        c++;
//        _add();
        c.set(c.get() + 1);
        return 1;
    }
}
