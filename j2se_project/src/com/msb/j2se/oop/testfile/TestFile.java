package com.msb.j2se.oop.testfile;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\MSB\\j2se_project\\ssss");
        System.out.println(file.exists());//存在文件吗
        System.out.println(file.isHidden());//文件隐藏了吗
        System.out.println(file.canWrite());//不能写 只读

        File file1=new File("D:\\MSB\\j2se_project\\ssss");
        if(!file1.exists()){
            file1.createNewFile();//创建文件
        }else {
            //file1.delete()  删除
        }
    }
}
