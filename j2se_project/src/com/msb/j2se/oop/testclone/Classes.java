package com.msb.j2se.oop.testclone;

public class Classes implements Cloneable{
    //班级属性
    String name;

    int qty;

    //克隆方法  -----浅克隆
    @Override
    protected Classes clone() throws CloneNotSupportedException {
        return (Classes)super.clone();
    }
}
