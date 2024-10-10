package com.msb.j2se.oop.testfile;

import java.io.File;
import java.io.FilenameFilter;

public class TestFile02 {
    public static void main(String[] args) {
        File file=new File("c://m");//目录
        if(file.isDirectory()){
            //列出此目录当中的所有文件对象
            File[] files=file.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    if(name.endsWith(".mp3")||name.endsWith(".MP3")){
                        return true;
                    }else
                    {
                        return false;
                    }
                }
            });
            for(int i=0;i<file.length();i++){
                System.out.println(files[i].getName());
            }
        }
    }
}
