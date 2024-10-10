package com.msb.j2se.oop.day1.teacher;

public class Teacher {
    //------------定义属性

  int age;//年龄

  String name;//姓名

    String gender;//性别

    int phone ;//手机号

    String emile;//邮箱

   //------------创造方法
   public void work(){
       System.out.println("教学");
   }

   public void work2(){
       System.out.println("解惑");
   }

//-----------构造器
    public void Teacher(){

    }//无参数

//---------带有参数
    public Teacher(int age, String name, String gender, int phone, String emile) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.emile = emile;
    }

    //---------get/set方法

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getAge(String age)
    {
        return age;
    }
    public void setAge(){
       this.age=age;
    }
    public int getPhone(){
       return phone;
    }
    public void setPhone(){
       this.phone=phone;
    }

    public Teacher(String emile) {
        this.emile = emile;
    }

    //-----------tos
}
