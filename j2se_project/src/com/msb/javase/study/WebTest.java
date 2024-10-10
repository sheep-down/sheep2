package com.msb.javase.study;

/**
 * 静态块的执行时机
 */
public class WebTest {
    public static void main(String[] args) {
        //凡是static 都是与类相关 与对象无关
        Web.count =10;  // 使用类的第一次

        Web w = new Web(); // 使用类的第二次   第一次创建对象
        Web w2 = new Web(); // 使用类的第三次   第二次创建对象
    }


}
