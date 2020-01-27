package com.itguigu.threadlocal;

/**
 * @author 58212
 * @date 2020-01-28 1:05
 */
public class Val<T> {

    T v;

    public void set(T _v){
        v = _v;
    }

    public T get(){
        return v;
    }

}
