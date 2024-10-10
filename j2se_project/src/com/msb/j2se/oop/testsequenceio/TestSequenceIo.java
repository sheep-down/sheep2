package com.msb.j2se.oop.testsequenceio;

import com.msb.j2se.oop.day3.testextends.B;
import com.sun.javafx.css.converters.URLConverter;

import javax.sound.midi.Sequence;
import java.io.*;

public class TestSequenceIo {
    /**
     * 序列流
     */
    public static void main(String[] args)throws  Exception {
        FileInputStream fis1 = new FileInputStream("C:test/c.txt");
        FileInputStream fis2 = new FileInputStream("C:test/ca.txt");
        BufferedInputStream br = new BufferedInputStream(fis1);
        BufferedInputStream br2 = new BufferedInputStream(fis2);
        SequenceInputStream sis = new SequenceInputStream(br, br2);
     /*   //当这两个文件中存在字符时 合并时可创建一个新的文件存放
        FileOutputStream fos=new FileOutputStream("C:test/ccc.txt");*/
        InputStreamReader isr=new InputStreamReader(sis);
        int a = -1;
        while ((a = isr.read()) != -1) {
            //边读边写
            System.out.print((char) a);
        }


    }
}

 /*   FileInputStream fis=new FileInputStream("C:test/l.txt");
    FileInputStream fis02=new FileInputStream("C:test/t.txt");
    //序列流  功能 合并
    SequenceInputStream sis=new SequenceInputStream(fis,fis02);
    //循环 读取
    int a=-1;
        while ((a=sis.read())!=-1){
        System.out.println((char) a);
    }
    //关闭
        fis.close();
        fis02.close();
        sis.close();
}*/