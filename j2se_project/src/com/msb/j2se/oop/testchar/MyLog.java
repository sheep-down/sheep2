package com.msb.j2se.oop.testchar;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyLog {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            //引入输出流
            Scanner scanner=new Scanner(System.in);
            fw=new FileWriter("C://test/ca.txt",true);
            System.out.println("记录下你今天的生活吧");

            //格式化日期  创建当前日期 格式化 格式
            String datetime= LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
            fw.write(datetime+"\n");

            while (true){
                String line=scanner.next();
                //不计大小写
                if(line.equalsIgnoreCase("exit")){
                    break;
                }
                fw.write(line+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
