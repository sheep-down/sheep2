package com.msb.j2se.oop.testio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutIO03 {
    public static void main(String[] args) {
        //声明
        FileOutputStream fos=null;
        try {
            //输入文件时 文件不一定要存在
            fos=new FileOutputStream("C://test/ccc.txt");
            fos.write(65);//写单个字节
            fos.write(13);//换行
            byte[] buf={48,49,50};//0 1 2
            //写入数组
            fos.write(buf);
            fos.write(13);//换行
            fos.write(buf,0,2);//数组的第o个到第2个
            String msg="abcdefj";
            byte[] buf01=msg.getBytes();
            fos.write(13);
            fos.write(buf01);
            //清空 强制输出
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos!=null){
                    //关闭
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
