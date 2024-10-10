package com.msb.j2se.oop.testarray;

public class TwoArray {
    public static void main(String[] args) {
        int [] [] arr=new int[3] [];
        arr[0]=new int[3];//0-2
        arr[1]=new int[4];//0-3
        arr[2]=new int[5];//0-4
        for (int i=0;i< args.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("=================");
        int value=arr[2][4];
        System.out.println(value);
        int[] [] score={
            {1,2,3},
            {4,5,6},
        };
        for (int i=0;i<score.length;i++){
            for (int j=0;j<score[i].length;j++){
                System.out.print(score[i][j]+" ");
            }
            System.out.println();
        }
    }
}
