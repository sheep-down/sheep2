package com.msb.j2se.oop.testbuffbuider;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append(12).append("2b").append(sb);
        System.out.println(sb);

        System.out.println(sb.charAt(3));
        sb.delete(5,7);//包前不包后
        System.out.println(sb);
        System.out.println(sb.deleteCharAt(5));
    }
}
