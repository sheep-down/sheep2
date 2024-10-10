package com.msb.j2se.oop.day5.interfac1;

/**
 * 电脑
 */
public class Computer {

int display=2;//显示屏
    int mouse=1;//鼠标

    public void insertUSB(USB usb){//usb形参
        usb.supperPower(15);
        usb.transferData("sss");

         }
}
