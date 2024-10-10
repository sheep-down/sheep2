package com.msb.j2se.oop.testchar;

import java.io.FileWriter;
import java.io.IOException;

public class TestCharIO02 {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            //追加后续文章 且不会覆盖
             fw=new FileWriter("C://test/a.txt",true);
             fw.write("顶顶顶大"+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fw!=null){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
