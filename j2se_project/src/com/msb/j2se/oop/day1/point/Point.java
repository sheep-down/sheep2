package com.msb.j2se.oop.day1.point;

public class Point {
    //-------定义三个点
    int x;
    int y;
    int z;

    //------构造方法

    public Point(){

    }
    public Point(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }


    public void setX(int x){
        this.x=x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    //----------方法
    public int Getpointdistance(){

        return x*x+y*y+z*z;
    }

    public int Getpoint(Point p){

    return (x-p.x)*(x-p.x)+(y- p.y)*(y- p.y)+(z-p.z)*(z-p.z);
    }
}
