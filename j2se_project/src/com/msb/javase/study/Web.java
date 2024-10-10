package com.msb.javase.study;

/**
 *
 * 网站的点击量
 */
public class Web {
    //静态属性
    static int count = 0;  //点击量   与每个网页无关

    static{
        //执行时间: 使用类的使用  加载类  仅执行一次
        System.out.println("静态块 static");

    }


    {
        System.out.println("非静态块 成员块  创建对象时调用");
    }

    //成员属性
    String title ="";  //标题    与每个网页有关
    int num  =0;  //字符数     与每个网页有管



}
