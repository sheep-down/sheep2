package com.msb.j2se.oop.testchar;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;
        try {
             fr=new FileReader("C://test/abc.txt");
             fw=new FileWriter("C://test/c.txt");
             int a=-1;
             while ((a=fr.read())!=-1){
                 fw.write(a);
             }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw!=null){
                    fw.close();
                }
                if(fr!=null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
