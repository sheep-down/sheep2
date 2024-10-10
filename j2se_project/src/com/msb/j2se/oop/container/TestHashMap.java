package com.msb.j2se.oop.container;

import java.util.HashMap;
import java.util.Set;

/***
 * hash 的key----->value
 * HashMap是一个集合，键值对的集合
 */
public class TestHashMap {
    public static void main(String[] args) {
        //创建
        HashMap map=new HashMap();
        //增
        map.put("等待","书店");
        map.put("待","书");
        map.put("等","店");
        //删
        map.remove("待");
        //改
        map.put("等待","是的");
        //查
        String name=(String) map.get("等");
        System.out.println(name);
        //改的结果
        System.out.println(map.get("等待"));
        System.out.println(map.get("待"));
/**
 * 迭代出所有的key
 * 将map中的所有key转成set集合
 */
        Set set=map.keySet();
        //每次从set中取出一个key
        for(Object obj:set){
            System.out.println(obj);
        }
  /*   for (int i=0;i<set.size();i++){
         System.out.println(set);
     }*/
    }
}
