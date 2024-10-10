package com.msb.javase.study;

/**
 * 电脑类
 * 1、品牌
 * 2、价格
 *
 * this : 对象本身
 * 区分 形参与属性同名
 */
public class Computer {
    //成员属性
    private String brand; //品牌
    private double price ;//价格


    public Computer(){

    }

    //存储数据  this.
    public void setBrand1(/*Computer this,*/String b){
        //brand = brand;
        /*this.*/brand = b;
       // this.brand = brand;
    }

    public void setBrand2(/*Computer this,*/String brand){
        brand = brand;
    }

    //形参与属性同名 加入this.   表示访问属性
    public void setBrand(/*Computer this,*/String brand){
        this.brand = brand;
    }
    //访问数据
    public String getBrand(){
        return brand;
    }




    {
        System.out.println("成员块 构造块"+this);
    }



}
