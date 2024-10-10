package com.msb.j2se.oop.day4.chouxiang;

public class Dog extends Animal{
//-----------继承的父类是抽象类，必须对该抽象类的内容进行

    @Override
    public void shout() {
        System.out.println("跑到酷酷酷");
    }
}
