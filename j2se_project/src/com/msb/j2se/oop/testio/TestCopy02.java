package com.msb.j2se.oop.testio;

import java.io.*;

public class TestCopy02 {
    public static void main(String[] args) {
        //创建输入流
        //创建输出流
        FileInputStream fis=null;
        FileOutputStream fos=null;
        //源文件
        File file=new File("C://test/cc.txt");
        try {
            //创建一个输入流  读取是文件一定要在
            fis=new FileInputStream(file);
            //目录
            File dir=new File("C://test/e");
            if(!dir.exists()){
                dir.mkdirs();//创建一级目录
            }
            //输出时文件不一定要在
            fos=new FileOutputStream("C://test/e/cc.txt");
            // 循环
            byte[] buf=new byte[102400];//创建数组用于装读取的数据
            //定义变量
            int len=0;
            while ((len=fis.read(buf))>0){
                //读取了多少数据就写多少数据 FAT32 NTFS
                fos.write(buf,0,len);
            }

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
