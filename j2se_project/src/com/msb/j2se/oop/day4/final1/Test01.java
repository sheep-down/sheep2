package com.msb.j2se.oop.day4.final1;

public class Test01 {
    //常量用大写
    final String DESC="12*23";//final修饰常量后需要进行赋值

    public static void main(String[] args) {
        final  double pi=3.1415926;
       /* pi=1.25;*/ //---系统本身对一些数据用final修饰，无法更改

        double r=10.23;
         double area=pi*r*r;

         //局部变量 声明可以不用赋值
        final  int ok;
        ok=12;
    /*    ok=13;*/
        //只能赋值一次
    }
}
