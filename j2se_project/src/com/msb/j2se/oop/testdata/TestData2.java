package com.msb.j2se.oop.testdata;

import java.util.Date;

public class TestData2 {
    public static void main(String[] args) throws InterruptedException {
        Date date01=new Date();
        Thread.sleep(500);
        Date date02=new Date();
        //-------
        System.out.println(date01.before(date02));
        //-------
        System.out.println(date02.before(date01));
        //----------
        System.out.println(date01.after(date02));

    }
}
