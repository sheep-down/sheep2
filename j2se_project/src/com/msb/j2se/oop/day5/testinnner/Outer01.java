package com.msb.j2se.oop.day5.testinnner;

public class Outer01 {
    int a=10;
    public void test(){

    }
   /* public void test(){
        System.out.print(b);
    }*/
//里面的能用外面的，外面不能用里面的
    class Inner{
        int b;
        public void test(){
            System.out.println(a);
            //成员内部类
        }
    }
}
