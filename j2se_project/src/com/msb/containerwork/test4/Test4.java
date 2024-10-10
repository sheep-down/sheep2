package com.msb.containerwork.test4;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 创建一个字符串数组，数组中装有10名学生的姓名
 * 将10名学员添加到队列尾部，然后从队列顶端将学员姓名取出并打印。
 */
public class Test4 {
    public static void main(String[] args) {
        String[] strings={"1","2","3","4","5","6","7","8","9","10"};
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<String>(10);
        for (String str:strings){
            queue.add(str);
            //取出
            System.out.println(queue.poll());
        }
    }
}
