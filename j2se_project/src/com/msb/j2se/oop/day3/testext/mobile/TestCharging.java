package com.msb.j2se.oop.day3.testext.mobile;

public class TestCharging {
    public static void main(String[] args) {
        HNCharging hn=new HNCharging();
        int money= hn.getFlowCharging(40);
        System.out.println(money);

        String area= hn.area;
        System.out.println(area);
    }

}
