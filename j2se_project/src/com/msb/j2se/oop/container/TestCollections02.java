package com.msb.j2se.oop.container;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections02 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Integer a=10;
        list.add(1);//自动装箱  Integer a=10;
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(a);
        //二分查找 前提是有序
        int position= Collections.binarySearch(list,4);
        System.out.println(position);


    }
}
