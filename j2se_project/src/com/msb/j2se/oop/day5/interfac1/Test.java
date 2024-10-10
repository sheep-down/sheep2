package com.msb.j2se.oop.day5.interfac1;

public class Test {
    //入口点
    public static void main(String[] args) {
        //电脑
        Computer c=new Computer();
        //移动硬盘
        UDisk uDisk=new UDisk();
        //插入电脑
        c.insertUSB(uDisk);
    }
}
