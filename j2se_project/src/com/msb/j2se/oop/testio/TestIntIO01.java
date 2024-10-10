package com.msb.j2se.oop.testio;

import javax.imageio.stream.FileCacheImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestIntIO01 {
    public static void main(String[] args) {
        try {
            //创建一个字节流对象
            FileInputStream fis=new FileInputStream("C://test/abc.txt");
            //读取文件
            int a= fis.read();
            System.out.println(a);
            //关闭
            fis.close();
        } catch (FileNotFoundException e) {
            //打印异常 存入文件 运维xxx.log【log4j工具包】
            e.printStackTrace();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
