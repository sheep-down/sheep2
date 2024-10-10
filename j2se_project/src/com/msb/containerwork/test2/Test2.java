package com.msb.containerwork.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 2.假如有以下email字串数据“aa@sohu.com,bb@163.com,cc@sina.com”
 现需要把email中的用户部分和邮件地址部分分离
 【使用字符串的split方法进行切割】，
 分离后以键值对应的方式放入HashMap
 */
public class Test2 {
    public static void main(String[] args) {
        String a= "aa@sohu.com,bb@163.com,cc@sina.com";
        //使用字符串的split方法进行切割
        String[] str=a.split(",");
        for (String s:str){
            String[] s1=s.split("@");
                HashMap<String,String>map=new HashMap<String,String>();
               map.put(s1[0],s1[1]);
                Set<Map.Entry<String,String>>set= map.entrySet();
                for (Map.Entry m1:set){
                    System.out.println(m1.getKey()+"邮箱地址为"+m1.getValue());
                }
        }





    }
}
