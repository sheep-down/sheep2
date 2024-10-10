package com.msb.j2se.oop.day3.testextends;

public class SuccessSon extends SuccessFather{
    public SuccessSon() {
        super(100);//调用父类的构造方法  并赋值
    }
    public void run(){
        System.out.println("跑步");
    }
}
