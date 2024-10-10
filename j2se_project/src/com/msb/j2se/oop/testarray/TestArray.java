package com.msb.j2se.oop.testarray;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int [] arr={1,5,8,2,3,4};
        //排序
        Arrays.sort(arr);
        //将数组循环出来
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        //转字符串
        System.out.println(Arrays.toString(arr));

        //扩容
        int [] newArray=Arrays.copyOf(arr,10);
        System.out.println(newArray.length);
        System.out.println(Arrays.toString(newArray));

        int[] arr2={1,2,3,4,5,6};
        //二分查找的首要条件是数组有序
        int index=Arrays.binarySearch(arr2,2);
        System.out.println(index);


    }
}
