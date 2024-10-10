package com.msb.javase.study;

/**
 * 方法的使用
 * 1、特殊的方法为 main方法  --》入口点
 */
public class MethodTest {

    //入口点
    public static void main(String[] args){

        myPrint();

        int a = 10;

        System.out.println(a);

        int sum  = add(1,3);  //调用方法
        System.out.println(sum);

    }

    /**
     * 定义一个方法
     */
    public static void myPrint(){
        System.out.println("打印字符串");
        System.out.println("打印字符串");
        System.out.println("打印字符串");
        System.out.println("打印字符串");
        System.out.println("打印字符串");
        System.out.println("打印字符串");
    }

    /**
     * 求和的方法
     */
    public static int add(int a ,int b){
        return a+b;
    }
}
