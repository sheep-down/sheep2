package com.msb.j2se.oop.testbuffbuider;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("abc");
        sb.append(123);

        //插入
        System.out.println(sb.insert(3, 6));
        //删除
        sb.delete(5,7);//包前不包后
        System.out.println(sb);

         /* //字符串反转
        System.out.println(sb.reverse());*/
    }
}
