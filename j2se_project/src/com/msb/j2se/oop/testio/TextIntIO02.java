package com.msb.j2se.oop.testio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextIntIO02 {
    public static void main(String[] args) {
        //声明  try catch 和 finally 局部变量不相通
        FileInputStream fis=null;
        try {
            File file=new File("C://test/abc.txt");
         //创建时有可能无法创建
          fis=new FileInputStream(file);
          //读文件
            int a=-1;
            //每次从fis中读取一个字节赋值给a  如果a为-1表示读完了 读不到了
            while ((a=fis.read())!=-1) {
                //13 10 换行  回车 char将iSCSI码换为字符
                System.out.print((char)a);
            }
        } catch (IOException e) {
            e.printStackTrace();
            /*e.printStackTrace()将错误信息全部打印至控制台上展示*/
        } finally {
            try {
                //关闭
                if(fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                /*e.printStackTrace()将错误信息全部打印至控制台上展示*/
            }
        }
    }
}
