package com.msb.j2se.oop.day4.final1;

public class Final {//用final修饰的类无法被继承
    int age;
    String name;
    int phone;

//final修饰后子类无法重写父类
    public final void move(){
        System.out.println("慢慢的跑");
    }
}
