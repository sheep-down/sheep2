package com.msb.j2se.oop.day4.final1;

public class Test {
    public static void main(String[] args) {
double price=3;
double weight=100;
final int discount=4;//添加final(用于保护数据)
 /*   discount= 100;*///添加了final后无法在改变变量值
double money=price*weight*(discount*0.1);
        System.out.println(money);



    }
}
