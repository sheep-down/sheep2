package com.msb.j2se.oop.container;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap treeMap=new TreeMap();
        treeMap.put("a","sss");
        treeMap.put("b","sss");
        treeMap.put("c","sss");
        treeMap.put("5","sss");
        treeMap.put("e","sss");
        //把键放进去
        Set set=treeMap.keySet();
        //迭代器
        Iterator it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
