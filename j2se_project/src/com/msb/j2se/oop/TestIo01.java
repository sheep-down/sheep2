package com.msb.j2se.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestIo01 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:/w/sheep.txt");
        if(file.exists()){
            System.out.println("yes");
        }
        FileReader fr=new FileReader("C:/w/sheep.txt");
        System.out.println((char) fr.read());//只打印一个
        int a=-1;
        while ((a=fr.read())!=-1){
            System.out.print((char) a);
        }
    }
}
