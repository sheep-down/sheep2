package com.msb.j2se.oop.fx;

public class TestFX02 {
    public static void main(String[] args) {
        Data<Integer> data=new Data<Integer>();
        //传参
        data.message=100;
        System.out.println(data.getMessage());
        System.out.println(test(100)+1);
        System.out.println(test("100")+1);
    }
    //<T>表示这个T就是一个传入类型
    public static <T> T test(T number){
        return number;
    }
}
