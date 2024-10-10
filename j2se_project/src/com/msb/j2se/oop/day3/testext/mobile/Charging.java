package com.msb.j2se.oop.day3.testext.mobile;

public class Charging {
    String area="中国";
    protected int getFlowCharging(int number){
        return 3*number;
    }

    //子类不能重写
    private void play(){
        System.out.println("骚刚");
    }
    public final void test(){

    }
}
