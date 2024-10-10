package com.msb.j2se.oop.teststring;

public class TestString03 {
    public static void main(String[] args) {
        //concat 拼接
        String msg="人";
        String msg2="类";
        //字符串在操作时  不会改变原有的内容
        msg2=msg.concat(msg2);
        System.out.println(msg2);

        //replace 替换
        String msg3="我列个豆";
        String msg4;
        //字符串在操作时  不会改变原有的内容
        msg4=msg3.replace("豆","骚刚");
        System.out.println(msg4);

        //substring
        String msg5="bigpig@qq.com";
        //at符合在哪个位置
        int atIndex=msg5.indexOf('@');
        System.out.println(atIndex);
        String emailServer=msg5.substring(atIndex+1);
        //打印@之后的数据
        System.out.println(emailServer);
        //

    }
}
