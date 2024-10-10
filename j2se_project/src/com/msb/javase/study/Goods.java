package com.msb.javase.study;

/**
 * 商品类型 : 自定义的类型   : 大盒子里面放很多小盒子
 *
 * 造类型
 */
public class Goods {
    //属性  -->存储数据      成员属性  成员变量
    //商品的数量
    int goodsNum = 5;
    //商品的价格
    double goodsPrice =99.9;
    //商品的名
    String goodsName = "内存条";


    //方法  -->行为      成员方法
    public void sale(){
        System.out.println(goodsName+"售卖中");
    }
}
