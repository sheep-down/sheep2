package com.msb.j2se.oop.container;

import java.util.*;

public class TestAPI01 {
    public static void main(String[] args) {
        //指定类型<String>
        ArrayList<String> list=new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
       /* list.add(123);*/
        //限制类型
        //增强for循环 类型 变量名: 集合
        for(String element:list){
            System.out.println(element);
        }
        System.out.println("===============");
        HashSet<String> set=new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        //增强for循环
        for (String element:set){
            System.out.println(element);
        }
     /*   Iterator it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
        System.out.println("===========");
        //按ASCII码排序
        /*reeMap<String,String> map=new TreeMap<String,String>();*/
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("w","q");
        map.put("a","c");
        map.put("b","d");
        //取得键 值组合
        //a=b a=c b=d
        Set<Map.Entry<String,String>>entrySet= map.entrySet();
        //Set(entry【key,value】) 把键 值放到entry里面
        // 增强for循环
        for (Map.Entry entry:entrySet){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
