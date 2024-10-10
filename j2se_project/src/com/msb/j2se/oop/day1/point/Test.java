package com.msb.j2se.oop.day1.point;

public class Test {
    public static void main(String[] args) {
          Point p1=new Point(1,2,3);


          Point p2=new Point();

          p2.setX(2);
          p2.setY(3);
          p2.setZ(4);

        System.out.println(p1.Getpointdistance());


        System.out.println(p1.Getpoint(p2));

    }
}
