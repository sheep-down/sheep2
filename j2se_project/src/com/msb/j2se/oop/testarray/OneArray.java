package com.msb.j2se.oop.testarray;

public class OneArray {
    public static void main(String[] args) {
        //相同类型
        //int [] arr=new int[5];//动态初始化
        int[] arr={1,2,3,4};//静态初始化
        //赋值
        arr[0]=(int)10.0;
        //数组下标
        int index=6;
     /*   System.out.println(arr[index]);*/
        if (index>=0 && index< arr.length){
            arr[index]=100;
            System.out.println(arr[index]);
        }else {
            try {
                System.out.println(arr[index]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
