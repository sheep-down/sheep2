package com.msb.j2se.oop.testobj;

import java.io.*;

public class TestObj {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       /* testWrite();*/
        testReader();

    }
    public static void testReader() throws IOException,  ClassNotFoundException {
       //节点流
        FileInputStream fis=new FileInputStream("j2se_project/data/dog.txt");
       //处理流
        ObjectInputStream ois=new ObjectInputStream(fis);
        //读取
        Object obj=ois.readObject();
        //instanceof  obj 你是狗吗？
        if(obj instanceof Dog){
            Dog dog=(Dog) obj;
            System.out.println(dog.toString());
        }
    }
    public static void testWrite() throws IOException {
        //创建节点流 输出流 字节流==========相对路径
        FileOutputStream fos=new FileOutputStream("j2se_project/data/dog.txt");
       //处理流【基于节点流】输出流 字节流 设计模式 装饰模式
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //创建对象
        Dog dog=new Dog("来福","土狗","灰色",30);
        oos.writeObject(dog);//序列化以后存入文件
        fos.close();
        oos.close();
    }
}
