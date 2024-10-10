package com.msb.j2se.oop.day5.testinnner;

public class Outer02 {

    public void test(){
        //仅限如此
        class Inner01{

            public void test(){
                System.out.println("局部内部类 在方法里面");
            }
        }
        //创建
        Inner01 inner01=new Inner01();
        inner01.test();
    }
}
