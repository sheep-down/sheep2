package com.msb.j2se.oop.day3.testextends;

public class TestFS {
    public static void main(String[] args) {
        Son s=new Son();//创建对象

        s.like();//调用方法
        s.play();
        System.out.println(s.money);//输出参数
        System.out.println(s.house);
        System.out.println(s.friend);

    }
}
