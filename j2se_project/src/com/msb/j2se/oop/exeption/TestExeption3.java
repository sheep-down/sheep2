package com.msb.j2se.oop.exeption;

public class TestExeption3 {
    public static void main(String[] args) {
        //-----------1. 有错误需要捕捉 都不需要执行
        try {
            //将可能出错的代码放入其中

        }catch (Exception e){
        //捕获出错的代码
            //也可以打印出错的代码
            // System.out.println(e.getMessage());
        }
        //---------------2.有错误需要捕捉 并且最后需要收尾
        try {
            //连接数据库  要关
            //1 打开
            //2 执行
            //连接网络
            //1 打开
            //2 传输文件

        }catch (Exception e){

        }finally {
           //释放资源
            //3 关闭
            //3 网络关闭
        }
        //------------3.无需捕捉就用try finally
        try {

        }finally {

        }



    }


}
