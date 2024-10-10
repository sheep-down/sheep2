package com.msb.j2se.oop.testlocaltime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class TestPeriod {
    public static void main(String[] args) {
        //当前时间
        LocalDate currenData=LocalDate.now();
        //入职
        LocalDate birthData=LocalDate.of(2003,3,15);
        Period period=Period.between(birthData,currenData);
        System.out.println("间隔年"+period.getYears());
        System.out.println("间隔月"+period.getMonths());
        System.out.println("间隔日"+period.getDays());

        //间隔年数



    }
}
