package com.msb.j2se.oop.day5.interfac1;

/**
 * 实现类 实现USB标准
 */
public class UDisk implements USB{
    public void supperPower(int power) {
        System.out.println("启动  电源" + power);
    }
        public void transferData(String data){
            System.out.println(data+"插入移动硬盘成功");
        }
    }

