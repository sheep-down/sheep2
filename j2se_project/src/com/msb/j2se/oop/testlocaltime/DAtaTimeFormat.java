package com.msb.j2se.oop.testlocaltime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.SplittableRandom;

public class DAtaTimeFormat {
    public static void main(String[] args) {
        //SimpleDataFormat
        //格式化对象
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy年MM月");
        //创建日期对象
        LocalDateTime dateTime=LocalDateTime.now();
        //格式化
        String format= dateTime.format(formatter);
        System.out.println(format);

        //解析日期字符串
        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataStr="2020-10-01 12:12:12";
        LocalDateTime parseDate=LocalDateTime.parse(dataStr,formatter1);
        System.out.println(parseDate.getYear());
    }
}
