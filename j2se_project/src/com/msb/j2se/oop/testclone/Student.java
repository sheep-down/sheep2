package com.msb.j2se.oop.testclone;

public class Student implements Cloneable {
    //学生属性
    String name;

    int age;

    //班级
    Classes cls;

    @Override
    protected Student clone() throws CloneNotSupportedException {
        //克隆学生
       Student stuClone= (Student) super.clone();
        //学生中的班级也克隆一份        //深克隆
        Classes classesClone=cls.clone();
        stuClone.cls=classesClone;
        return  stuClone;
    }
}
