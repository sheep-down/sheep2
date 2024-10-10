package com.msb.j2se.oop.testPKG01;

public class TestInteger01 {
    public static void main(String[] args) {
        //自动装箱
        //去catch缓存里面的值调用
        //范围-128----127
        Integer intObj1=12315;
        //转为浮点类型
       /* System.out.println(intObj1.floatValue());*/
        Integer intObj2=12315;
        //在-128---127范围内都为true 之外为false
        System.out.println(intObj1==intObj2);
    }
}
