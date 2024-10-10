package com.msb.javase.study;

/**
 * 构造器 : new Student();
 *
 * 任何一个类 都有一个构造器
 * new 1、开辟内存空间  2、调用构造器 :数据初始化  赋值
 * 3、返回地址给引用
 */
public class Student {
    /*
      public  Student(){}
     */
    public  Student(){
        System.out.println("空构造  -->new 才会调用  初始化对象用的");
    }  //无参构造
    public static void main(String[] args) {
        Student s =   new Student(); //开辟空间  调用构造器+初始化   返回地址
        System.out.println(s);
    }

}
