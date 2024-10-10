package com.msb.j2se.oop.day1.testpkg;

public class DatabaseConfig {
    String driveName; //成员属性


    //静态块
    static {
        //静态块 当类加载时执行
        System.out.println("类加载执行");

    }
    //非静态块
    {//创建对象时提前执行
        System.out.println("????");

    }
    /**
     * 构造方法
     */
    public DatabaseConfig(){
        System.out.println("创建对象时执行");
    }
}
