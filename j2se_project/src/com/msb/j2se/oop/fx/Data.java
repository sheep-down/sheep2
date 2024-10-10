package com.msb.j2se.oop.fx;

/**
 * 类型
 * 可以通过参数的形式传入
 * @param <T>
 */
public class Data<T> {//泛型类
    T message;
    public T getMessage(){
        return message;
    }
}
