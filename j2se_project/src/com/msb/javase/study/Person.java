package com.msb.javase.study;

/**
 * 只包含 属性及 属性相关的方法 ，没有其他方法 javabean *
 * 1、属性私有的
 * 2、空构造  其他构造器
 * 3、setter 存 与getter 取
 *
 *
 *
 */
public class Person {
    //属性   保护数据
   private String name ="abc";  //姓名

    private int age =100 ; //年龄


    public Person(){

    }

    //修改方法
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        if(a <=0){
            System.out.println("年龄不符合");
            return ;
        }
        age = a;
    }

    //获取方法
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
