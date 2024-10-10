package com.msb.j2se.oop.testobject;

public class TestPerson {
    public static void main(String[] args) {
        //调用重写的equals方法
        PersonChild p1=new PersonChild();
        p1.name="sheep";
        PersonChild p2=new PersonChild();
        p2.name="sheep";
        System.out.println(p1.equals(p2));


    }
}
