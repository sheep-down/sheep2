package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1Copy {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream("C:/test/QQ20240902-103757.png");
             fos=new FileOutputStream("C:/test/ss.jpg");
        /*   //创建字节数组存入数据
            byte[] by = new  byte[1024];
            int len = 0;
            //边读边写 有多少给多少
            while((len = fis.read(by)) != -1) {
                fos.write(by , 0 , len);
            }*/
            int a=-1;
            while ((a=fis.read())!=-1){
                fos.write(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis!=null) {
                    fis.close();
                }
                if(fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
