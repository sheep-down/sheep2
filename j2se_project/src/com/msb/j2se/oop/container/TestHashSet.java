package com.msb.j2se.oop.container;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 基于hashMap
 * 是一个不允许有重复元素的集合
 * 无序
 */
public class TestHashSet {
    public static void main(String[] args) {
        //创建
        HashSet set=new HashSet();
        //增加
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        //改（先删除在加入）
        set.remove("d");//删
        set.add("f");

        //查询
        //交给迭代器
        Iterator it=set.iterator();
        //没有交给下一个
        while (it.hasNext()){
            Object obj= it.next();
            //用于存储各种键值集合和更复杂的实体。
            // 可以通过 Object() 构造函数或者使用对象字面量的方式创建对象。
            System.out.println(obj);
        }

    }
}
