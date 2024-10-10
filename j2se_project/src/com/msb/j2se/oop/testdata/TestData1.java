package com.msb.j2se.oop.testdata;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class TestData1 {
    public static void main(String[] args) {
        //创建对象
        Date date=new Date();
        System.out.println(date.toLocaleString());

        //格式化类
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String dateSting= sdf.format(date);
        System.out.println(dateSting);

        //初始时间
        Date date1=new Date(0);
        //1970-1-1 8:00:00
        System.out.println(date1.toLocaleString());

        Date date2=new Date();

        long current=date2.getTime();

        Date date3=new Date(current+(24*60*60*60*1000));
        System.out.println(date3.toLocaleString());
    }
}
