package com.msb.javase.study;

public class ComputerApp {
    public static void main(String[] args) {
        //测试 this
        Computer  computer = new Computer();
      /*  System.out.println(computer+"===》");

        Computer  computer2=new Computer();
        System.out.println(computer2+"===》");*/

        //修改了品牌的名称 "acer"
        computer.setBrand("acer");

        System.out.println(computer.getBrand());

    }
}
