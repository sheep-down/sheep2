package com.msb.j2se.oop.container;

import java.util.LinkedList;

public class TestLinkedLIst {
    public static void main(String[] args) {
        //创建
        LinkedList list=new LinkedList();
        //添加内容
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //添加在前面
        list.addFirst("M");
        //添加在后面
        list.addLast("S");
        //更新
        list.set(1,"ww");//在下标处添加
        //迭出所有
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
