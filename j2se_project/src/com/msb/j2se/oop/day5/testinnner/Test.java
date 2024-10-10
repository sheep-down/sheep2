package com.msb.j2se.oop.day5.testinnner;

public class Test {
    public static void main(String[] args) {
        Outer02 outer02=new Outer02();
        outer02.test();

Outer01.Inner inner=new Outer01().new Inner();

inner.test();
        Out03 out03=new Out03() {//匿名内部类
            @Override
            public void test() {
                System.out.println("out03");
            }
        };
        out03.test();
    }
}
