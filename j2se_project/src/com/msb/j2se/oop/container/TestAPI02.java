package com.msb.j2se.oop.container;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestAPI02 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //转换  将ArrayList中的数据转到LinkedLIst
        LinkedList<String>linkedList=new LinkedList<String>();
        linkedList.addAll(list);
        linkedList.addFirst("start");
        linkedList.addLast("end");

        for (String element:linkedList){
            System.out.println(element);
        }
        //影响后续的比较
     /*linkedList.remove(0);*/

        //比较两个容器的元素是否相同
        //看是否包容 包容输出true else false
        System.out.println(list.containsAll(linkedList));
        System.out.println(linkedList.containsAll(list));
        //contains 是否包含容器内的单个元素
        System.out.println(list.contains(linkedList.get(0)));
    }
}
