package com.msb.j2se.oop.day3.testext.mobile;

public class HNCharging extends Charging{
    //如果父类有，则会替换掉
    String area="湖南";

    /**
     * 重写父类的方法
     *
     * @param number
     * @return
     */

    public int getFlowCharging(int number){
        return 1*number;
    }
}
