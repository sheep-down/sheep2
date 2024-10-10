package com.msb.j2se.oop.container;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections04 {
    public static void main(String[] args) {
        //列表中有对象<Dog> 泛型
        ArrayList<Dog> dogList=new ArrayList<Dog>();
        dogList.add(new Dog("小黑1","黑色"));
        dogList.add(new Dog("小黑2","黑色"));
        dogList.add(new Dog("小黑3","黑色"));
        dogList.add(new Dog("小黑4","黑色"));
        //每次从dogList中取一个出来print打印【默认调用toString方法】
        dogList.forEach(System.out::println);
        System.out.println(" ");
        Dog obj=dogList.get(0);
        System.out.println(obj);

    }
    public static class Dog{
        private String nickName;
        private String color;

        public Dog() {
        }

        public Dog(String nickName, String color) {
            this.nickName = nickName;
            this.color = color;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "nickName='" + nickName + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

}
