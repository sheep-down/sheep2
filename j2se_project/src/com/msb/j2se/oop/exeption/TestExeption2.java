package com.msb.j2se.oop.exeption;

public class TestExeption2 {
    public static void main(String[] args) {//main是主线程

        try {
           /* String str="sds";*/
            String str=null;
            //空指针异常
            System.out.println(str.length());
            System.out.println("ok");
        }catch (NullPointerException e){
            //打印所有的错误信息
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            //最终执行
            System.out.println("最终执行");
        }

    }
}
