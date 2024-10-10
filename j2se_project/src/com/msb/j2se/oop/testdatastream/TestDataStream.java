package com.msb.j2se.oop.testdatastream;

import java.io.*;

/**
 * 基本数据流
 */
public class TestDataStream {
    public static void main(String[] args) throws Exception {
     FileInputStream fis=new FileInputStream("j2se_project/data/java.txt");
     DataInputStream dis=new DataInputStream(fis);
 /*       System.out.println(dis.readInt());
        System.out.println(dis.readChar());*/
        dis.skipBytes(6);//在没有按顺序执行的情况下
        // 想实现得把前面的字节跳过
         System.out.println(dis.readFloat());
    }
    public static void testDataWrite()throws Exception {
        FileOutputStream fos = new FileOutputStream("j2se_project/java.txt");
        DataOutputStream dis = new DataOutputStream(fos);
        dis.writeInt(123);//4给字节
        dis.writeChar('a');//2个
        dis.writeFloat(12.45F);//4个
        dis.writeShort(123);//2个
        fos.close();
        dis.close();
    }
}