package com.msb.j2se.oop.day1.point;

import com.msb.j2se.oop.day3.testextends.C;

public class CriCle {
    //---属性
    double center;
    double radius;
    int point;
    //--构造方法

    public CriCle(){

    }


    public CriCle(double center, double radius, int point){
        this.radius=radius;
        this.center=center;
        this.point=point;
    }
    public void setPoint(int point) {
        this.point = point;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(double center) {
        this.center = center;
    }
    //-------定义方法
    //计算面积
    public double getArea(double radius){
        return Math.PI*radius*radius;
    }



}
