package com.msb.j2se.oop.fx;

import java.util.ArrayList;

public class TestFX01 {
    public static void main(String[] args) {
        //容器中只能放对象类型  不能放基本数据类型
        ArrayList<Integer> list=new ArrayList<Integer>();
        //类型可控
        list.add(1);//自动装箱
        list.add(2);
        list.add(3);
        for (int i=0;i<list.size();i++){
            //不需要转型
            int obj=list.get(i);
            System.out.println(obj);
        }
    }
}
