package test;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestIo06 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:/test/ipone.txt"));
        String[][] strs = new String[8][];
        for (int i = 0; i < 8; i++) {
            String[] str = new String[15];
            for (int j = 0; j < 15; j++) {
                str[j] = br.readLine();
            }
            strs[i] = str;
        }
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 8; i++){
                System.out.print(strs[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}

