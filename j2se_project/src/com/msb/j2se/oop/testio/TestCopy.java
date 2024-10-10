package com.msb.j2se.oop.testio;

import java.io.*;

public class TestCopy {
    public static void main(String[] args) {
        //创建输入流
        //创建输出流
        FileInputStream fis=null;
        FileOutputStream fos=null;
       /* //剪切 在复制的基础上添加删除文件
        File file=new File("C://test/ccc.txt");*/  //源文件
        try {
           fis=new FileInputStream("C://test/cc.txt");
           fos=new FileOutputStream("C://test/test/cc.txt");
            //边读边写 循环
           int a=-1;//变量
           while ((a=fis.read())!=-1){//读取数据
               fos.write(a);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭
            try {
                if(fis!=null){
                    fis.close();
                }
                if(fos!=null){
                   fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
         /*   file.delete();*/ //只有IO流关闭后才能删除
        }
    }
}
