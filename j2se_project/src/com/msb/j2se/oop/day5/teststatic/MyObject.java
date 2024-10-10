package com.msb.j2se.oop.day5.teststatic;

/**
 * 静态优先级大于非静态>方法
 *
 */


public class MyObject {
    //静态属性
    static int a=test();

    //静态块
    static {
        System.out.println("静态块");
    }

    //非静态属性
    int m=test01();

/*
    public void k(){
    System.out.println(m);
}
*/

    //非静态块
    {
        System.out.println("非静态块");
    }

    //构造方法
    public MyObject(){
        System.out.println("构造方法");
    }
    public static int test(){
        System.out.println("静态属性");
        return 10;
    }
    public  static int test01(){
        System.out.println("非静态属性");
        return 10;
    }
}
