package com.msb.j2se.oop.day3.testextends;

public class Son extends Father{
    int friend=2;

    public void test(){
        //like();
        super.like();//调用父类的Like方法
    }

    @Override
    public void like() {
        System.out.println("旅游");
    }
    public void play(){
        System.out.println("吃饭 睡觉 玩游戏");
    }
}
