package com.msb.j2se.oop.day3.polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal an=new Animal();
        Dog dog=new Dog();
Pig pig=new Pig();
Monkey monkey=new Monkey();
Zookeeper zookeeper=new Zookeeper();

zookeeper.move(dog);//将实参dog传入至饲养员
zookeeper.move(pig);;
    }
}
