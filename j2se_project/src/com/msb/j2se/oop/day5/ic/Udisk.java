package com.msb.j2se.oop.day5.ic;

/**
 * 实现USB标准
 */

public class Udisk implements USB {
    public void supperPower(int power) {
        System.out.println("启动  电源" + power);
    }

    @Override
    public void insert(String ser) {
        System.out.println(ser + "插入移动硬盘成功");
    }
}

