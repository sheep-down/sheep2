package com.msb.j2se.oop.container;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        //增
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        //改 下标加要更换的内容
        list.set(2,"x");

        //删
        list.remove(0);

        //查
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
