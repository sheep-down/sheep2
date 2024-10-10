package com.msb.j2se.oop.container;

import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {
    public static void main(String[] args) throws InterruptedException {
        //创建队列 指定大小
        ArrayBlockingQueue queue=new ArrayBlockingQueue(5);
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        //内容
        System.out.println(queue.size());
        //队列满了后再存会返回false
        System.out.println(queue.offer("f"));
        //取 如果没有就等
        System.out.println(queue.take());
        //取 如果没有就返回null
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println("还有多少空间:"+queue.remainingCapacity());
        System.out.println("内容还有多少："+queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
       /* System.out.println(queue.take());*/
        //等 会导致后面的代码无法运行
        System.out.println(queue.poll());

    }
}
