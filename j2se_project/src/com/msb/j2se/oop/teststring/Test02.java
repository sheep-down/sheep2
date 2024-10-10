package com.msb.j2se.oop.teststring;

import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        String id="432485211523523325";
        System.out.println(id.length());

        //包前不包后 切出
        String year=id.substring(6,11);
        System.out.println(year);

        Date date=new Date();
        //Integer.parseInt(year)将里面的变量变为String类型
        int age= date.getYear() +1900-Integer.parseInt(year);

        char sex=id.charAt(16);//0:48  1:49
        System.out.println("性别"+":"+(sex%2==0?"女":"男"));
    }
}
