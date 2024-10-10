package com.msb.j2se.oop.teststring;

public class TestString01 {
    public static void main(String[] args) {
        //String类
        String str1=new String();
        String str2= new String("sheep");
        System.out.println(str2);

        //ascii A:65 a:97
        char[] chs={'A','B','C','D','E',65,97};
        String str3=new String(chs);
        System.out.println(str3);

        String str4=new String(chs,0,3);
        //offset 抵消前面的数据 count 计数 显示x个数据
        System.out.println(str4);

    }
}
