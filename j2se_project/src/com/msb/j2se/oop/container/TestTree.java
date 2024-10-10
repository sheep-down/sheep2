package com.msb.j2se.oop.container;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 按照ASCII码来排序
 */
public class TestTree {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        /*HashSet treeSet=new HashSet();*/
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("d");
        treeSet.add("5");
        treeSet.add("t");
        treeSet.add("w");
        //迭代器
        Iterator it=treeSet.iterator();
        while (it.hasNext()){
         Object obj=it.next();
            System.out.println(obj);

        }
    }
}
