package com.msb.j2se.oop.container;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections03 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        //给集合添加元素
        Collections.addAll(list,"sdsd","sdd");
        list.forEach(System.out::println);
        int sum=add(1,2,3,4);
        System.out.println(sum);
        System.out.println("=============");
        //替换集合的元素
        Collections.fill(list,"替换");
        list.forEach(System.out::println);
    }
    public static int add(int...array){//int...array可变参数 数组
        int sum=0;
        for(int i:array){
            sum+=i;
        }
        return sum;
    }
}
