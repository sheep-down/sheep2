package com.msb.j2se.oop.testfile;

import java.io.File;

public class PrintFile {
    public static void main(String[] args) {
        printFile(new File("c://m"));

    }
    //IO
    public static void printFile(File file){
        if(file.isFile()){//=====结束
            System.out.println("file:"+file.getName());
            //文件----》拷贝动作
        }else {
            //========继续递归
            //文件夹---》创建文件夹
            System.out.println("dir:"+file.getName());
            //列出文件夹中的所以文件
            File[] files=file.listFiles();
            for(int i=0;i< files.length;i++){
                printFile(files[i]);
            }

        }
    }
}
