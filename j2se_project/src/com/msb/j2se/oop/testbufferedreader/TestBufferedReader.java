package com.msb.j2se.oop.testbufferedreader;

import java.io.*;

public class TestBufferedReader {
    public static void main(String[] args) throws IOException {
        //字节流
        FileInputStream fis=new FileInputStream("C:/m/诺言.lrc");
        //把字节流转换为字符流 桥接流 处理流
        InputStreamReader isr=new InputStreamReader(fis);
        //处理流 缓存流[基于节点流]增强功能
        BufferedReader br=new BufferedReader(isr);//只接受字符流
        String line=null;
        while ((line= br.readLine())!=null){
            System.out.println(line);
        }
        fis.close();
        isr.close();
        br.close();

    }
}
