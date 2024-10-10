package com.msb.bofanqi;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class TestFile02 {
    public static void main(String[] args) {
        File file=new File("c://music");//目录
        if(file.isDirectory()){//是否为目录
            //列出此目录的所以文件对象
            File[] files=file.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File pathname,String name) {
                    if(name.endsWith(".mp3")||name.endsWith(".MP3")){
                        return true;
                    }else {
                        return false;
                    }
                }
        });
            //打印所以的文件
            Scanner sc=new Scanner(System.in);
            boolean isRun=true;
            //声明线程
            Thread t=null;
            while (isRun){
                System.out.println("请选择歌曲编号");
                int musicIndex= sc.nextInt();
                System.out.println("正在播放"+files[musicIndex].getName());


                //如果上一次播放过的就先停再创建开始
                if(t!=null) t.stop();
                //创建一个子线程 赋给t
                t = new Thread() {
                    @Override
                    public void run() {
                        super.run();
                    }
                };
                //启动
                t.start();
            }
        }
}
}
