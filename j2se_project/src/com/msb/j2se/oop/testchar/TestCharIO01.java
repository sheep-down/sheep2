package com.msb.j2se.oop.testchar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestCharIO01 {
    //打印中文
    public static void main(String[] args) {
        FileReader fr=null;
        try {
          fr=new FileReader("C://test/abc.txt");
          int a=-1;
          while ((a=fr.read())!=-1){//两个字节中文
              System.out.print((char) a);
          }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
