package com.msb.containerwork.test7;

import java.util.Stack;

/**
 * 找到最新入职员工的姓名并打印
 * 打印入职员工的数量
 * 找到公司第一个入职的员工并打印
 */
public class Test7 {
    public static void main(String[] args) {
        String[] strings={"王生安", "李鑫灏", "薛佛世", "蔡壮保", "钱勤堃"};
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<strings.length;i++){
            stack.push(strings[i]);
        }
        //找到最新入职员工的姓名并打印
        System.out.println("最新入职员工的姓名:"+stack.peek());
        //打印入职员工的数量
        System.out.println("员工数量:"+stack.size());
        //找到公司第一个入职的员工并打印
        int len=stack.size();
        for (int i=0;i<len;i++){
            String name=stack.pop();
            if(i==len-1)
                System.out.println("第一个员工:"+name);
            }
        }

    }

