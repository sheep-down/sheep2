package com.msb.j2se.oop.day3.polymorphism;

public class Zookeeper {

    public void move(Animal an){    //测试里面的实参传入到Animal an中.
        an.move();//动态替换
    }


    /*public void doEat(Pig pig){
        pig.move();
    }
    public void doEat(Dog dog){
        dog.move();
    }*/
}
