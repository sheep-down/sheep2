package com.msb.javase.study;

/**
 * 使用pojo javabean
 */
public class PersonApp {

    public static void main(String[] args) {
        Person p = new Person();
       // System.out.println(p.name+"-->"+p.age);

        //p.name ="优极限";
        //p.age =18;
        //p.age = -100;
        p.setAge(-100);  //使用 setter访问器
        System.out.println(p.getName()+"-->"+p.getAge()); //使用 getter访问器
    }
}
