package com.msb.j2se.oop.testclone;

public class TestStudengAndClasses {
    public static void main(String[] args) throws CloneNotSupportedException{
          Student student=new Student();

          Classes classes=new Classes();
          //打印地址
        System.out.println(classes);
        classes.name="24期";
        classes.qty=100;
        //将班级赋给学生的一个属性
        student.cls=classes;

        //浅克隆--》深克隆
        Student student1= student.clone();
        System.out.println(student1.cls);

    }
}
