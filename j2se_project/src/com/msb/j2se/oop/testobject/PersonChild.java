package com.msb.j2se.oop.testobject;

import java.util.Objects;

public class PersonChild extends Person {
    int age;
    String name;

    @Override
    public String toString() {
        return name + ':' + age;
    }
    //重写比较方法  按照主观意识来写

    @Override
    public boolean equals(Object o) {
   //外面的对象
        PersonChild p= (PersonChild) o;//强制转换类型
        if(p.age==age&&p.name.equals(name)){
            return true;
        }else {
            return false;
        }
    }

}



