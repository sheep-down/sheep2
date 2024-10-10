package com.msb.j2se.oop.container;

import java.util.Stack;

/**
 * 栈
 * 先进后出
 */
public class TestStack {
    public static void main(String[] args) {
        //创建
        Stack stack=new Stack();
        //压入  后进的压在最上面
        stack.push("a");
        stack.push("b");
        stack.push("c");
        //只看一眼 （看上面的）
        System.out.println(stack.peek());
        //查看大小
        System.out.println(stack.size());
        //弹栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       /* System.out.println(stack.pop());*/
        //Exception in thread "main" java.util.EmptyStackException
        //全部弹出在进行会包空栈异常
        System.out.println("最后size:"+stack.size());
    }
}
