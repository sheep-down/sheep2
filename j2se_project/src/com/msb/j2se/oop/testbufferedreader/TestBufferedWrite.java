package com.msb.j2se.oop.testbufferedreader;

import java.io.*;

public class TestBufferedWrite {
    public static void main(String[] args) throws IOException {
        //节点流
        FileWriter fos=new FileWriter("j2se_project/data/student.txt");
        BufferedWriter br=new BufferedWriter(fos);
        Student student=new Student("搜索","sd","sd","dd");
        br.write(String.valueOf(student));


    }
}
