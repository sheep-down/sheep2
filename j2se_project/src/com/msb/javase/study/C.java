package com.msb.javase.study;

public class C {
    //成员方法
    public void a(){
        System.out.println("a---");
    }

    //静态方法
    public static void b(){
        System.out.println("b---");
    }

    //调用方法
    public void c(){
        this.a();  //调用成员方法
        b();
    }
}
