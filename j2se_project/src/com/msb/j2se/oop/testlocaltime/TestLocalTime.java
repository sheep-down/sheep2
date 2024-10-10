package com.msb.j2se.oop.testlocaltime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocalTime {
    public static void main(String[] args) {
        //创建时间
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.getHour());

        //当前日期
        LocalDate date=LocalDate.now();
        System.out.println(date);
        System.out.println(date.getYear()-Integer.parseInt("1999"));
        System.out.println(date.getMonth());
        //月的值
        System.out.println(date.getMonthValue());


        //创建日期时间对象
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("今年的第几天:"+dateTime.getDayOfYear());
        //星期几
        System.out.println(dateTime.getDayOfWeek());

    }
}
