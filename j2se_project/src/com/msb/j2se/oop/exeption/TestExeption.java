package com.msb.j2se.oop.exeption;

public class TestExeption {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }catch (ArithmeticException exception){
            System.out.println("除零了");
        }

        System.out.println("我会执行吗");
    }
}
