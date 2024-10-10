package com.msb.j2se.oop.day1.testthis;

public class Dog {
    String nickName;
    String type;
//无参构造
    public Dog() {
    }
//构造方法
    //有参
    public Dog(String nickName, String type){
        this.nickName=nickName;
        this.type=type;
    }
    //eat方法
    public void eat(){
        System.out.println(this.nickName+"喜欢吃骨头");
    }
    public void desc(){
        System.out.println("我有一只可爱的小狗");
        this.eat();//调用eat方法
    }
}
