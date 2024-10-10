package test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Test3FileWriter {

    public static void main(String[] args) throws IOException {
        FileWriter fw=null;
        try {
            fw=new FileWriter("C:test/c.txt",true);//true 追加内容
            //时间初始化
            String datetime=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
            //输出
            fw.write("今天是"+datetime+"\n");
            while (true){
                Scanner scanner=new Scanner(System.in);
                String line=scanner.nextLine();
                if (line.equalsIgnoreCase("exit")) break;
                fw.write(line+"\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fw.close();

        }
    }
    }
