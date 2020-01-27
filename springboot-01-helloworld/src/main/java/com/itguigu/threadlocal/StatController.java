package com.itguigu.threadlocal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.HashSet;

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
    //利用set保存各个线程Val c的引用
    synchronized static void addSet(Val<Integer> v){
        set.add(v);
    }

    static HashSet<Val<Integer>> set = new HashSet<>();
    static ThreadLocal<Val<Integer>> c = new ThreadLocal<Val<Integer>>() {
        @Override
        protected Val<Integer> initialValue() {
            Val<Integer> v = new Val<>();
            v.set(0);
            //若多个线程对该set进行添加操作 -> 可能添加到同一个index中 此处set为临界区
            addSet(v);
            return v;
        }
    };

//    @RequestMapping("/clear")
//    public Integer clear() {
//        c = 0;
//        return 1;
//    }

    @RequestMapping("/stat")
    public Integer stat() {
        return set.stream().map(x -> x.get()).reduce((a, x) -> a + x).get();
    }

    @RequestMapping("/add")
    public Integer add() throws InterruptedException {
//        Thread.sleep(100l);
//        c++;
//        _add();
//        c.set(c.get() + 1);
        Thread.sleep(100);
        Val<Integer> v = c.get();
        v.set(v.get() + 1);
        return 1;
    }
}
