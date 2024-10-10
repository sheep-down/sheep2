package com.msb.j2se.oop.testPKG01;

public class TestPKG01 {
    public static void main(String[] args) {
        int a=10;
        //提供的功能
        //包装类
        //将基本类型转化成Integer对象
        Integer intObj=new Integer(a);
        //将其转化为浮点类型
        float f=intObj.floatValue();
        //包装类包含基本数据类型的最大值和最小值以及相关的方法 sum累加
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.sum(1,2));
        System.out.println(f);
    }
}
