package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Test2BufferedReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:/m/诺言.lrc");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        int currentIndex=0;
        String line=null;
        int wordcurrentIndex=0;
        while ((line= br.readLine())!=null){
            if(!line.trim().equals(""))//跳过空格
            {
                System.out.println(line);
                currentIndex++;
                wordcurrentIndex+=line.replace(" ","").length();
                //将文字中间的空格替换为空
            }
        }
        System.out.println("歌词一共有：" + currentIndex + "行");
        System.out.println("歌词一共有：" + wordcurrentIndex + "个");
        System.out.println();

    }
}
