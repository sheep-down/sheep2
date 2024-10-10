package com.msb.containerwork.test5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 添加10名学生姓名到ArrayList中，
 * 并随机取出一个学生姓名并打印
 */
public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("换行");
        list.add("搜索");
        list.add("威威");
        list.add("5");
        list.add("呃呃");
        list.add("问问");
        int len=list.size();
        int random=(int)(Math.random()*len);
        //随机打印List里面的字符
        String name=list.get(random);
        System.out.println(name);
     /*   print();*/
    }
    public static void print(){
        String[] string={"是","是的","威威的","威威","哈哈哈","6","7"};
        //将数组转换为list
        List<String>list=Arrays.asList(string);
        int randomIndex=(int)(Math.random()*string.length);
        String str=list.get(randomIndex);
        System.out.println(str);
    }


}
