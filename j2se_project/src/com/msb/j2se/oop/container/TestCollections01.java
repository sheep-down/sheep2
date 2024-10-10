package com.msb.j2se.oop.container;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections01 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> list=new ArrayList<String>();
        list.add("1");
        list.add("5");
        list.add("2");
        list.add("9");
        list.add("3");
        list.add("0");
        list.add("4");
        list.add("7");
        list.add("6");
        //排序
        Collections.sort(list);
        //lambda 语法糖 直接打印所有 写多少 做得多
        list.forEach(System.out::print);
        System.out.println(" ");
        System.out.println("==================");
        //随机打乱顺序
        Collections.shuffle(list);
        list.forEach(System.out::print);



    }
}
