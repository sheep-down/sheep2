package com.msb.javase.study;

/**
 * 学习变量: 类型 变量名  变量值
 */
public class TestVar {
    //入口点
    public static void main(String[] args){
        //变量
        //商品的数量
        int goodsNum = 5;
        //商品的价格
        double goodsPrice =99.9;
        //商品的名
        String goodsName = "内存条";

        //变量的使用
        System.out.println("----商品的信息为:---");
        System.out.println("商品的数量:"+goodsNum);
        System.out.println("商品的价格:"+goodsPrice);
        System.out.println("商品的名:"+goodsName);

        System.out.println("----商品的信息更改为:---");
        goodsNum +=1;
        goodsNum +=1;
        goodsNum +=1;
        goodsNum +=1;
        System.out.println("商品的数量:"+goodsNum);

    }
}
