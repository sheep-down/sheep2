package com.msb.j2se.oop.testbufferedreader;

public class Student {
    String name;
    String age;
    String sex;
    String high;

    public Student() {
    }

    public Student(String name, String age, String sex, String high) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.high = high;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", high='" + high + '\'' +
                '}';
    }
}
